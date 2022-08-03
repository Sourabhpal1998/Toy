package com.toy.repositiory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.toy.entity.Toy;

@Repository
public interface ToyRepositiory extends JpaRepository<Toy, Long> {

}
