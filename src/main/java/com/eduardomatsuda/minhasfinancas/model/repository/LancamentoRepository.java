package com.eduardomatsuda.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduardomatsuda.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
