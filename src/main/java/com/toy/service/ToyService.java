package com.toy.service;

import java.util.List;

import com.toy.entity.Toy;

public interface ToyService {
	
	public Toy saveToy(Toy toy);
	
	public List<Toy> allToys();
	
	public String updatePrice(Toy toy, Long id);
	
	public String deleteToy(Long id);

}
