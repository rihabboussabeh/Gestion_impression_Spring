package com.plateform.impression.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "GROUPE_MATIERE")
public class GroupeMatiere implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private GroupeMatierePK groupeMatierePK;

	public GroupeMatiere() {
	}

	public GroupeMatiere(GroupeMatierePK groupeMatierePK) {
		this.groupeMatierePK = groupeMatierePK;
	}

	public GroupeMatierePK getGroupeMatierePK() {
		return groupeMatierePK;
	}

	public void setGroupeMatierePK(GroupeMatierePK groupeMatierePK) {
		this.groupeMatierePK = groupeMatierePK;
	}

	@Override
	public String toString() {
		return "GroupeMatiere [groupeMatierePK=" + groupeMatierePK + "]";
	}

}
