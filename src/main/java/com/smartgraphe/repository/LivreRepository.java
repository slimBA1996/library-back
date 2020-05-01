package com.smartgraphe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.smartgraphe.model.Livre;

@Repository
public interface LivreRepository extends MongoRepository<Livre, String> {

	public Livre findByNomLivre(String nomLivre);
}
