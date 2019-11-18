package com.dawes.servicios;

import com.dawes.modelo.ParadaVO;

public interface ServicioParadas {
	int insertar(ParadaVO parada);
	int modificar(ParadaVO parada);
	int eliminar(ParadaVO parada);
	ParadaVO buscarPorNombre(String nombre);
}
