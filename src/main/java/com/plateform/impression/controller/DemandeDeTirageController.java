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

import com.plateform.impression.dao.DemandeDeTirageDao;
import com.plateform.impression.exception.ObjetIntrouvableException;
import com.plateform.impression.model.DemandeDeTirage;

@RestController
public class DemandeDeTirageController {

	@Autowired
	protected DemandeDeTirageDao demandeDeTirageDao;

	@GetMapping(value = "/DemandesDeTirage")
	public List<DemandeDeTirage> listeDemandesDeTirages() {
		return demandeDeTirageDao.findAll();
	}

	@GetMapping(value = "/DemandesDeTirage/{id}")
	public DemandeDeTirage afficherUneDemandeDeTirage(@PathVariable int id) {
		DemandeDeTirage demandeDeTirage = demandeDeTirageDao.findById(id);
		if (demandeDeTirage == null) {
			throw new ObjetIntrouvableException("Demande de tirage avec identifiant = " + id + " est introuvable");
		}
		return demandeDeTirage;
	}

	@PostMapping(value = "/DemandeDeTirage")
	public void ajouterDemandeDeTirage(@RequestBody DemandeDeTirage demandeDeTirage) {
		demandeDeTirageDao.save(demandeDeTirage);
	}

	@DeleteMapping(value = "/DemandesDeTirage/{id}")
	public void supprimerDemandeDeTirage(@PathVariable int id) {
		demandeDeTirageDao.deleteById(id);
	}

	@PutMapping(value = "/DemandeDeTirage")
	public void updateDemandeDeTirage(@RequestBody DemandeDeTirage demandeDeTirage) {
		demandeDeTirageDao.save(demandeDeTirage);
	}

}
