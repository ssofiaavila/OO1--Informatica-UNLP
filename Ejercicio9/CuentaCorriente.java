package cuentaConGanchos;

public class CuentaCorriente extends Cuenta{
	private double descubierto;
	
	public CuentaCorriente() {
		this.descubierto=0;
	}
	public double getDescubierto() {
		return this.descubierto;
	}
	public void setDescubierto(double monto) {
		this.descubierto=monto;
	}
	public boolean puedeExtraer(double monto) {
		 if (monto <= (super.getSaldo()+this.getDescubierto())) {
				 return true;
			 }
			 
		 return false;
	}
}
