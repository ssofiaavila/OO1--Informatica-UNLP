package jobScheduler.volumenYSuperficieDeSolidos;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class ReporteDeConstruccion {
	private List <Pieza> piezas;
	
	public ReporteDeConstruccion() {
		this.piezas= new ArrayList<Pieza>();
		this.piezas=null;
	}
	
	public double getVolumenDeMaterial(String material ) {
		double total= this.piezas.stream().filter(pieza -> pieza.getMaterial().equals(material)).mapToDouble(Pieza:: getVolumen).sum();
		return total;
}
	public double getSuperficieDeMaterial(String color) {
		double total= this.piezas.stream().filter(pieza -> pieza.getColor().equals(color)).mapToDouble(Pieza :: getSuperficie).sum();
		return total;
	}
	public void agregarPieza(Pieza nueva) {
		piezas.add(nueva);
	}
	public List <Pieza> getPiezas(){
		return this.piezas;
	}
}
 