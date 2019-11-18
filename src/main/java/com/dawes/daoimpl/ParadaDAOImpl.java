package com.dawes.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.mapping.DenormalizedTable;

import com.dawes.dao.ParadaDAO;
import com.dawes.modelo.LineaVO;
import com.dawes.modelo.ParadaVO;

public class ParadaDAOImpl implements ParadaDAO {
	EntityManager em;
	
	

	public ParadaDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	public int insertar(ParadaVO parada) {
		try {
			em.getTransaction().begin();
			em.persist(parada);
			em.getTransaction().commit();
			return 1;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al insertar la linea " + parada.getDenominacion()); 
			em.getTransaction().rollback();
			return 0;
		}
	}

	public int modificar(ParadaVO parada) {
		try {
			em.getTransaction().begin();
			em.merge(parada);
			em.getTransaction().commit();
			return 1;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al modificar la linea " + parada.getDenominacion()); 
			em.getTransaction().rollback();
			return 0;
		}
	}

	public int eliminar(ParadaVO parada) {
		try {
			em.getTransaction().begin();
			em.remove(parada);
			em.getTransaction().commit();
			return 1;
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Error al eliminar la linea " + parada.getDenominacion()); 
			em.getTransaction().rollback();
			return 0;
		}
	}

	public ParadaVO buscarPorNombre(String nombre) {
		Query consulta = em.createQuery("select p from ParadaVO p  where denominacion=:nombre ");
		consulta.setParameter("nombre", nombre);
		ParadaVO lista = (ParadaVO) consulta.getSingleResult();
		return lista;
	}

}
