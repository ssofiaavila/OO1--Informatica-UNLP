package ar.edu.unlp.info.oo1.balanzaElectronica;
import java.time.LocalDate;
public class Ticket extends Object {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;	
	private double precioTotal;
	
	
	public Ticket(){
		this.fecha=LocalDate.now();
		this.cantidadDeProductos=0;
		this.pesoTotal=0;
		this.precioTotal=0;
	}


	public LocalDate getFecha() {
		return fecha;
	}
	public void agregarProducto(double peso, double precio) {
		this.pesoTotal=this.pesoTotal+peso;
		this.precioTotal=this.precioTotal+precio;
		this.cantidadDeProductos++;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}


	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}


	public double getPesoTotal() {
		return pesoTotal;
	}


	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}


	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	//METODOS
	public double impuesto(){
		return 21*this.getPrecioTotal()/100;

	}
	
	
	
}
