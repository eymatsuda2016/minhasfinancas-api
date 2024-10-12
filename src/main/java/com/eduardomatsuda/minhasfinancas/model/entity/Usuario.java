package com.eduardomatsuda.minhasfinancas.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Table(name= "usuario", schema = "financas")
@Builder
@Data
public class Usuario {
	
	@Id
	@Column(name= "código")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "nome")
	private String nome;
	
	@Column(name="email")
	private String email;
	
	@Column(name = "senha")
	private String senha;
}
