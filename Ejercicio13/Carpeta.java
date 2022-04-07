package jobScheduler.clienteDeCorreoConAdjuntos;
import java.util.ArrayList;
import java.util.List;
public class Carpeta {
	private String nombre;
	private List<Email> mails;
	
	public Carpeta(String nombre) {
		this.nombre=nombre;
		mails=new ArrayList<Email>();
	}
	public String getNombre() {
		return this.nombre;
	}
	public void agregarMail(Email mail) {
		this.mails.add(mail);
	}
	public void eliminarMail(Email mail) {
		this.mails.remove(mail);
	}
	
	public int tamanioCarpeta() {
		int total= this.mails.stream().mapToInt(Email:: tamanioEmail).sum();
		return total;
	}
	public boolean contiene(String texto) {
		boolean encontre=false;
		int i=0;
		while ((!encontre)&& (i<this.mails.size())) {
			if (this.mails.get(i).contiene(texto)) {
				return true;
			}
			i++;
		}
		return false;
	}
	private int buscarPosicionIgual(String texto) {
		boolean encontre=false;
		int i=0;
		while ((!encontre)&& (i<this.mails.size())){
			if (this.mails.get(i).contiene(texto)) {
				return i;
			}
			i++;
		}
		return -1;
	}
	public Email obtenerIgual(String texto) {
		int posicion=this.buscarPosicionIgual(texto);
		if (posicion != -1) {
			return this.mails.get(posicion);
		}
		return null;	
		
	}
	public List<Email> obtenerMails(){
		return this.mails;
	}
}
