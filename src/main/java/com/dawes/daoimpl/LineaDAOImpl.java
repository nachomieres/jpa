package com.dawes.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dawes.dao.LineaDAO;
import com.dawes.modelo.LineaVO;

public class LineaDAOImpl implements LineaDAO {

	EntityManager em;
	
	public LineaDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public int insertar(LineaVO linea) {
		try {
			em.getTransaction().begin();
			em.persist(linea);
			em.getTransaction().commit();
			return 1;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al insertar la linea " + linea.getDencorta()); 
			em.getTransaction().rollback();
			return 0;
		}		
	}

	public int modificar(LineaVO linea) {
		try {
			em.getTransaction().begin();
			em.merge(linea);
			em.getTransaction().commit();
			return 1;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al modificar la linea " + linea.getDencorta()); 
			em.getTransaction().rollback();
			return 0;
		}
		
	}

	public int eliminar(LineaVO linea) {
		try {
			em.getTransaction().begin();
			em.remove(linea);
			em.getTransaction().commit();
			return 1;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al eliminar la linea " + linea.getDencorta()); 
			em.getTransaction().rollback();
			return 0;
		}
	}

	public LineaVO buscarPorNombre(String dencorta) {
		Query consulta = em.createQuery("select l from LineaVO l  where dencorta=:nombre ");
		consulta.setParameter("nombre", dencorta);
		LineaVO lista = (LineaVO) consulta.getSingleResult();
		return lista;
	}

	public LineaVO buscarPorId(int idlinea) {
		em.getTransaction().begin();
		LineaVO linea = em.find(LineaVO.class, 1);
		em.getTransaction().commit();
		return linea;
	}

}
