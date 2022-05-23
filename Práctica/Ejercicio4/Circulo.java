package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Circulo extends Figura {
	private double radio;
	private double diametro;
	
public Circulo() {	
}

public void setDiametro(double diametro) {
	this.diametro=diametro;
}

public double getRadio() {
	return this.radio;
}

public void setRadio(double cm) {
	this.radio=cm;
}

public double getDiametro() {
	return this.radio*2;
	
}

public double getArea() {
	return Math.PI* Math.pow(this.radio,2);
}

public double getPerimetro() {
	return Math.PI* this.getDiametro();			
}

}
