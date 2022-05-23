package jobScheduler.clienteDeCorreoConAdjuntos;
import java.util.Set;
import java.util.HashSet;
public class Email {
	private String titulo, cuerpo;
	private Set<Archivo> adjuntos;
	
	public Email(String titulo, String cuerpo) {
		this.titulo=titulo;
		this.cuerpo=cuerpo;
		this.adjuntos= new HashSet<Archivo>();
	}
	public String getTitulo() {
		return this.titulo;
	}
	public String getCuerpo() {
		return this.cuerpo;
	}
	public Set<Archivo> adjuntos(){
		return this.adjuntos;
	}
	public int tamanioEmail() {
		return this.titulo.length()+this.cuerpo.length()+ this.tamanioAdjuntos();
	}
	private int tamanioAdjuntos() {
		int total= this.adjuntos.stream().mapToInt(Archivo::tamanio ).sum();
		return total;
	}
	public boolean contiene(String texto) {
		return (this.titulo.equals(texto)) || (this.cuerpo.equals(texto));
	}
	public void agregarAdjunto(Archivo archivo) {
		this.adjuntos.add(archivo);
	}
	
}
