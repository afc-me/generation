package com.bd.farmacia.controller;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bd.farmacia.model.Produto;
import com.bd.farmacia.repository.ProdutoRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired
	private ProdutoRepository prodrepos;
	
	@GetMapping
	public ResponseEntity<List<Produto>> getAll(){
		return ResponseEntity.ok(prodrepos.findAll());
	}
	@GetMapping("/{prodId}")
	public ResponseEntity<Produto> GetById(@PathVariable long prodId) {
		return prodrepos.findById(prodId).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/des/{descricao}")
	public ResponseEntity<List<Produto>> GetByDescricaoCategoria(@PathVariable String descricao) {
		return ResponseEntity.ok(prodrepos.findByDescricaoContainingIgnoreCase(descricao));
	}
	@PostMapping
	public ResponseEntity<Produto> post(@RequestBody Produto produto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(prodrepos.save(produto));
	}

	@PutMapping
	public ResponseEntity<Produto> put(@RequestBody Produto produto) {
		return ResponseEntity.status(HttpStatus.OK).body(prodrepos.save(produto));
	}

	@DeleteMapping("/{prodId}")
	public void delete(@PathVariable long prodId) {
		prodrepos.deleteById(prodId);
	}

}
