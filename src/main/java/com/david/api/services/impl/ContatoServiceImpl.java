package com.david.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.david.api.model.Contato;
import com.david.api.repositories.ContatoRepository;
import com.david.api.services.ContatoService;

@Service
public class ContatoServiceImpl implements ContatoService {
	
	@Autowired
	private ContatoRepository contatoRepository;

	@Override
	public List<Contato> listarTodos() {
		return this.contatoRepository.findAll();
	}

	@Override
	public Contato listarPorId(String id) {
		return this.contatoRepository.findById(id).orElse(null);
	}
	
	@Override
	public Contato contatoCreate(Contato contato) {
		return this.contatoRepository.save(contato);
	}

	@Override
	public Contato contatoUpdate(Contato contato) {
		return this.contatoRepository.save(contato);
	}

	@Override
	public void delete(String id) {
		this.contatoRepository.deleteById(id);

	}

}
