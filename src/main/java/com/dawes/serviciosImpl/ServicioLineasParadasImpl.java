package com.dawes.serviciosImpl;

import com.dawes.dao.LineaParadaDAO;
import com.dawes.servicios.ServicioLineasParadas;
import com.dawes.util.MySqlDAOFactory;

public class ServicioLineasParadasImpl implements ServicioLineasParadas {

	MySqlDAOFactory f;
	LineaParadaDAO lp;
	
	
	
	public ServicioLineasParadasImpl() {
		super();
		f = MySqlDAOFactory.getCon();
		lp = f.getLineaParada();
	}



	@Override
	public int asignarParadaALinea(String dencorta, String denominacion, int marquesina) {
		// TODO Auto-generated method stub
		return lp.asignarParadaALinea(dencorta, denominacion, marquesina);
	}

}
