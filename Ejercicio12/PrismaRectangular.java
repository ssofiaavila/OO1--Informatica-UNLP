package jobScheduler.volumenYSuperficieDeSolidos;

public class PrismaRectangular extends Pieza {
	private int ladoMayor,ladoMenor,altura;
	
	public PrismaRectangular(int mayor,int menor, int altura, String material,String color) {
		super(material,color);
		this.ladoMayor=mayor;
		this.ladoMenor=menor;
		this.altura=altura;
	}
	public double getVolumen() {
		return ladoMayor*ladoMenor*altura;
	}
	public double getSuperficie() {
		return 2* (ladoMayor*ladoMenor+ladoMayor*altura+ladoMenor*altura);
	}
	public double getLadoMayor() {
		return ladoMayor;
	}
	public double getLadoMenor() {
		return ladoMenor;
	}
	public double getAltura() {
		return altura;
	}
}
