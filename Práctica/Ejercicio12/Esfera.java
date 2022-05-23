package jobScheduler.volumenYSuperficieDeSolidos;

public class Esfera extends Pieza{
	private double radio;
	
	public Esfera(double radio,String material, String color) {
		super(material,color);
		this.radio=radio;
	}
	public double getVolumen() {
		return (4/3)* (Math.PI)  * ((Math.pow(radio, 3)));
	}
	public double getSuperficie() {
		return 4*Math.PI*Math.pow(radio, 2);
	}
	public double getRadio() {
		return radio;
	}
}
