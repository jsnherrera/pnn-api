package com.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pnn")
public class Pnn {

	@Column
	private String clave_censal;
	@Column
	private String poblacion;
	@Column
	private String municipio;
	@Column
	private String estado;
	@Column
	private String central;
	@Column
	private String presuscripcion;
	@Column
	private String region;
	@Column
	private String asl;
	@Column
	private String nir;
	@Column
	private String serie;
	@Id
	@Column
	private String numeracion_inicial;
	@Column
	private String numeracion_final;
	@Column
	private String ocupacion;
	@Column
	private String tipo_red;
	@Column
	private String modalidad;
	@Column
	private String estatus;
	@Column
	private String razon_social;
	@Column
	private String nombre_corto;
	@Column
	private String id_operador;
	@Column
	private String oficio_reserva;
	@Column
	private String fecha_reserva;
	@Column
	private String oficio_asignacion;
	@Column
	private String fecha_asignacion;
	@Column
	private String fecha_consolidacion;
	@Column
	private String fecha_migracion;
	@Column
	private String nir_anterior;
	@Column
	private String punto_entrega;
	@Column
	private String ido;
	@Column
	private String ida;

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

	public String getCentral() {
		return central;
	}

	public void setCentral(String central) {
		this.central = central;
	}

	public String getPresuscripcion() {
		return presuscripcion;
	}

	public void setPresuscripcion(String presuscripcion) {
		this.presuscripcion = presuscripcion;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getAsl() {
		return asl;
	}

	public void setAsl(String asl) {
		this.asl = asl;
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

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getTipo_red() {
		return tipo_red;
	}

	public void setTipo_red(String tipo_red) {
		this.tipo_red = tipo_red;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
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

	public String getOficio_reserva() {
		return oficio_reserva;
	}

	public void setOficio_reserva(String oficio_reserva) {
		this.oficio_reserva = oficio_reserva;
	}

	public String getFecha_reserva() {
		return fecha_reserva;
	}

	public void setFecha_reserva(String fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}

	public String getOficio_asignacion() {
		return oficio_asignacion;
	}

	public void setOficio_asignacion(String oficio_asignacion) {
		this.oficio_asignacion = oficio_asignacion;
	}

	public String getFecha_asignacion() {
		return fecha_asignacion;
	}

	public void setFecha_asignacion(String fecha_asignacion) {
		this.fecha_asignacion = fecha_asignacion;
	}

	public String getFecha_consolidacion() {
		return fecha_consolidacion;
	}

	public void setFecha_consolidacion(String fecha_consolidacion) {
		this.fecha_consolidacion = fecha_consolidacion;
	}

	public String getFecha_migracion() {
		return fecha_migracion;
	}

	public void setFecha_migracion(String fecha_migracion) {
		this.fecha_migracion = fecha_migracion;
	}

	public String getNir_anterior() {
		return nir_anterior;
	}

	public void setNir_anterior(String nir_anterior) {
		this.nir_anterior = nir_anterior;
	}

	public String getPunto_entrega() {
		return punto_entrega;
	}

	public void setPunto_entrega(String punto_entrega) {
		this.punto_entrega = punto_entrega;
	}

	public String getIdo() {
		return ido;
	}

	public void setIdo(String ido) {
		this.ido = ido;
	}

	public String getIda() {
		return ida;
	}

	public void setIda(String ida) {
		this.ida = ida;
	}

}
