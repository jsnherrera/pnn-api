package com.api.dto;

public class PnnDTO {

	private String clave_censal;
	private String poblacion;
	private String municipio;
	private String estado;
	private String nir;
	private String serie;
	private String numeracion_inicial;
	private String numeracion_final;
	private String razon_social;
	private String nombre_corto;
	private String id_operador;

	public PnnDTO(String clave_censal, String poblacion, String municipio, String estado, String region, String nir,
			String serie, String numeracion_inicial, String numeracion_final, String razon_social, String nombre_corto,
			String id_operador) {
		this.clave_censal = clave_censal;
		this.poblacion = poblacion;
		this.municipio = municipio;
		this.estado = estado;
		this.nir = nir;
		this.serie = serie;
		this.numeracion_inicial = numeracion_inicial;
		this.numeracion_final = numeracion_final;
		this.razon_social = razon_social;
		this.nombre_corto = nombre_corto;
		this.id_operador = id_operador;
	}

	public String getClave_censal() {
		return clave_censal;
	}

	public void setClave_censal(String clave_censal) {
		this.clave_censal = clave_censal;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNir() {
		return nir;
	}

	public void setNir(String nir) {
		this.nir = nir;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getNumeracion_inicial() {
		return numeracion_inicial;
	}

	public void setNumeracion_inicial(String numeracion_inicial) {
		this.numeracion_inicial = numeracion_inicial;
	}

	public String getNumeracion_final() {
		return numeracion_final;
	}

	public void setNumeracion_final(String numeracion_final) {
		this.numeracion_final = numeracion_final;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getNombre_corto() {
		return nombre_corto;
	}

	public void setNombre_corto(String nombre_corto) {
		this.nombre_corto = nombre_corto;
	}

	public String getId_operador() {
		return id_operador;
	}

	public void setId_operador(String id_operador) {
		this.id_operador = id_operador;
	}

}
