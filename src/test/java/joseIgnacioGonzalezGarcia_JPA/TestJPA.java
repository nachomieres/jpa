package joseIgnacioGonzalezGarcia_JPA;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.BeforeClass;
import org.junit.Test;

import com.nachosoft.dawes.LineaVO;

public class TestJPA {

	static EntityManagerFactory emf;
	static EntityManager em;

	@BeforeClass
	public static void antesDelTest() {
		Persistence.generateSchema("jpa", null);
		emf = Persistence.createEntityManagerFactory("jpa");
		em = emf.createEntityManager();
	}

	@Test
	public void t1conexionOK() {
		assertNotNull(em);
	}
	
	@Test
	public void t2InsertaParadaOK() {
		em.getTransaction().begin();
		em.persist(new LineaVO("3",  "El Llauredal - Campus Universitario", LocalDate.now(), new ArrayList()));		
		em.getTransaction().commit();
		
		System.out.print(em.find(LineaVO.class, 2).toString());
		assertEquals("10",em.find(LineaVO.class, 2).getDencorta());
	}
	
	@Test
	public void m6eliminarCuentaOK() {
		em.getTransaction().begin();
		
		// busco la cuenta a eliminar
		LineaVO l = em.find(LineaVO.class, 3);
		
		em.remove(em.find(LineaVO.class,3));
		em.getTransaction().commit();
		assertNull(em.find(LineaVO.class, 3));
	}
}
