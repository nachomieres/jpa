package joseIgnacioGonzalezGarcia_JPA;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.BeforeClass;
import org.junit.Test;

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
	public void m1conexionOK() {
		assertNotNull(em);
	}
}
