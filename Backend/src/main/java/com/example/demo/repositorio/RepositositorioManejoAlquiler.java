package com.example.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modelo.ManejoAlquiler;

@Repository
public interface RepositositorioManejoAlquiler extends JpaRepository<ManejoAlquiler, Long> {
	
	

}
