package com.nachosoft.dawes;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="lineas")
public class LineaVO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idlineas;
	private String dencorta;
	private String denlarga;
	private LocalDate fecha;
	
	@OneToMany(mappedBy="linea", cascade= {CascadeType.PERSIST})
//	@OnDelete(action=OnDeleteAction.CASCADE)
	List<LineaParadaVO> paradas;

	public int getIdlineas() {
		return idlineas;
	}

	public void setIdlineas(int idlineas) {
		this.idlineas = idlineas;
	}

	public String getDencorta() {
		return dencorta;
	}

	public void setDencorta(String dencorta) {
		this.dencorta = dencorta;
	}

	public String getDenlarga() {
		return denlarga;
	}

	public void setDenlarga(String denlarga) {
		this.denlarga = denlarga;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public List<LineaParadaVO> getParadas() {
		return paradas;
	}

	public void setParadas(List<LineaParadaVO> paradas) {
		this.paradas = paradas;
	}

	public LineaVO(int idlineas, String dencorta, String denlarga, LocalDate fecha, List<LineaParadaVO> paradas) {
		super();
		this.idlineas = idlineas;
		this.dencorta = dencorta;
		this.denlarga = denlarga;
		this.fecha = fecha;
		this.paradas = paradas;
	}

	public LineaVO(String dencorta, String denlarga, LocalDate fecha, List<LineaParadaVO> paradas) {
		super();
		this.dencorta = dencorta;
		this.denlarga = denlarga;
		this.fecha = fecha;
		this.paradas = paradas;
	}

	public LineaVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dencorta == null) ? 0 : dencorta.hashCode());
		result = prime * result + ((denlarga == null) ? 0 : denlarga.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + idlineas;
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
		LineaVO other = (LineaVO) obj;
		if (dencorta == null) {
			if (other.dencorta != null)
				return false;
		} else if (!dencorta.equals(other.dencorta))
			return false;
		if (denlarga == null) {
			if (other.denlarga != null)
				return false;
		} else if (!denlarga.equals(other.denlarga))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (idlineas != other.idlineas)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LineaVO [idlineas=" + idlineas + ", dencorta=" + dencorta + ", denlarga=" + denlarga + ", fecha="
				+ fecha + "]";
	}

	
}
