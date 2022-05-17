package com.guilherme.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilherme.banklineapi.dtto.NovaMovimentacao;
import com.guilherme.banklineapi.dtto.NovoCorrentista;
import com.guilherme.banklineapi.model.Correntista;
import com.guilherme.banklineapi.model.Movimentacao;
import com.guilherme.banklineapi.repository.CorrentistaRepository;
import com.guilherme.banklineapi.repository.MovimentacaoRepository;
import com.guilherme.banklineapi.sevice.CorrentistaSevice;
import com.guilherme.banklineapi.sevice.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {
	
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService service;
	
	@GetMapping
	public List<Movimentacao> findAll(){
		return repository.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
	}
}
