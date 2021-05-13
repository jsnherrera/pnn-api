package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.dto.PnnDTO;
import com.api.dto.PnnResponse;
import com.api.repository.IPnnRepo;

@Service
public class PnnService {

	@Autowired
	private IPnnRepo repo;

	@Autowired
	private SingletonPnn singletonPnn;

	/*
	 * public PnnResponse findAll() { PnnResponse response = new PnnResponse(); try
	 * { List<Pnn> list = repo.findAll(); response.setCode(0);
	 * response.setMenssage("Success"); response.setPnns(list); } catch (Exception
	 * e) { response.setCode(-1); response.setMenssage(e.toString()); } return
	 * response; }
	 */

	public PnnResponse findAllSubscribersByNumber(String number) {
		PnnResponse response = new PnnResponse();
		try {

			if (number.length() != 10) {
				response.setCode(-1);
				response.setMenssage("La longitud del numero debe ser a 10 digitos");
				return response;
			}

			String key = number.substring(0, 6);
			PnnDTO pnnDTO = this.singletonPnn.getHashMapPnn().get(key);

			response.setPnn(pnnDTO);
			response.setCode(0);
			response.setMenssage("Success");

		} catch (Exception e) {
			response.setCode(-1);
			response.setMenssage(e.toString());
		}
		return response;
	}

}
