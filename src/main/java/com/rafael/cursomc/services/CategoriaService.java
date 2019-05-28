package com.rafael.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafael.cursomc.domain.Categoria;
import com.rafael.cursomc.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscarPorCategoria(Integer Id) {
		Optional<Categoria> obj = repo.findById(Id);
		return obj.orElse(null);
		
	}
	
	

}
