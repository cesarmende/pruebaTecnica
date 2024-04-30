package com.prueba.axa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.prueba.axa.entity.PersonaDto;
import com.prueba.axa.service.ConsumeService;

import jakarta.validation.Valid;

@Controller
public class ConsumerController {

	@Autowired
	public ConsumeService service;

	@GetMapping("/home")
	public String index() {
		return "index";
	}

	@GetMapping("/findAll")
	public String findAll(Model model) {
		String result = consulta().getBody().toString();
		model.addAttribute("result", result);
		return "findAll";
	}

	@PostMapping("/create")
	public String create(Model model,@Valid PersonaDto persona, BindingResult bindingResult) {
		String result = "";
		List<String> errores = new ArrayList<String>();
		if (bindingResult.hasErrors()) {
			for (ObjectError error : bindingResult.getAllErrors()) {
				errores.add(error.getDefaultMessage());
			}
			result="Validacion fallo \n" + errores;
		} else {
			
		  	result=crea(persona,bindingResult).getBody().toString();
		}
		model.addAttribute("result",result);
		return "index";
		
	}

	@GetMapping("/")
	public ResponseEntity<?> consulta() {
		try {
			String respuesta = service.consumeApiGet();
			if (!respuesta.contains("Error")) {
				return ResponseEntity.status(HttpStatus.OK).body(respuesta);
			} else {
				return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(respuesta);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Error de ejecucion");
		}

	}

	@PostMapping("/")
	public ResponseEntity<?> crea(@Valid @RequestBody PersonaDto persona, BindingResult bindingResult) {
		List<String> errores = new ArrayList<String>();
		String respuesta;
		if (bindingResult.hasErrors()) {
			for (ObjectError error : bindingResult.getAllErrors()) {
				errores.add(error.getDefaultMessage());
			}
			return ResponseEntity.badRequest().body("Validacion fallo \n" + errores);
		}
		try {
			respuesta = service.consumeApiPost(persona);
			if (!respuesta.contains("Error")) {
				return ResponseEntity.status(HttpStatus.CREATED).body(respuesta);
			} else {
				return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(respuesta);
			}
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_GATEWAY).body("Error de ejecucion");
		}

	}

}
