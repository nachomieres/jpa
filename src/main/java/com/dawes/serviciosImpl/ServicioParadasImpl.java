package com.dawes.serviciosImpl;

import com.dawes.dao.ParadaDAO;
import com.dawes.modelo.LineaVO;
import com.dawes.modelo.ParadaVO;
import com.dawes.servicios.ServicioLineas;
import com.dawes.servicios.ServicioParadas;
import com.dawes.util.MySqlDAOFactory;

public class ServicioParadasImpl implements ServicioParadas {

	MySqlDAOFactory f;
	ParadaDAO p;
	
	public ServicioParadasImpl() {
		super();
		f = MySqlDAOFactory.getCon();
		p = f.getParada();
	}

	@Override
	public int insertar(ParadaVO parada) {
		// TODO Auto-generated method stub
		return p.insertar(parada);
	}

	@Override
	public int modificar(ParadaVO parada) {
		// TODO Auto-generated method stub
		return p.modificar(parada);
	}


	@Override
	public int eliminar(ParadaVO parada) {
		// TODO Auto-generated method stub
		return p.eliminar(parada);
	}

	@Override
	public ParadaVO buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return p.buscarPorNombre(nombre);
	}

}
