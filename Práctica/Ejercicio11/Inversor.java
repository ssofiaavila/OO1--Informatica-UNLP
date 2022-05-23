package jobScheduler.elInversor;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private String nombre;
	private List <Inversion> inversiones;
	
	
	public Inversor(String nombre) {
		this.nombre=nombre;
		this.inversiones= new ArrayList<Inversion>();
		this.inversiones=null;
	}
	
	public double valorActual() {
		double sumaTotal= this.inversiones.stream().mapToDouble(Inversion :: calcularValor).sum();
		return sumaTotal;
	}
	
}
