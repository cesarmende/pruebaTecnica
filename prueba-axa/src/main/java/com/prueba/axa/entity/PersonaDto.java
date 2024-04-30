package com.prueba.axa.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class PersonaDto {
	
	
	@NotNull(message = "el campo name es obligatorio")
	@NotEmpty(message = "el campo no puede estar vacio")
	@Size(max=50,  message="El tamaño del texto debe ser menor a 50 carateres")
	@Pattern(regexp = "(([A-Z][a-z]+($|\s)))*", message="El formato del name debe tener camel case")
	private String name;
	
	@NotNull(message = "el campo name es obligatorio")
	@NotEmpty(message = "el campo no puede estar vacio")
	@Pattern(regexp = "[0-9]{2}", message="el formato de la age debe ser 99")
	private String age;
	
	@NotNull(message = "el campo name es obligatorio")
	@NotEmpty(message = "el campo no puede estar vacio")
	@Pattern(regexp = "[0-9]{10}", message="el formato del phoneNumber debe ser 999999999")
	private String phoneNumber;
	
	@NotNull(message = "el campo name es obligatorio")
	@NotEmpty(message = "el campo no puede estar vacio")
	@Pattern(regexp = "[a-zA-Z]{5}\s[0-9]{2}\s#\s[0-9]{2}[A-Za-z]{0,3}\s-\s[0-9]{2}[A-Za-z]{0,3}", message="Se debe verificar el formato XXXXX 99 # 99XXX – 99XX")
	private String address;
}
