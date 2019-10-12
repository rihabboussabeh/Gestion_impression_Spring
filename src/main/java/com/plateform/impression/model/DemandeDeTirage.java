package com.plateform.impression.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Past;

@Entity
@Table(name = "DEMANDE_DE_TIRAGE")
public class DemandeDeTirage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -59095640367994276L;

	@Id
	@GeneratedValue
	@Column(name = "ID_DEMANDE_DE_TIRAGE")
	private int idDemandeDeTirage;
	private AgentDeTirage agentDeTirage;
	@Past(message = "Cette date est déjà passé")
	@Column(name = "DATE_ARRIVEE")
	private Date dateArrivee;

	public DemandeDeTirage() {
	}

	public DemandeDeTirage(AgentDeTirage agentDeTirage, @Past(message = "Cette date est déjà passé") Date dateArrivee) {
		this.agentDeTirage = agentDeTirage;
		this.dateArrivee = (@Past(message = "Cette date est déjà passé") Date) dateArrivee.clone();
	}

	public DemandeDeTirage(int idDemandeDeTirage, AgentDeTirage agentDeTirage,
			@Past(message = "Cette date est déjà passé") Date dateArrivee) {
		super();
		this.idDemandeDeTirage = idDemandeDeTirage;
		this.agentDeTirage = agentDeTirage;
		this.dateArrivee = (@Past(message = "Cette date est déjà passé") Date) dateArrivee.clone();
	}

	public int getIdDemandeDeTirage() {
		return idDemandeDeTirage;
	}

	public void setIdDemandeDeTirage(int idDemandeDeTirage) {
		this.idDemandeDeTirage = idDemandeDeTirage;
	}

	public AgentDeTirage getAgentDeTirage() {
		return agentDeTirage;
	}

	public void setAgentDeTirage(AgentDeTirage agentDeTirage) {
		this.agentDeTirage = agentDeTirage;
	}

	public Date getDateArrivee() {
		return (Date) dateArrivee.clone();
	}

	public void setDateArrivee(Date dateArrivee) {
		this.dateArrivee = (@Past(message = "Cette date est déjà passé") Date) dateArrivee.clone();
	}

	@Override
	public String toString() {
		return "DemandeDeTirage [idDemandeDeTirage=" + idDemandeDeTirage + ", agentDeTirage=" + agentDeTirage
				+ ", dateArrivee=" + dateArrivee + "]";
	}

}
