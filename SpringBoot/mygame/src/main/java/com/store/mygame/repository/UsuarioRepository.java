package com.store.mygame.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.mygame.model.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario (String usuario);

}
