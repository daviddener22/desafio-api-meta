package com.david.api.model;

import javax.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Contato {

	@Id
	private String id;
	
	@NotEmpty(message = "Nome não pode ser vazio")
	private String nome;

	@NotEmpty(message = "Canal não pode ser vazio")
	private String canal;
	
	@NotEmpty(message = "Valor do Canal não pode ser vazio")
	private String valor;
	
	private String obs;

	public Contato() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

}
