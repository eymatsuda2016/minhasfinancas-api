package com.eduardomatsuda.minhasfinancas.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardomatsuda.minhasfinancas.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	boolean existsByEmail(String email);
}
