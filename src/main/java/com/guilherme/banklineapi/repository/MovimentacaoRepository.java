package com.guilherme.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.banklineapi.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {

}
