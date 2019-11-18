package com.dawes.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.dawes.serviciosImpl.ServicioLineasImpl;
import com.dawes.modelo.LineaVO;
import com.dawes.servicios.ServicioLineas;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LineaTest {

	static ServicioLineas sl;
	
	@BeforeClass
	public static void antesdelaclase() {
		sl=new com.dawes.serviciosImpl.ServicioLineasImpl();
	
	}
	
	@Test
	public void t1PersistLineaTest () {
		assertEquals(1, sl.insertar (new LineaVO ("9", "Pumarín - Somió/Hospital de Cabueñes", LocalDate.now(), null)));
	}
	
	@Test
	public void t2EliminarLineaTest () {
		assertEquals (1, sl.eliminar(sl.buscarPorNombre("1")));				
	}
	
	@Test
	public void t3ParadasDeUnaLineaTest() {
		assertEquals(4,sl.buscarPorNombre("2").getParadas().size());
	}
	
	@Test
	public void t4ModificarLineaTest() {
		LineaVO l=sl.buscarPorNombre("9");
		l.setDencorta("10");
		sl.modificar(l);
		assertEquals("Pumarín - Somió/Hospital de Cabueñes",sl.buscarPorNombre("10").getDenlarga());
	}
	
	@Test 
	public void t5ListarParadasTest(){
		System.out.println("Paradas de la linea 2:");		
		sl.buscarPorNombre("2").getParadas().forEach(x->System.out.println(x.getParada().getDenominacion()));		
		assertEquals(4,sl.buscarPorNombre("2").getParadas().size());
		
	}
	// correspondencias de una linea en una parada
	@Test
	public void t6CorrespondencasLineaTest() {
		System.out.println("Correspondencias de la linea 2 en la parada Los Fresnos");
		sl.buscarPorNombre("2").getParadas().forEach(x->{
			if(!x.getParada().getDenominacion().equals("Los Fresnos"))
				System.out.println(x.getLinea().getDencorta());
		});	
	}
}
