package jobScheduler.elInversor;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;

public class PlazoFijo implements Inversion {
	private LocalDate fechaDeConstitucion;
	private double montoDepositado;
	private double porcentajeDelInteresDiario;
	
	public PlazoFijo(LocalDate inicio, double monto, double porcentaje) {
		this.fechaDeConstitucion=inicio;
		this.montoDepositado=monto;
		this.porcentajeDelInteresDiario=porcentaje;
	}
	
	public double calcularValor() {
		long dias= DAYS.between(LocalDate.now(), fechaDeConstitucion);
		double montoPorcentaje= (this.porcentajeDelInteresDiario*this.montoDepositado)/100;
		return this.montoDepositado+ (montoPorcentaje*dias);
	}
}