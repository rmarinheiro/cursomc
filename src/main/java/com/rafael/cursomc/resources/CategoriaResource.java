package com.rafael.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.cursomc.domain.Categoria;
import com.rafael.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value ="/categorias")
public class CategoriaResource {
	
	/*@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1  = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2 , "Escritorio");
		
		List<Categoria> listaCategorias = new ArrayList<Categoria>();
		listaCategorias.add(cat1);
		listaCategorias.add(cat2);
		
		return listaCategorias;
		
	}*/
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Categoria obj = service.buscarPorCategoria(id);
		
		return ResponseEntity.ok().body(obj);
		
	}
	
	

}
