package com.guilherme.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.banklineapi.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}
