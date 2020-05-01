package com.smartgraphe.service;

import java.util.List;

import com.smartgraphe.model.Livre;

public interface LivreService {

	public List<Livre> getAllLivres();
	public Livre getLivre(String nomLivre);
	public Livre addLivre(Livre livre);
	public Livre editLivre(Livre livre);
	public void deleteLivre(String nomLivre);
}
