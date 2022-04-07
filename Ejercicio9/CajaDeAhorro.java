package cuentaConGanchos;

public class CajaDeAhorro extends Cuenta{
	
	public CajaDeAhorro() {		
	}
	
	public boolean puedeExtraer(double monto) {
		double adicional= (monto*2)/100;
		return monto+adicional<= super.getSaldo();
	}
	public boolean extraer(double monto) {
		double adicional= (monto*2)/100;
		return super.extraer(monto+adicional);
	}
	public void depositar(double monto) {
		double adicional=(monto*2)/100;
		super.depositar(monto-adicional);
	}
	public boolean transferirACuenta(double monto, Cuenta destino) {
		double adicional=(2*monto)/100;
		return super.transferirACuenta(monto+adicional, destino);
	}
}
