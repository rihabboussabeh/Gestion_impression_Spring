package com.plateform.impression.controller;

import java.util.List;

import javax.servlet.ServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.plateform.impression.dao.AdministrateurDao;
import com.plateform.impression.exception.ObjetIntrouvableException;
import com.plateform.impression.model.Administrateur;

@Controller
public class AdministrateurController {

	protected AdministrateurDao administrateurDao;

	@Autowired
	AdministrateurController(AdministrateurDao administrateurDao) {
		this.administrateurDao = administrateurDao;
	}

	@GetMapping(value = "/Administrateurs")
	public List<Administrateur> listeAdministrateurs() {
		return administrateurDao.findAll();
	}

	@GetMapping(value = "/Administrateur/{id}")
	public Administrateur afficherUnAdministrateur(@PathVariable int id) {
		Administrateur administrateur = administrateurDao.findById(id);
		if (administrateur == null) {
			throw new ObjetIntrouvableException("Administrateur avec identifiant = " + id + "est introuvable");
		}
		return administrateur;
	}

	@PostMapping(value = "/Administrateur")
	public void ajouterAdministrateur(@RequestBody Administrateur administrateur) {
		administrateurDao.save(administrateur);
	}

	@DeleteMapping(value = "/Administrateur/{id}")
	public void supprimerAdministrateur(@PathVariable int id) {
		administrateurDao.deleteById(id);
	}

	@PutMapping(value = "/Administrateur")
	public void updateAdministrateur(@RequestBody Administrateur administrateur) {
		administrateurDao.save(administrateur);
	}

	@GetMapping(value = "/Administrateur/Authentification")
	public String sAuthentifier(ServletRequest request, ModelMap modelMap) {
		Administrateur administrateur = administrateurDao.findByLoginAndMotDePasse(request.getParameter("login"),
				request.getParameter("motdepasse"));
		if (administrateur == null) {
			modelMap.addAttribute("erreur", "Veuillez vérifier vos paramètres d'authentification");
			return "administrateur_cnx";
		} else {
			modelMap.addAttribute("administrateur", administrateur);
			return "tableau_admin";
		}
	}

}
