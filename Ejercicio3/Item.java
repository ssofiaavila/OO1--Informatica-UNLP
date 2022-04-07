package ar.edu.unlp.info.oo1.presupuestos;

public class Item extends Object {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item() {
		
	}

	public Item detalle(String detalle) {
		this.detalle=detalle;
		return this;
	}

	public Item costoUnitario(int costo) {
		this.costoUnitario=costo;
		return this;
	}

	public Item cantidad(int cant) {
		this.cantidad=cant;
		return this;
	}
	public double getCostoTotal() {
		return (this.cantidad*this.costoUnitario);
	}

}
