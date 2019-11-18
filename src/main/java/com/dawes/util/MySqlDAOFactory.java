package com.dawes.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.dawes.dao.LineaDAO;
import com.dawes.dao.LineaParadaDAO;
import com.dawes.dao.ParadaDAO;
import com.dawes.daoimpl.LineaDAOImpl;
import com.dawes.daoimpl.LineaParadaDAOImpl;
import com.dawes.daoimpl.ParadaDAOImpl;

public class MySqlDAOFactory {
	EntityManagerFactory emf;
	EntityManager em;

	private static MySqlDAOFactory f;
	
	private MySqlDAOFactory() {
		Persistence.generateSchema("jpa", null);
		emf = Persistence.createEntityManagerFactory("jpa");
		em = emf.createEntityManager();
	}

	public static MySqlDAOFactory getCon() {
		if (f==null)
			f=new MySqlDAOFactory();
		return f;
	}
	
	public LineaDAO getLinea() {
		return new LineaDAOImpl(em);
	}
	public ParadaDAO getParada() {
		return new ParadaDAOImpl(em);
	}
	public LineaParadaDAO getLineaParada() {
		return new LineaParadaDAOImpl(em);
	}

}
