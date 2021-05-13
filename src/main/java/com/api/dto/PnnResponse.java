package com.api.dto;

public class PnnResponse {

	private int code;
	private String menssage;
	private PnnDTO pnn;

	public PnnDTO getPnn() {
		return pnn;
	}

	public void setPnn(PnnDTO pnn) {
		this.pnn = pnn;
	}

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

}
