package com.store.mygame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.mygame.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findByDescricaoContainingIgnoreCase(String descricao);
}
