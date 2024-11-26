package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.DairyFarm;
import com.nt.service.DairyFarmService;

import jakarta.websocket.server.PathParam;

@RestController
@CrossOrigin(origins = "http://localhost:3000") 
public class DairyFarmController {

	@Autowired
	private DairyFarmService service;

	@PostMapping("/addProducts")
	public ResponseEntity<DairyFarm> createProduct(@RequestBody  DairyFarm DairyFarm) {
		System.out.println("------creation-------");
		 DairyFarm prodResp = service.createProduct(DairyFarm);
		return new ResponseEntity<>(prodResp, HttpStatus.CREATED);

	}

    @GetMapping("/findAllproducts")
	public ResponseEntity<List<DairyFarm>> getAllProducts() {
		 List<DairyFarm> resp = service.getAllProducts();
		return new ResponseEntity<>(resp, HttpStatus.OK);
	 
	}
    

	@GetMapping("/finById/{id}")
	public ResponseEntity<DairyFarm> finById(@PathVariable final Long id) {
		return new ResponseEntity<>(service.findByIdProduct(id), HttpStatus.OK);
	}

	@DeleteMapping("/deleteProduct/{userId}")
	public ResponseEntity<String> deleteProduct(@PathVariable final Long userId) {
		return new ResponseEntity<>(service.deleteProduct(userId), HttpStatus.OK);
	}
	
	

	@PutMapping("/updateProducts/{prodId}")
	public ResponseEntity<String> updateProduct(@PathVariable Long prodId,
			@RequestBody DairyFarm daiary) {
		String prodResp = service.upateProduct(prodId, daiary);
		return new ResponseEntity<>(prodResp, HttpStatus.OK);

	}


}
