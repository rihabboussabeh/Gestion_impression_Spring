package com.plateform.impression.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping(value = { "/", "/index" })
	public String index(ModelMap modelMap) {
		return "index";
	}

	@GetMapping(value = "administrateur_cnx")
	public String administrateurCnx(ModelMap modelMap) {
		return "administrateur_cnx";
	}

	@GetMapping(value = "agentdetirage_cnx")
	public String agentdetirageCnx(ModelMap modelMap) {
		return "agentdetirage_cnx";
	}

	@GetMapping(value = "enseignant_cnx")
	public String enseignantCnx(ModelMap modelMap) {
		return "enseignant_cnx";
	}

}
