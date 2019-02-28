package com.david.api.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.david.api.model.Contato;

public interface ContatoRepository extends MongoRepository<Contato, String> {

}
