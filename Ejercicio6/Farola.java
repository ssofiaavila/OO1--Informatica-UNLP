package ar.edu.unlp.info.oo1.ejercicio6RedDeFarolas;
import java.util.ArrayList;
import java.util.List;



public class Farola {
	private boolean encendida;
	private List<Farola> vecinas;
	
	public Farola() {
		this.encendida=false;
		this.vecinas =new ArrayList <Farola>();
	}
	/*
	* Creates the neightbour's relationship between street lights. The relationship of neighbors between the street lights is reciprocal, that is, the receiver
* of the message will be a neighbor of another Lamp, just as another Lamp will also become a neighbor of the recipient of the message
	*/
	public void pairWithNeighbor(Farola otraFarola) {
        this.addNeighbor(otraFarola);
        otraFarola.addNeighbor(this);
    }
    
    public void addNeighbor(Farola otraFarola) {
        this.vecinas.add(otraFarola);
    }
	/*
	* Returns its neighboring street lights
	*/
	public List <Farola> getNeighbors (){
		return this.vecinas;
	}


	/*
	* If the street light is not on, turn it on and propagate the action.
	*/
	public void turnOn() {
		if (!this.encendida) {
			this.encendida=true;
			vecinas.stream().
			forEach(vecinas -> vecinas.turnOn());
		}
	}

	/*
	* If the street light is not off, turn it off and propagate the action.
	*/
	public void turnOff() {
		if (this.encendida) {
			this.encendida=false;
			vecinas.stream().
			forEach(vecinas -> vecinas.turnOff());
		}
	}
	public boolean isOn() {
		return this.encendida;
	}
	public boolean isOff() {
		return this.encendida;
	}

}
