package com.eduardomatsuda.minhasfinancas.model.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import com.eduardomatsuda.minhasfinancas.model.entity.Usuario;

@ExtendWith(Extension.class)
@SpringBootTest
@ActiveProfiles("test")
@DataJpaTest
public class UsuarioRepositoryTest {

	@Autowired
	UsuarioRepository repository;
	
	@Test
	public void deveVerificarAExistenciaDeUmEmail() {
		//Cenário
		Usuario usuario =  Usuario.builder().nome("usuario").email("usuario@usuario.com").build();
		repository.save(usuario);
		
		//Ação / Execução
		boolean result = repository.existsByEmail("usuario@usuario.com");
		
		//Verificação
		Assertions.assertThat(result).isTrue();
	}
}
