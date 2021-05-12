package com.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pnn")
public class Pnn {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column
	private String clave_censal;
	@Column
	private String poblacion;
	@Column
	private String municipio;
	@Column
	private String estado;
	@Column
	private String region;
	@Column
	private String nir;
	@Column
	private String serie;
	@Column
	private String numeracion_inicial;
	@Column
	private String numeracion_final;
	@Column
	private String tipo_red;
	@Column
	private String razon_social;
	@Column
	private String nombre_corto;
	@Column
	private String id_operador;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
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

	public String getTipo_red() {
		return tipo_red;
	}

	public void setTipo_red(String tipo_red) {
		this.tipo_red = tipo_red;
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
