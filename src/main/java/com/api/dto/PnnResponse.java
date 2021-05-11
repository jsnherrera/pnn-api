package com.api.dto;

import java.util.List;

import com.api.model.Pnn;

public class PnnResponse {

	private int code;
	private String menssage;
	private List<Pnn> pnns;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMenssage() {
		return menssage;
	}

	public void setMenssage(String menssage) {
		this.menssage = menssage;
	}

	public List<Pnn> getPnns() {
		return pnns;
	}

	public void setPnns(List<Pnn> pnns) {
		this.pnns = pnns;
	}

}
