package com.dawes.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.dawes.servicios.ServicioLineas;
import com.dawes.servicios.ServicioLineasParadas;
import com.dawes.servicios.ServicioParadas;
import com.dawes.serviciosImpl.ServicioLineasParadasImpl;



public class LineaParadaTest {

	static ServicioLineas sl;
	static ServicioParadas sp;
	static ServicioLineasParadas slp;
	
	@BeforeClass
	public static void antesdelaclase() {
		
		slp=new ServicioLineasParadasImpl();
	}
	@Test
	public void t1AsignaParadaALineaTest () {
		assertEquals (1, slp.asignarParadaALinea("2", "Jardin Botanico", 1));
	}

}
