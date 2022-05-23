package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DistribuidoraTest {
	private Distribuidora distribuidora;
	private Usuario sofia,martina, tatu;
	private Consumo uno,dos,tres;
	
	@BeforeEach
	public void setUp() {
		this.distribuidora= new Distribuidora(25);
		
		sofia= new Usuario("Quilmes","Sofia Avila");
		martina= new Usuario("Berazategui", "Martina Romero");
		tatu= new Usuario("Solano", "Martina Valles");
		
		uno= new Consumo(LocalDate.now(),500,25);
		dos= new Consumo(LocalDate.now(),200,25);
		tres= new Consumo(LocalDate.now(),400,10);
		this.distribuidora.agregarUsuario(martina);
		this.distribuidora.agregarUsuario(sofia);
		this.distribuidora.agregarUsuario(tatu);
	}
	@Test
	public void testConstructor() {
		assertEquals(25,this.distribuidora.getPrecioKW());
		assertEquals(0,this.distribuidora.consumoTotalActiva());
		assertTrue(this.distribuidora.facturar().isEmpty());
		assertTrue(this.distribuidora.getUsuarios().isEmpty());
		
	}
	@Test
	public void testAgregarUsuario() {
		this.distribuidora.agregarUsuario(martina);
		assertEquals(1,this.distribuidora.getUsuarios().size());
		assertTrue(this.distribuidora.getUsuarios().contains(martina));
	}
	@Test
	public void testConsumoTotalActiva() {
		this.martina.agregarMedicion(uno);
		this.sofia.agregarMedicion(dos);
		this.tatu.agregarMedicion(tres);
		assertEquals(1100,this.distribuidora.consumoTotalActiva());
		
	}
	
}
