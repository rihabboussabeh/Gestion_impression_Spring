package com.plateform.impression.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "GROUPE")
public class Groupe implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2078420557856796945L;

	protected static final String ERREUR = "Contrainte de longeur non respectée : ";
	protected static final String ERREUR1 = "Ce champ doit être alphaNumérique";
	protected static final String PATTERN1 = "^[A-Za-z0-9]+$";

	@Id
	@GeneratedValue
	@Column(name = "ID_GROUPE")
	private int idGroupe;
	@Min(1)
	@Column(name = "NOMBRE_ETUDIANT")
	private int nombreEtudiants;
	@Length(min = 3, max = 20, message = ERREUR + "min = 4 , max = 10")
	@Pattern(regexp = PATTERN1, message = ERREUR1)
	@Column(name = "DESIGNATION")
	private String designation;

	public Groupe() {
	}

	public Groupe(@Min(1) int nombreEtudiants, @Length(min = 3, max = 20, message = ERREUR
			+ "min = 4 , max = 10") @Pattern(regexp = PATTERN1, message = ERREUR1) String designation) {
		this.nombreEtudiants = nombreEtudiants;
		this.designation = designation;
	}

	public Groupe(int idGroupe, @Min(1) int nombreEtudiants, @Length(min = 3, max = 20, message = ERREUR
			+ "min = 4 , max = 10") @Pattern(regexp = PATTERN1, message = ERREUR1) String designation) {
		this.idGroupe = idGroupe;
		this.nombreEtudiants = nombreEtudiants;
		this.designation = designation;
	}

	public int getIdGroupe() {
		return idGroupe;
	}

	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}

	public int getNombreEtudiants() {
		return nombreEtudiants;
	}

	public void setNombreEtudiants(int nombreEtudiants) {
		this.nombreEtudiants = nombreEtudiants;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Groupe [idGroupe=" + idGroupe + ", nombreEtudiants=" + nombreEtudiants + ", designation=" + designation
				+ "]";
	}

}
