package jobScheduler.clienteDeCorreoConAdjuntos;

public class Archivo {
	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int tamanio() {
		return this.nombre.length();
	}
}
