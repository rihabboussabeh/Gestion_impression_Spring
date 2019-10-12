package com.plateform.impression.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class DocumentDemandeDeTiragePK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8653217751271457170L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DOCUMENT")
	private Document document;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_DEMANDE_DE_TIRAGE")
	private DemandeDeTirage demandeDeTirage;

	public DocumentDemandeDeTiragePK() {
	}

	public DocumentDemandeDeTiragePK(Document document, DemandeDeTirage demandeDeTirage) {
		this.document = document;
		this.demandeDeTirage = demandeDeTirage;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public DemandeDeTirage getDemandeDeTirage() {
		return demandeDeTirage;
	}

	public void setDemandeDeTirage(DemandeDeTirage demandeDeTirage) {
		this.demandeDeTirage = demandeDeTirage;
	}

	@Override
	public String toString() {
		return "DocumentDemandeDeTiragePK [document=" + document + ", demandeDeTirage=" + demandeDeTirage + "]";
	}

}
