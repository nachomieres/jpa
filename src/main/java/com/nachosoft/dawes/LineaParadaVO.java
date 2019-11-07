package com.nachosoft.dawes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="lineaparada")

public class LineaParadaVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idlineaparada;
	
	@ManyToOne
	@JoinColumn(name="idlinea")
	private LineaVO linea;
	
	@ManyToOne
	@JoinColumn(name="idparada")
	private ParadaVO parada;
	
	private int marquesina;

	public LineaParadaVO(int idlineaparada, LineaVO linea, ParadaVO parada, int marquesina) {
		super();
		this.idlineaparada = idlineaparada;
		this.linea = linea;
		this.parada = parada;
		this.marquesina = marquesina;
	}

	public LineaParadaVO(LineaVO linea, ParadaVO parada, int marquesina) {
		super();
		this.linea = linea;
		this.parada = parada;
		this.marquesina = marquesina;
	}

	public LineaParadaVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdlineaparada() {
		return idlineaparada;
	}

	public void setIdlineaparada(int idlineaparada) {
		this.idlineaparada = idlineaparada;
	}

	public LineaVO getLinea() {
		return linea;
	}

	public void setLinea(LineaVO linea) {
		this.linea = linea;
	}

	public ParadaVO getParada() {
		return parada;
	}

	public void setParada(ParadaVO parada) {
		this.parada = parada;
	}

	public int getMarquesina() {
		return marquesina;
	}

	public void setMarquesina(int marquesina) {
		this.marquesina = marquesina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idlineaparada;
		result = prime * result + marquesina;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LineaParadaVO other = (LineaParadaVO) obj;
		if (idlineaparada != other.idlineaparada)
			return false;
		if (marquesina != other.marquesina)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LineaParadaVO [idlineaparada=" + idlineaparada + ", marquesina=" + marquesina + "]";
	}
	
	

}
