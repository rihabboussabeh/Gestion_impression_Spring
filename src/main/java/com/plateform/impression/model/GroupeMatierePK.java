package com.plateform.impression.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class GroupeMatierePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3878317950710732537L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_GROUPE")
	private Groupe groupe;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MATIERE")
	private Matiere matiere;

	public GroupeMatierePK() {
	}

	public GroupeMatierePK(Groupe groupe, Matiere matiere) {
		super();
		this.groupe = groupe;
		this.matiere = matiere;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	@Override
	public String toString() {
		return "GroupeMatierePK [groupe=" + groupe + ", matiere=" + matiere + "]";
	}

}
