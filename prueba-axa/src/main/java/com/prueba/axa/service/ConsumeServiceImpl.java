package com.prueba.axa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.prueba.axa.entity.PersonaDto;

@Service
public class ConsumeServiceImpl implements ConsumeService {

	@Value("${uri.external.endpoint}")
	private String url;

	private RestTemplate restTemplate;

	@Autowired
	public ConsumeServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public String consumeApiGet() {

		try {
			String resultResp = restTemplate.getForObject(url, String.class);
			return resultResp;
		} catch (HttpStatusCodeException e) {
			System.out.println("Error from server: " + e.getStatusCode() + " - " + e.getResponseBodyAsString());
			return "Error from server: " + e.getStatusCode() + " - " + e.getResponseBodyAsString();
		} catch (IllegalArgumentException e) {
			return "Error from server: " + e.getStackTrace();
		}
	}

	@Override
	public String consumeApiPost(PersonaDto persona) {

		try {
			String resultResp = restTemplate.postForObject(url, persona, String.class);
			return resultResp;
		} catch (HttpStatusCodeException e) {
			System.out.println("Error from server: " + e.getStatusCode() + " - " + e.getResponseBodyAsString());
			return "Error from server: " + e.getStatusCode() + " - " + e.getResponseBodyAsString();
		} catch (IllegalArgumentException e) {
			return "Error from server: " + e.getStackTrace();
		}
	}

}
