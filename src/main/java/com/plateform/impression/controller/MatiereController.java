package com.plateform.impression.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.plateform.impression.dao.MatiereDao;
import com.plateform.impression.exception.ObjetIntrouvableException;
import com.plateform.impression.model.Matiere;

@RestController
public class MatiereController {

	@Autowired
	protected MatiereDao matiereDao;

	@GetMapping(value = "/Matieres")
	public List<Matiere> listeMatieres() {
		return matiereDao.findAll();
	}

	@GetMapping(value = "/Matieres/{id}")
	public Matiere afficherUneMatiere(@PathVariable int id) {
		Matiere matiere = matiereDao.findById(id);
		if (matiere == null) {
			throw new ObjetIntrouvableException("Matiere avec identifiant = " + id + " est introuvable");
		}
		return matiere;
	}

	@PostMapping(value = "/Matiere")
	public void ajouterMatiere(@RequestBody Matiere matiere) {
		matiereDao.save(matiere);
	}

	@DeleteMapping(value = "/Matieres/{id}")
	public void supprimerMatiere(@PathVariable int id) {
		matiereDao.deleteById(id);
	}

	@PutMapping(value = "/Matiere")
	public void updateMatiere(@RequestBody Matiere matiere) {
		matiereDao.save(matiere);
	}

}
