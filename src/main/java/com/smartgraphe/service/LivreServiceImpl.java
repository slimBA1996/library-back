package com.smartgraphe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartgraphe.model.Livre;
import com.smartgraphe.repository.LivreRepository;

@Service
public class LivreServiceImpl implements LivreService {
	
	
	@Autowired
	LivreRepository livreRepository;

	@Override
	public List<Livre> getAllLivres() {
		return livreRepository.findAll();
	}
	
	@Override
	public Livre getLivre(String nomLivre) {
		return livreRepository.findByNomLivre(nomLivre);
	}
	
	@Override
	public Livre addLivre(Livre livre) {
		try {
			return livreRepository.save(livre);
		}catch(Exception e) {
			System.out.println("Une erreur a eu lieu lors de l'enregistrement");
		}
		return null;
	}
	
	@Override
	public Livre editLivre(Livre livre) {
		try {
			Livre livreToUpdate = getLivre(livre.getNomLivre());
			livreToUpdate.setDescriptionLivre(livre.getDescriptionLivre());
			return livreRepository.save(livreToUpdate);
		}catch(Exception e) {
			System.out.println("Aucun livre à modifier dans la base");
		}
		return null;
	}

	
	@Override
	public void deleteLivre(String nomLivre) {
		try {
			Livre livreToDelete = getLivre(nomLivre);
	        livreRepository.delete(livreToDelete);
		}catch(Exception e) {
			System.out.println("Aucun livre à supprimer dans la base");
		}
	}
}
