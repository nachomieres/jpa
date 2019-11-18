package com.dawes.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dawes.dao.LineaParadaDAO;
import com.dawes.modelo.LineaParadaVO;
import com.dawes.modelo.LineaVO;
import com.dawes.modelo.ParadaVO;

public class LineaParadaDAOImpl implements LineaParadaDAO {
	EntityManager em;
	
	public LineaParadaDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public int asignarParadaALinea(String dencorta, String denominacion, int marquesina) {
		em.getTransaction().begin();
		Query linea=em.createQuery("select l from LineaVO l where dencorta=:dencorta");
		linea.setParameter("dencorta", dencorta);
		LineaVO l=(LineaVO) linea.getSingleResult();
		
		Query parada=em.createQuery("select p from ParadaVO p where denominacion=:denominacion");
		parada.setParameter("denominacion", denominacion);
		ParadaVO p=(ParadaVO) parada.getSingleResult();
		
		LineaParadaVO lp=new LineaParadaVO(l,p,marquesina);
		l.getParadas().add(lp);
		p.getLineas().add(lp);
		em.persist(lp);
		em.getTransaction().commit();
		return 1;
	}

}
