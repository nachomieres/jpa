package com.dawes.dao;

import com.dawes.modelo.ParadaVO;

public interface ParadaDAO {
	int insertar(ParadaVO parada);
	int modificar(ParadaVO parada);
	int eliminar(ParadaVO parada);
	ParadaVO buscarPorNombre(String nombre);
}
