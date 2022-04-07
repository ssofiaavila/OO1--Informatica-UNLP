package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuadrado extends Figura{
		private double lado;
	public Cuadrado() {
		
	}
	
	public void setLado(double valor) {
		this.lado=valor;
	}
	public double getLado() {
		return this.lado;
	}
	
	public double getPerimetro() {
		return this.lado*4;
	}
	public double getArea() {
		return Math.pow(this.lado, 2);
	}
	
}
