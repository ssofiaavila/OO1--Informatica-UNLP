package ar.edu.unlp.info.oo1.presupuestos;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;




public class Presupuesto {
	
	
	private LocalDate fecha=LocalDate.now();
	private String cliente;
	private List<Item> items;
	
	
	public Presupuesto() {
		this.fecha = LocalDate.now();
		
	}
	public double calcularTotal() {
		if (items.isEmpty()) {
			return 0;
		}
		return items.stream().mapToDouble(Item -> Item.getCostoTotal()).sum();
				//items.stream().mapToDouble(Item -> Item.getCostoTotal()).sum();
		
		
	}
	public Presupuesto cliente(String nombre) {
		this.cliente= nombre;
		this.items=new ArrayList <Item>();
		return this;
		
	}
	public void agregarItem(Item item) {
		this.items.add(item);
		
	}
	
	
}
