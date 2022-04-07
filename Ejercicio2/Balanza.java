package ar.edu.unlp.info.oo1.balanzaElectronica;

public class Balanza extends Object {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private Ticket ticket;
	
	
	public Balanza() {
		this.cantidadDeProductos=0;
		this.precioTotal=0;
		this.pesoTotal=0;	
		this.ticket= new Ticket();
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}
	
	//METODOS
	public void ponerEnCero() {
		this.pesoTotal=0;		
	}
	public void agregarProducto(Producto prod) {
		this.precioTotal=this.precioTotal+ prod.getPrecio();
		this.cantidadDeProductos++;
		this.pesoTotal=getPesoTotal()+ prod.getPeso();
		ticket.agregarProducto(prod.getPeso(), prod.getPrecio());
		
	}
	// CONSULTAR

	public Ticket emitirTicket() {
		// TODO Auto-generated method stub
		return ticket;
	}
	
}
