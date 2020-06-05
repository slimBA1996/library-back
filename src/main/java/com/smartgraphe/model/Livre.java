package com.smartgraphe.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author slim
 *
 */
@Document
public class Livre {

	
	@Id
	private String id; 
	@Indexed(unique=true)
	private String nomLivre; //book name
	
	private String descriptionLivre; //description of the book 

	public Livre(String nomLivre, String descriptionLivre) {
		super();
		this.nomLivre = nomLivre;
		this.descriptionLivre = descriptionLivre;
	}

	public String getId() {
		return id;
	}

	public String getNomLivre() {
		return nomLivre;
	}

	public String getDescriptionLivre() {
		return descriptionLivre;
	}

	public void setNomLivre(String nomLivre) {
		this.nomLivre = nomLivre;
	}

	public void setDescriptionLivre(String descriptionLivre) {
		this.descriptionLivre = descriptionLivre;
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", nomLivre=" + nomLivre + ", descriptionLivre=" + descriptionLivre + "]";
	}

}
