package ar.edu.unlp.info.oo1.ejercicio5;
import java.util.Date;
public class Mamifero extends Object {
	private String identificador;
	private String especie;
	private Date fechaDeNacimiento;
	private Mamifero padre,madre;
	
	public Mamifero(String identificador) {
		this.identificador= identificador;
	}
	public Mamifero() {
		
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	
	public void setIdentificador(String identificador) {
		this.identificador=identificador;
	}
	
	public void setEspecie(String especie) {
		this.especie=especie;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void setFechaNacimiento(Date fecha) {
		this.fechaDeNacimiento=fecha;
	}
	
	public Date getFechaNacimiento() {
		return this.fechaDeNacimiento;
	}
	
	public void setPadre(Mamifero padre) {
		this.padre=padre;
	}
	
	public Mamifero getPadre() {
		return this.padre;
	}
	
	public void setMadre(Mamifero madre) {
		this.madre=madre;
	}
	
	public Mamifero getMadre() {
		return this.madre;
	}
	public Mamifero getAbueloMaterno() {
		if (this.getMadre()!=null) {
			return this.madre.getPadre();
		}
		return null;
	}
	
	public Mamifero getAbuelaMaterna() {
		if (this.getMadre()!=null) {
			return this.madre.getMadre();
		}
		return null;
	}
	
	public Mamifero getAbueloPaterno() {
		if (this.getPadre()!= null) {
			return this.padre.getPadre();
		}
		return null;
	}
	public Mamifero getAbuelaPaterna() {
		if (this.getPadre()!= null) {
			return this.padre.getMadre();
		}
		return null;
	}
	
	public boolean tieneComoAncestroA(Mamifero alguien) {
		boolean ancestro=false;
		if (this.madre!= null) {
			if (this.madre.equals(alguien)) {
				ancestro=true;
			}
			else
				ancestro= this.madre.tieneComoAncestroA(alguien);
		}
		if ((!ancestro)&& (this.padre !=null)) {
			if (this.padre.equals(alguien)) {
				ancestro=true;
			}
			else
				ancestro=this.padre.tieneComoAncestroA(alguien);
		}
		return ancestro;
	}
	
	
	
}
