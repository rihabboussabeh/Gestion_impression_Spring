package com.plateform.impression.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@MappedSuperclass
public class Utilisateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6613935830899634889L;

	protected static final String ERREUR = "Contrainte de longeur non respectée : ";
	protected static final String ERREUR1 = "Ce champ doit être alphaNumérique";
	protected static final String PATTERN1 = "^[A-Za-z0-9]+$";

	@Length(min = 3, max = 20, message = ERREUR + "min = 3 , max = 20")
	@Pattern(regexp = PATTERN1, message = ERREUR1)
	@Column(name = "LOGIN")
	private String login;
	@Length(min = 3, max = 20, message = ERREUR + "min = 3 , max = 20")
	@Column(name = "MOT_DE_PASSE")
	private String motDePasse;

	public Utilisateur() {
		super();
	}

	public Utilisateur(
			@Length(min = 3, max = 20, message = ERREUR
					+ "min = 3 , max = 20") @Pattern(regexp = PATTERN1, message = ERREUR1) String login,
			@Length(min = 3, max = 20, message = ERREUR + "min = 3 , max = 20") String motDePasse) {
		super();
		this.login = login;
		this.motDePasse = motDePasse;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	@Override
	public String toString() {
		return "Utilisateur [login=" + login + ", motDePasse=" + motDePasse + "]";
	}

}
