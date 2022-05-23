package ar.edu.unlp.info.oo1.distribuidoraElectrica;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
public class Usuario {
	private String domicilio;
	private String nombre;
	private List<Consumo> mediciones;
	private List<Factura> facturas;
	
	public Usuario(String domicilio,String nombre) {
		this.domicilio=domicilio;
		this.nombre=nombre;
		this.mediciones=new ArrayList<Consumo>();
	}
	public void agregarMedicion(Consumo medicion) {
		this.mediciones.add(medicion);
	}
	public double ultimoConsumoActiva() {
		return this.ultimoConsumoAsOptional()
			.map((Consumo c) -> c.getConsumoDeEnergiaActiva())
			.orElse(0d);
	}

	/**
	 * Retorna el Ãºltimo consumo o null en caso que no exista
	 * @return
	 */
	public Consumo ultimoConsumo() {
		return this.ultimoConsumoAsOptional().orElse(null);
	}	
	
	/**
	 * Retorna un Optional, dependiendo si hay o no consumos.
	 * @return
	 */
	private Optional<Consumo> ultimoConsumoAsOptional() {
		//retorna un Optional ya que puede no tener consumos
		return this.mediciones
			.stream()
			.max((Consumo c1, Consumo c2) -> c1.getFecha().compareTo(c2.getFecha()));
	}
	
	public Factura facturarEnBaseA(double precio) {
		Consumo ultimo=this.ultimoConsumo();
		if (ultimo ==null) {
			return new Factura(0,0,this);
		}
		double descuento=0;
		if (ultimo.factorDePontencia() >= 0.8) {
			descuento=10;
		}
		return new Factura(ultimo.costoEnBaseA(precio),descuento,this);
	}
}
