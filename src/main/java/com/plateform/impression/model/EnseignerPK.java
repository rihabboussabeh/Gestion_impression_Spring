package com.plateform.impression.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class EnseignerPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4548855846951755364L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ENSEIGNANT")
	private Enseignant enseignant;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_GROUPE")
	@JoinColumn(name = "ID_MATIERE")
	private GroupeMatiere groupeMatiere;

	public EnseignerPK() {
	}

	public EnseignerPK(Enseignant enseignant, GroupeMatiere groupeMatiere) {
		this.enseignant = enseignant;
		this.groupeMatiere = groupeMatiere;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public GroupeMatiere getGroupeMatiere() {
		return groupeMatiere;
	}

	public void setGroupeMatiere(GroupeMatiere groupeMatiere) {
		this.groupeMatiere = groupeMatiere;
	}

	@Override
	public String toString() {
		return "EnseignerPK [enseignant=" + enseignant + ", groupeMatiere=" + groupeMatiere + "]";
	}

}
