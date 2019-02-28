package com.david.api.services;

import java.util.List;

import com.david.api.model.Contato;

public interface ContatoService {

	List<Contato> listarTodos();

	Contato listarPorId(String id);

	Contato contatoCreate(Contato contato);

	Contato contatoUpdate(Contato contato);

	void delete(String id);
}
