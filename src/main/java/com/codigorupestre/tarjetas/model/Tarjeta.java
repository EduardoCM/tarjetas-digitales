package com.codigorupestre.tarjetas.model;

import java.io.Serializable;


public class Tarjeta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String nombreTitular;
	private String nombreEntidad;
	private String numeroTarjeta;
	private String cvv;
	private String fechaCaudicidad;
	private String marca;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public String getNombreEntidad() {
		return nombreEntidad;
	}

	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getFechaCaudicidad() {
		return fechaCaudicidad;
	}

	public void setFechaCaudicidad(String fechaCaudicidad) {
		this.fechaCaudicidad = fechaCaudicidad;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Tarjeta [id=" + id + ", nombreTitular=" + nombreTitular + ", nombreEntidad=" + nombreEntidad
				+ ", numeroTarjeta=" + numeroTarjeta + ", cvv=" + cvv + ", fechaCaudicidad=" + fechaCaudicidad
				+ ", marca=" + marca + "]";
	}
	
	

}
