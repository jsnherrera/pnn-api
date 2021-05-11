package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dto.PnnResponse;
import com.api.model.Pnn;
import com.api.repository.IPnnRepo;

@Service
public class PnnService {

	@Autowired
	private IPnnRepo repo;

	public PnnResponse findAll() {
		PnnResponse response = new PnnResponse();
		try {
			List<Pnn> list = repo.findAll();
			response.setCode(0);
			response.setMenssage("Success");
			response.setPnns(list);
		} catch (Exception e) {
			response.setCode(-1);
			response.setMenssage(e.toString());
		}
		return response;
	}

	public PnnResponse findAllSubscribersByNumber(String number) {
		PnnResponse response = new PnnResponse();
		try {
			List<Pnn> list = repo.findAllSubscribersByNumber(number);
			response.setCode(0);
			response.setMenssage("Success");
			response.setPnns(list);
		} catch (Exception e) {
			response.setCode(-1);
			response.setMenssage(e.toString());
		}
		return response;
	}

}
