package com.smartgraphe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartgraphe.model.Livre;
import com.smartgraphe.service.LivreService;

@CrossOrigin
@RestController
@RequestMapping("/api/livre")
public class LivreController {

	@Autowired
	private final LivreService livreService;

	LivreController(LivreService livreService) {
		this.livreService = livreService;
	}

	@GetMapping()
	public List<Livre> getAllLivres() {
		return livreService.getAllLivres();
	}

	@GetMapping("{nomLivre}")
	public Livre getLivre(@PathVariable String nomLivre) {
		return livreService.getLivre(nomLivre);
	}

	@PostMapping()
	public Livre addLivre(@RequestBody Livre livre) {
		return livreService.addLivre(livre);
	}

	@PutMapping()
	public Livre editLivre(@RequestBody Livre livre) {
		return livreService.editLivre(livre);
	}

	@DeleteMapping("/{nomLivre}")
	public void deleteLivre(@PathVariable String nomLivre) {
		livreService.deleteLivre(nomLivre);
	}
}
