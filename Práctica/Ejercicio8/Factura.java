package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import java.time.LocalDate;

public class Factura {
	private double montoEnergiaActiva;
	private double descuento;
	private LocalDate fecha;
	private Usuario cliente;
	
	public Factura(double activa,double descuento, Usuario cliente) {
		this.descuento=descuento;
		this.montoEnergiaActiva=activa;
		this.fecha=LocalDate.now();
		this.cliente=cliente;
	}

	public double getMontoEnergiaActiva() {
		return montoEnergiaActiva;
	}

	public double getDescuento() {
		return descuento;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Usuario getUsuario() {
		return cliente;
	}

	public double montoTotal() {
		return  this.montoEnergiaActiva * (1 - this.descuento / 100);
	}

}
