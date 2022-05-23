package jobScheduler.clienteDeCorreoConAdjuntos;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {
	private ClienteDeCorreo cliente;
	private Carpeta origen,destino;
	private Email e1,e2,e3;
	private Archivo a1,a2,a3;
	
	@BeforeEach
	public void SetUp() {
		this.cliente=new ClienteDeCorreo();
		this.origen= new Carpeta("Facultad");
		this.destino=new Carpeta("Spam");
		this.e1= new Email("Inscripcion","Mail de inscripcion");
		this.e2= new Email("Promocion", "Rappi");
		this.e3= new Email("Instagram", "Nuevo seguidor");
		this.a1= new Archivo("Foto");
		this.a2= new Archivo("Video");
		this.a3= new Archivo("Pdf");	
		this.cliente.agregarCarpeta(destino);
		this.cliente.agregarCarpeta(origen);
	}
	//TEST CLASE ClienteDeCorreo
	@Test
	public void constructorClienteTest() {
		assertTrue(!cliente.getCarpetas().isEmpty());		
	}
	@Test
	public void agregarCarpetaTest() {
		assertTrue(cliente.getCarpetas().contains(origen));
		assertTrue(cliente.getCarpetas().contains(destino));
	}
	@Test
	public void agregarMailImboxTest() {
		cliente.recibir(e1);
		assertTrue(cliente.getImbox().obtenerMails().contains(e1));
		assertFalse(cliente.getImbox().obtenerMails().contains(e2));		
	}
	public void moverMailTest() {
		cliente.mover(e1, origen, destino);
		assertTrue(destino.obtenerMails().contains(e1));
		assertFalse(destino.obtenerMails().contains(e1));
	}
	public void tamanioTest() {
		e1.agregarAdjunto(a1);
		e2.agregarAdjunto(a2);
		e3.agregarAdjunto(a3);
		int total= e1.tamanioEmail()+e2.tamanioEmail()+e3.tamanioEmail();
		this.cliente.recibir(e1);
		this.cliente.recibir(e2);
		this.cliente.recibir(e3);
		assertEquals(total,this.cliente.espacioOcupado());
	}
	public void getCarpetas() {
		assertTrue(this.cliente.getCarpetas().contains(destino));
	}
	
	
	
	//TEST CLASE Carpeta
	@Test
	public void constructorCarpetaTest() {
		assertTrue(this.destino.obtenerMails().isEmpty());		
	}
	@Test
	public void agregarMailTest() {
		this.origen.agregarMail(e1);
		this.origen.agregarMail(e2);
		assertTrue(origen.obtenerMails().contains(e1));
		assertTrue(origen.obtenerMails().contains(e2));
	}
	@Test
	public void eliminarMailTest() {
		this.origen.agregarMail(e1);
		this.origen.eliminarMail(e1);
		assertFalse(this.origen.obtenerMails().contains(e1));
	}
	@Test
	public void tamanioCarpetaTest() {
		this.origen.agregarMail(e1);
		this.origen.agregarMail(e2);
		this.origen.agregarMail(e3);
		int total= e1.tamanioEmail()+e2.tamanioEmail()+e3.tamanioEmail();
		assertEquals(total,this.origen.tamanioCarpeta());
	}
	@Test
	public void contieneTest() {
		this.origen.agregarMail(e1);
		assertTrue(this.origen.contiene("Inscripcion"));
	}
	@Test
	public void obtenerIgual() {
		this.origen.agregarMail(e1);
		assertTrue(this.origen.contiene("Inscripcion"));
	}
	@Test
	public void obtenerMailsTest() {
		this.origen.agregarMail(e1);
		this.origen.agregarMail(e2);
		assertTrue(origen.obtenerMails().contains(e1));
		assertTrue(origen.obtenerMails().contains(e2));
		assertFalse(origen.obtenerMails().contains(e3));
	}
	
	//TEST CLASE Email
	@Test
	public void constructorEmail() {
		assertEquals("Inscripcion",e1.getTitulo());
		assertEquals("Mail de inscripcion", e1.getCuerpo());
		assertTrue(e1.adjuntos().isEmpty());
	}
	@Test
	public void tamanioMailTest() {
		e1.agregarAdjunto(a1);
		int total= e1.getCuerpo().length()+ e1.getTitulo().length()+ this.a1.tamanio();
		assertEquals(total, e1.tamanioEmail());
	}
	@Test
	public void contieneTextoTest() {
		assertTrue(e1.contiene("Inscripcion"));
		assertFalse(e1.contiene("Hola"));
	}
	@Test
	public void agregarAdjuntosTest() {
		e1.agregarAdjunto(a1);
		assertTrue(e1.adjuntos().contains(a1));
		assertFalse(e1.adjuntos().contains(a2));
	}
	
	//TEST CLASE Archivo
	@Test
	public void constructorEmailTest() {
		assertEquals("Foto", a1.getNombre());
	}
	public void tamanioArchivoTest() {
		assertEquals(4,a1.tamanio());
		assertEquals(5,a2.tamanio());
		assertEquals(3,a3.tamanio());
	}
	
}
