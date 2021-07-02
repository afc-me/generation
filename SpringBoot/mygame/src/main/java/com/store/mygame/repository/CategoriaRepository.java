package com.store.mygame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.store.mygame.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findByDescricaoContainingIgnoreCase(String descricao);
}
