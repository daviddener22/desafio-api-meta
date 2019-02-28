package com.david.api.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.api.services.ContatoService;
import com.david.api.model.Contato;
import com.david.api.responses.Response;

@RestController
@RequestMapping(path = "/api/contatos")
public class ContatoController {

	@Autowired
	private ContatoService contatoService;

	@GetMapping
	public ResponseEntity<Response<List<Contato>>> listarTodos() {
		return ResponseEntity.ok(new Response<List<Contato>>(this.contatoService.listarTodos()));
	}

	@GetMapping(path = "/{idContato}")
	public ResponseEntity<Response<Contato>> listarPorId(@PathVariable(name = "id") String id) {
		return ResponseEntity.ok(new Response<Contato>(this.contatoService.listarPorId(id)));
	}

	@PostMapping
	public ResponseEntity<Response<Contato>> contatoCreate(@Valid @RequestBody Contato contato, BindingResult result) {
		if (result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Contato>(erros));
		}
		return ResponseEntity.ok(new Response<Contato>(this.contatoService.contatoUpdate(contato)));
	}

	@PutMapping(path = "/{idContato}")
	public ResponseEntity<Response<Contato>> contatoUpdate(@PathVariable(name = "id") String id,
			@Valid @RequestBody Contato contato, BindingResult result) {
		if (result.hasErrors()) {
			List<String> erros = new ArrayList<String>();
			result.getAllErrors().forEach(erro -> erros.add(erro.getDefaultMessage()));
			return ResponseEntity.badRequest().body(new Response<Contato>(erros));
		}

		contato.setId(id);
		return ResponseEntity.ok(new Response<Contato>(this.contatoService.contatoUpdate(contato)));
	}

	@DeleteMapping(path = "/{idContato}")
	public ResponseEntity<Response<Integer>> delete(@PathVariable(name = "id") String id) {
		this.contatoService.delete(id);
		return ResponseEntity.ok(new Response<Integer>(1));
	}
}
