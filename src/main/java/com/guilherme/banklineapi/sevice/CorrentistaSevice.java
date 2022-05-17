package com.guilherme.banklineapi.sevice;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.banklineapi.dtto.NovoCorrentista;
import com.guilherme.banklineapi.model.Conta;
import com.guilherme.banklineapi.model.Correntista;
import com.guilherme.banklineapi.repository.CorrentistaRepository;

@Service
public class CorrentistaSevice {
	
	@Autowired
	private CorrentistaRepository repository;
	
	public void save(NovoCorrentista novoCorrentista) {
		Correntista correntista = new Correntista();
		correntista.setCpf(novoCorrentista.getCpf());
		correntista.setNome(novoCorrentista.getNome());
		
		Conta conta = new Conta();
		conta.setSaldo(0.0);
		conta.setNumero(new Date().getTime());
		correntista.setConta(conta);
		
		repository.save(correntista);
		
	}
}
