package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuerpo3D {
	private double altura;
	private Figura caraBasal;
	
	public Cuerpo3D() {		
	}
	public void setAltura(double altura) {
		this.altura=altura;
	}
	public double getAltura() {
		return this.altura;
	}
	
	public void setCaraBasal(Figura cara ) {
		this.caraBasal=cara;
		
	}
	
	public double getSuperficieExterior() {
		return 2* this.caraBasal.getArea()+ this.caraBasal.getPerimetro()* this.altura;
	}

	public double getVolumen() {
		return this.caraBasal.getArea()* this.altura;
	}
}
