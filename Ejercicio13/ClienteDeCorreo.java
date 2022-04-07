package jobScheduler.clienteDeCorreoConAdjuntos;
import java.util.Set;
import java.util.HashSet;
public class ClienteDeCorreo {
	private Carpeta imbox;
	private Set<Carpeta> carpetas;
	
	public ClienteDeCorreo() {
		this.imbox=new Carpeta("imbox");		
		this.carpetas= new HashSet<Carpeta>();
	}
	public void recibir(Email email) {
		this.imbox.agregarMail(email);
	}
	public void mover(Email mail, Carpeta origen, Carpeta destino) {
		destino.agregarMail(mail);
		origen.eliminarMail(mail);
	}
	public void agregarCarpeta(Carpeta carpeta) {
		this.carpetas.add(carpeta);
	}
	
	public int espacioOcupado() {
		int total= 0+ this.carpetas.stream().mapToInt(Carpeta:: tamanioCarpeta).sum();
		total+= this.imbox.tamanioCarpeta();
		return total;
	}
	 public Email buscar(String texto) {		 
		 for (Carpeta car: carpetas) {
			 if (car.contiene(texto)) {
				 return car.obtenerIgual(texto);
			 }
		 }
		 return null;
	 }
	 public Set<Carpeta> getCarpetas(){
		 return this.carpetas;
	 }
	 public Carpeta getImbox() {
		 return this.imbox;
	 }
	 
	 
}
