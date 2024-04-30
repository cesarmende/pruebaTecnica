package com.prueba.axa.service;

import com.prueba.axa.entity.PersonaDto;

public interface ConsumeService {
	public String consumeApiGet();
	public String consumeApiPost(PersonaDto persona);
}
