package jobScheduler.elInversor;

public class InversionEnAcciones implements Inversion {
	private String nombre;
	private int cantidad;
	private double valorUnitario;
	
	public InversionEnAcciones(String nombre, int cantidad, double valorUnitario) {
		this.nombre=nombre;
		this.cantidad=cantidad;
		this.valorUnitario=valorUnitario;
	}
	
	public double calcularValor() {
		return this.cantidad * this.valorUnitario;
	}
}
