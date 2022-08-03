package com.toy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.toy.entity.Toy;
import com.toy.service.ToyService;

@RestController
public class ToyController {
	
	@Autowired
	private ToyService toyService;
	
	@PostMapping("/save/toy")
    public Toy saveToy(@RequestBody Toy toy) {
    	return toyService.saveToy(toy);
    }
	
	@GetMapping("/find/all")
	public List<Toy> allToys(){
		return toyService.allToys();
	}
	
	@PutMapping("/update/price/{id}")
	public String updatePrice(@RequestBody Toy toy, @PathVariable Long id) {
		return toyService.updatePrice(toy, id);
	}
	
	@DeleteMapping("/delete/toy/{id}")
	public String deleteToy(@PathVariable Long id) {
		return toyService.deleteToy(id);
	}


}
