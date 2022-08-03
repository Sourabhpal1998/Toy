package com.toy.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.toy.entity.Toy;
import com.toy.exception.ResourceNotFoundException;
import com.toy.repositiory.ToyRepositiory;
import com.toy.service.ToyService;

@Service
public class ToyImpl implements ToyService {
	
	@Autowired
	private ToyRepositiory toyRepositiory;

	@Override
	public Toy saveToy(Toy toy) {
		return toyRepositiory.save(toy);
	}

	@Override
	public List<Toy> allToys() {
		return toyRepositiory.findAll();
	}

	@Override
	public String updatePrice(Toy toy, Long id) {
		Toy toys = toyRepositiory.findById(id).orElseThrow(()-> new ResourceNotFoundException("Toy id is invalid"));
		toys.setPrice(toy.getPrice());
		toyRepositiory.save(toys);
		return "Update";
	}

	@Override
	public String deleteToy(Long id) {
		Toy toy = toyRepositiory.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id is invalid"));
		toyRepositiory.delete(toy);
		return "Deleted";
	}
	

}
