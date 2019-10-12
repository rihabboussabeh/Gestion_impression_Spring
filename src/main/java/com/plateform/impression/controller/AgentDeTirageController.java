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

import com.plateform.impression.dao.AgentDeTirageDao;
import com.plateform.impression.exception.ObjetIntrouvableException;
import com.plateform.impression.model.AgentDeTirage;

@RestController
public class AgentDeTirageController {

	@Autowired
	protected AgentDeTirageDao agentDeTirageDao;

	@GetMapping(value = "/AgentsDeTirage")
	public List<AgentDeTirage> listeAgentsDeTirage() {
		return agentDeTirageDao.findAll();
	}

	@GetMapping(value = "/AgentsDeTirage/{id}")
	public AgentDeTirage afficherUnAgentDeTirage(@PathVariable int id) {
		AgentDeTirage agentDeTirage = agentDeTirageDao.findById(id);
		if (agentDeTirage == null) {
			throw new ObjetIntrouvableException("Agent de tirage avec identifiant = " + id + " est introuvable");
		}
		return agentDeTirage;
	}

	@PostMapping(value = "/AgentDeTirage")
	public void ajouterAgentDeTirage(@RequestBody AgentDeTirage agentDeTirage) {
		agentDeTirageDao.save(agentDeTirage);
	}

	@DeleteMapping(value = "/AgentsDeTirage/{id}")
	public void supprimerAgentDeTirage(@PathVariable int id) {
		agentDeTirageDao.deleteById(id);
	}

	@PutMapping(value = "/AgentDeTirage")
	public void updateAgentDeTirage(@RequestBody AgentDeTirage agentDeTirage) {
		agentDeTirageDao.save(agentDeTirage);
	}

	@GetMapping(value = "/AgentDeTirage/Authentification")
	public AgentDeTirage sAuthentifier(ServletRequest request) {
		return agentDeTirageDao.findByLoginAndMotDePasse(request.getParameter("login"),
				request.getParameter("motdepasse"));
	}
}
