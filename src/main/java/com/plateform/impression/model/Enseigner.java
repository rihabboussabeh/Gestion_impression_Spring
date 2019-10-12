package com.plateform.impression.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "ENSEIGNER")
public class Enseigner implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1453133900841876041L;

	private static final String ERREUR = "Ce champ doit être de forme number(4)/number(4)";
	private static final String ERREU2 = "Contrainte de longeur non respecté, elle doit être = 7";
	private static final String PATTERN = "^[A-Za-z0-9/]+$";

	@EmbeddedId
	private EnseignerPK enseignerPK;
	@Length(min = 7, max = 7, message = ERREU2)
	@Pattern(regexp = PATTERN, message = ERREUR)
	private String anneeUniversitaire;

	public Enseigner() {
	}

	public Enseigner(
			@Length(min = 7, max = 7, message = ERREU2) @Pattern(regexp = PATTERN, message = ERREUR) String anneeUniversitaire) {
		this.anneeUniversitaire = anneeUniversitaire;
	}

	public Enseigner(EnseignerPK enseignerPK,
			@Length(min = 7, max = 7, message = ERREU2) @Pattern(regexp = PATTERN, message = ERREUR) String anneeUniversitaire) {
		this.enseignerPK = enseignerPK;
		this.anneeUniversitaire = anneeUniversitaire;
	}

	public EnseignerPK getEnseignerPK() {
		return enseignerPK;
	}

	public void setEnseignerPK(EnseignerPK enseignerPK) {
		this.enseignerPK = enseignerPK;
	}

	public String getAnneeUniversitaire() {
		return anneeUniversitaire;
	}

	public void setAnneeUniversitaire(String anneeUniversitaire) {
		this.anneeUniversitaire = anneeUniversitaire;
	}

	@Override
	public String toString() {
		return "Enseigner [enseignerPK=" + enseignerPK + ", anneeUniversitaire=" + anneeUniversitaire + "]";
	}

}
