package jobScheduler.volumenYSuperficieDeSolidos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FigurasTest {
		Cilindro c1;
		Esfera e1;
		PrismaRectangular p1;
		
	@BeforeEach 
	void setUp() {
		c1= new Cilindro(5,5, "plastico", "rosa"); //radio 5 altura= 5
		e1= new Esfera(5,"plastico", "rosa"); //radio= 5
		p1= new PrismaRectangular(5,3,5,"plastico", "rosa"); //lado mayor= 5 lado menor= 3 altura= 5
	}
	@Test
	void testConstructor() {
		assertEquals(5,c1.getRadio());
		assertEquals(5,e1.getRadio());
		assertEquals(5,p1.getLadoMayor());
	}
	@Test
	void testCalcularVolumen() {
		assertEquals(392.6990816987241,c1.getVolumen());
		assertEquals(392.6990816987241,e1.getVolumen());
		assertEquals(75,p1.getVolumen());
	}
	@Test
	void testCalcularSuperficie() {
		assertEquals(188.4955592153876,c1.getSuperficie());
		assertEquals(314.1592653589793,e1.getSuperficie());
		assertEquals(110,p1.getSuperficie());
	}
}
