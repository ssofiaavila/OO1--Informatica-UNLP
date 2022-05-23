package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import java.time.LocalDate;

public class Consumo {
	private LocalDate fecha;
	private double consumoEnergiaActiva;
	private double consumoEnergiaReactiva;
	
	public Consumo(LocalDate fecha, double activa, double reactiva) {
		this.fecha=fecha;
		this.consumoEnergiaActiva=activa;
		this.consumoEnergiaReactiva=reactiva;
	}
	
	public double costoEnBaseA(double precio) {
		return this.consumoEnergiaActiva*precio;
	}
	public double factorDePontencia() {
		return this.consumoEnergiaActiva/ (Math.sqrt(Math.pow(consumoEnergiaReactiva,2)+ Math.pow(consumoEnergiaReactiva, 2)));
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getConsumoDeEnergiaActiva() {
		return consumoEnergiaActiva;
	}

	public double getConsumoDeEnergiaReactiva() {
		return consumoEnergiaReactiva;
	}


	
	
}
