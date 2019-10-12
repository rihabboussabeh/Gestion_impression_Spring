package com.plateform.impression.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "ADMINISTRATEUR")
public class Administrateur extends Utilisateur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2205047909881491005L;

	@Id
	@GeneratedValue
	@Column(name = "ID_ADMINISTRATEUR")
	private int idAdministrateur;

	public Administrateur() {
		super();
	}

	public Administrateur(
			@Length(min = 3, max = 20, message = ERREUR
					+ "min = 3 , max = 20") @Pattern(regexp = PATTERN1, message = ERREUR1) String login,
			@Length(min = 3, max = 20, message = ERREUR + "min = 3 , max = 20") String motDePasse,
			int idAdministrateur) {
		super(login, motDePasse);
		this.idAdministrateur = idAdministrateur;
	}

	public int getIdAdministrateur() {
		return idAdministrateur;
	}

	public void setIdAdministrateur(int idAdministrateur) {
		this.idAdministrateur = idAdministrateur;
	}

	@Override
	public String toString() {
		return "Administrateur [idAdministrateur=" + idAdministrateur + ", " + super.toString() + "]";
	}

}
