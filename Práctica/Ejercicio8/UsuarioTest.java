package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {
	private Usuario sofia;
	private Consumo enero,febrero,marzo;
	
	@BeforeEach
	public void setUp() {
		this.sofia= new Usuario("Quilmes","Sofia Avila");
		this.enero = new Consumo(LocalDate.of(2021, 1, 1) , 100, 300);
		this.febrero = new Consumo(LocalDate.of(2021, 2, 1) , 400, 100);
		this.marzo = new Consumo(LocalDate.of(2021, 3, 1) , 800, 100);
		
		this.sofia.agregarMedicion(enero);
		this.sofia.agregarMedicion(febrero);
		this.sofia.agregarMedicion(marzo);
	}
	@Test 
	public void testUltimoConsumoActiva() {
		assertEquals(800,this.sofia.ultimoConsumoActiva());
		
	}
	public void testFacturarEnBaseA() {
		Factura result= this.sofia.facturarEnBaseA(20);
		assertEquals(8000, result.getMontoEnergiaActiva());
		assertEquals(10, result.getDescuento());
		assertEquals(LocalDate.now(),result.getFecha());
	}
	@Test
	public void testAgregarMedicion() {
		Consumo ultimoConsumo = new Consumo(LocalDate.of(2021, 5, 8), 500, 5000);
		this.sofia.agregarMedicion(ultimoConsumo);
		assertEquals(ultimoConsumo, this.sofia.ultimoConsumo());
	}
}
