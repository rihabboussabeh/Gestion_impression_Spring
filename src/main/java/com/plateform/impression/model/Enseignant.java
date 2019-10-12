package com.plateform.impression.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "Enseignant")
public class Enseignant extends Utilisateur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3913420977981191902L;

	private static final String ERREUR2 = "Ce champ doit être alphaNumérique";
	private static final String PATTERN2 = "^[A-Za-z0-9]+$";
	@Id
	@GeneratedValue
	@Column(name = "ID_ENSEIGNANT")
	private int idEnseignant;
	@Length(min = 3, max = 20, message = ERREUR + "min = 3 , max = 20")
	@Pattern(regexp = PATTERN2, message = ERREUR2)
	@Column(name = "NOM")
	private String nom;
	@Length(min = 3, max = 20, message = ERREUR + "min = 3 , max = 20")
	@Pattern(regexp = PATTERN2, message = ERREUR2)
	@Column(name = "PRENOM")
	private String prenom;
	@Length(min = 4, max = 30, message = ERREUR + "min = 4 , max = 30")
	@Pattern(regexp = PATTERN2, message = ERREUR2)
	@Column(name = "DEPARTEMENT")
	private String departement;

	public Enseignant() {
		super();
	}

	public Enseignant(
			@Length(min = 3, max = 20, message = ERREUR
					+ "min = 3 , max = 20") @Pattern(regexp = PATTERN1, message = ERREUR1) String login,
			@Length(min = 3, max = 20, message = ERREUR + "min = 3 , max = 20") String motDePasse,
			@Length(min = 3, max = 20, message = ERREUR
					+ "min = 3 , max = 20") @Pattern(regexp = PATTERN2, message = ERREUR2) String nom,
			@Length(min = 3, max = 20, message = ERREUR
					+ "min = 3 , max = 20") @Pattern(regexp = PATTERN2, message = ERREUR2) String prenom,
			@Length(min = 4, max = 30, message = ERREUR
					+ "min = 4 , max = 30") @Pattern(regexp = PATTERN2, message = ERREUR2) String departement) {
		super(login, motDePasse);
		this.nom = nom;
		this.prenom = prenom;
		this.departement = departement;
	}

	public Enseignant(
			@Length(min = 3, max = 20, message = ERREUR
					+ "min = 3 , max = 20") @Pattern(regexp = PATTERN1, message = ERREUR1) String login,
			@Length(min = 3, max = 20, message = ERREUR + "min = 3 , max = 20") String motDePasse, int idEnseignant,
			@Length(min = 3, max = 20, message = ERREUR
					+ "min = 3 , max = 20") @Pattern(regexp = PATTERN2, message = ERREUR2) String nom,
			@Length(min = 3, max = 20, message = ERREUR
					+ "min = 3 , max = 20") @Pattern(regexp = PATTERN2, message = ERREUR2) String prenom,
			@Length(min = 4, max = 30, message = ERREUR
					+ "min = 4 , max = 30") @Pattern(regexp = PATTERN2, message = ERREUR2) String departement) {
		super(login, motDePasse);
		this.idEnseignant = idEnseignant;
		this.nom = nom;
		this.prenom = prenom;
		this.departement = departement;
	}

	public int getIdEnseignant() {
		return idEnseignant;
	}

	public void setIdEnseignant(int idEnseignant) {
		this.idEnseignant = idEnseignant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}


	@Override
	public String toString() {
		return "Enseignant [idEnseignant=" + idEnseignant + ", nom=" + nom + ", prenom=" + prenom + ", departement="
				+ departement + "]";
	}

}
