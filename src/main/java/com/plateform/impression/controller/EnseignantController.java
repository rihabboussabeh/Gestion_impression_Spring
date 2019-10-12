package com.plateform.impression.controller;

import java.util.List;

import javax.servlet.ServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.plateform.impression.dao.EnseignantDao;
import com.plateform.impression.exception.ObjetIntrouvableException;
import com.plateform.impression.model.Enseignant;

@RestController
public class EnseignantController {

	@Autowired
	protected EnseignantDao enseignantDao;

	@GetMapping(value = "/Enseignants")
	public List<Enseignant> listeEnseignants() {
		return enseignantDao.findAll();
	}

	@GetMapping(value = "/Enseignants/{id}")
	public Enseignant afficherUnEnseignant(@PathVariable int id) {
		Enseignant enseignant = enseignantDao.findById(id);
		if (enseignant == null) {
			throw new ObjetIntrouvableException("Enseignant avec identifiant = " + id + " est introuvable");
		}
		return enseignant;
	}

	@PostMapping(value = "/Enseignant")
	public void ajouterEnseignant(@RequestBody Enseignant enseignant) {
		enseignantDao.save(enseignant);
	}

	@DeleteMapping(value = "/Enseignants/{id}")
	public void supprimerEnseignant(@PathVariable int id) {
		enseignantDao.deleteById(id);
	}

	@PutMapping(value = "/Enseignant")
	public void updateEnseignant(@RequestBody Enseignant enseignant) {
		enseignantDao.save(enseignant);
	}

	@GetMapping(value = "/Enseignant/Authentification")
	public Enseignant sAuthentifier(ServletRequest request) {
		return enseignantDao.findByLoginAndMotDePasse(request.getParameter("login"),
				request.getParameter("motdepasse"));
	}

}
