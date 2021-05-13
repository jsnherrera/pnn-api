package com.api.service;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.HashMap;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.api.dto.PnnDTO;

@Service
@Scope("singleton")
public class SingletonPnn {

	private HashMap<String, PnnDTO> hashMapPnn = new HashMap<>();

	public HashMap<String, PnnDTO> getHashMapPnn() {
		return this.hashMapPnn;
	}

	public void setHashMapPnn(HashMap<String, PnnDTO> hashMapPnn) {
		this.hashMapPnn = hashMapPnn;
	}

	public SingletonPnn() {
		importarPnnCsv();
	}

	public void importarPnnCsv() {

		System.out.println("Se ejecuta importarPnnCsv");

		/*
		 * File dir = new File("./target/"); String[] ficheros = dir.list();
		 * 
		 * if (ficheros != null) { for (String str : ficheros) {
		 * System.out.println(str); } }
		 */

		try (Reader in = new FileReader("./target/classes/pnn.csv")) {

			Iterable<CSVRecord> records = CSVFormat.DEFAULT
					// .withHeader(HEADERS)
					.withFirstRecordAsHeader().parse(in);
			for (CSVRecord record : records) {

				String CLAVE_CENSAL = record.get(0);
				String POBLACION = record.get(1);
				String MUNICIPIO = record.get(2);
				String ESTADO = record.get(3);
				String NIR = record.get(4);
				String SERIE = record.get(5);
				String NUMERACION_INICIAL = record.get(6);
				String NUMERACION_FINAL = record.get(7);
				String RAZON_SOCIAL = record.get(8);
				String NOMBRE_CORTO = record.get(9);
				String ID_OPERADOR = record.get(10);

				PnnDTO pnnDTO = new PnnDTO(CLAVE_CENSAL, POBLACION, MUNICIPIO, ESTADO, ESTADO, NIR, SERIE,
						NUMERACION_INICIAL, NUMERACION_FINAL, RAZON_SOCIAL, NOMBRE_CORTO, ID_OPERADOR);

				String number = NIR + SERIE;
				this.hashMapPnn.put(number, pnnDTO);

			}

		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}

}
