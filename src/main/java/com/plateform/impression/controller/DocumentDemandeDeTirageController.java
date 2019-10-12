package com.plateform.impression.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.plateform.impression.dao.DocumentDemandeDeTirageDao;
import com.plateform.impression.exception.ObjetIntrouvableException;
import com.plateform.impression.model.DocumentDemandeDeTirage;
import com.plateform.impression.model.DocumentDemandeDeTiragePK;

@RestController
public class DocumentDemandeDeTirageController {

	@Autowired
	protected DocumentDemandeDeTirageDao documentDemandeDeTirageDao;

	@GetMapping(value = "/DocumentDemandeDeTirage")
	public List<DocumentDemandeDeTirage> listeDocumentsDemandesDeTirage() {
		return documentDemandeDeTirageDao.findAll();
	}

	@GetMapping(value = "/DocumentDemandeDeTirage/{id}")
	public DocumentDemandeDeTirage afficherUnDocumentDemandeDeTirage(@PathVariable DocumentDemandeDeTiragePK id) {
		Optional<DocumentDemandeDeTirage> documentDemandeDeTirage = documentDemandeDeTirageDao.findById(id);
		if (documentDemandeDeTirage.isPresent()) {
			return documentDemandeDeTirage.get();
		} else {
			throw new ObjetIntrouvableException(
					"DocumentDemandeDeTirage avec identifiant = " + id + " est introuvable");
		}
	}

	@PostMapping(value = "/DocumentDemandeDeTirage")
	public void ajouterDocumentDemandeDeTirage(@RequestBody DocumentDemandeDeTirage documentDemandeDeTirage) {
		documentDemandeDeTirageDao.save(documentDemandeDeTirage);
	}

	@DeleteMapping(value = "/DocumentDemandeDeTirage/{id}")
	public void supprimerDocumentDemandeDeTirage(@PathVariable DocumentDemandeDeTiragePK id) {
		documentDemandeDeTirageDao.deleteById(id);
	}

	@PutMapping(value = "/DocumentDemandeDeTirage")
	public void updateDocumentDemandeDeTirage(@RequestBody DocumentDemandeDeTirage documentDemandeDeTirage) {
		documentDemandeDeTirageDao.save(documentDemandeDeTirage);
	}

}
