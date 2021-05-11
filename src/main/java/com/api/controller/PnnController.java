package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.dto.PnnResponse;
import com.api.service.PnnService;

@RestController
@RequestMapping(value = "/v1/api")
@CrossOrigin("*")
public class PnnController {

	@Autowired
	private PnnService service;

	/*
	 * @GetMapping(value = "/getPnn") public PnnResponse getPnn() { PnnResponse
	 * response = new PnnResponse(); try { response = service.findAll(); } catch
	 * (Exception e) { response.setCode(-1); response.setMenssage(e.toString()); }
	 * return response; }
	 */

	@GetMapping(value = "/getPnnByNumber")
	public PnnResponse getPnnByNumber(@RequestParam(name = "number", required = true) Long number) {
		PnnResponse response = new PnnResponse();
		try {
			response = service.findAllSubscribersByNumber(String.valueOf(number));
		} catch (Exception e) {
			response.setCode(-1);
			response.setMenssage(e.toString());
		}
		return response;
	}

}
