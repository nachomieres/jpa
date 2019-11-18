package com.dawes.dao;

import com.dawes.modelo.LineaVO;

public interface LineaDAO {
	int insertar(LineaVO linea);
	int modificar(LineaVO linea);
	int eliminar(LineaVO linea);
	LineaVO buscarPorNombre(String dencorta);
	LineaVO buscarPorId(int idlinea);
}
