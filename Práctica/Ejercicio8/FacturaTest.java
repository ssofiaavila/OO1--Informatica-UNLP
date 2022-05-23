package ar.edu.unlp.info.oo1.distribuidoraElectrica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FacturaTest {

	private Usuario sofia;
	private Factura factura;
	
	
	@BeforeEach
	public void setUp() {
		sofia = new Usuario("Quilmes", "Sofia Avila");
		factura = new Factura(2000, 10, sofia);
		
	}
	
	@Test
	public void testInicializar() {
		assertEquals(10, factura.getDescuento());
		assertEquals(2000, factura.getMontoEnergiaActiva());
		assertEquals(factura.getFecha(), LocalDate.now());
		assertEquals(sofia, factura.getUsuario());
	}
	
	@Test
	public void testMontoTotal() {
		assertEquals(1800, factura.montoTotal());
	}
	
}
