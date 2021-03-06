package com.petstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petstore.entities.Pet;
import com.petstore.services.PetService;

@RestController
@RequestMapping("pet-store/pets")
public class PetController {

	@Autowired
	PetService petService;

	@PostMapping
	public ResponseEntity<?> savePet(@RequestBody Pet pet) {
		try {
			return new ResponseEntity<Pet>(petService.savePet(pet), HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping
	public ResponseEntity<?> getPets() {
		try {
			return new ResponseEntity<List<Pet>>(petService.getPets(), HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping("{id}")
	public ResponseEntity<?> getPetById(@PathVariable Long id) {
		try {
			return new ResponseEntity<Pet>(petService.getPetById(id), HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}

}
