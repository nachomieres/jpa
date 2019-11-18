package com.dawes.serviciosImpl;

import com.dawes.dao.LineaDAO;
import com.dawes.modelo.LineaVO;
import com.dawes.servicios.ServicioLineas;
import com.dawes.util.MySqlDAOFactory;

public class ServicioLineasImpl implements ServicioLineas {
	
	MySqlDAOFactory f;
	LineaDAO ld;
		
	public ServicioLineasImpl() {
		super();
		f = MySqlDAOFactory.getCon();
		ld = f.getLinea();
	}

	public int insertar(LineaVO linea) {
		return ld.insertar(linea);
	}

	public int modificar(LineaVO linea) {
		return ld.modificar(linea);
	}

	public int eliminar(LineaVO linea) {
		return ld.eliminar(linea);
	}

	public LineaVO buscarPorNombre(String dencorta) {
		return ld.buscarPorNombre(dencorta);
	}

	public LineaVO buscarPorId(int idlinea) {
		return ld.buscarPorId(idlinea);
	}

}
