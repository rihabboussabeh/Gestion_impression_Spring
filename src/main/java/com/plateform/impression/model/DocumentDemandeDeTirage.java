package com.plateform.impression.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name = "DOCUMENT_DEMANDE_DE_TIRAGE")
public class DocumentDemandeDeTirage {

	@EmbeddedId
	private DocumentDemandeDeTiragePK documentDemandeDeTiragePK;
	@Min(value = 1)
	@Column(name = "NOMBRE_DES_COPIES")
	private int nombreDesCopies;

	public DocumentDemandeDeTirage() {
	}

	public DocumentDemandeDeTirage(DocumentDemandeDeTiragePK documentDemandeDeTiragePK, @Min(1) int nombreDesCopies) {
		this.documentDemandeDeTiragePK = documentDemandeDeTiragePK;
		this.nombreDesCopies = nombreDesCopies;
	}

	public DocumentDemandeDeTiragePK getDocumentDemandeDeTiragePK() {
		return documentDemandeDeTiragePK;
	}

	public void setDocumentDemandeDeTiragePK(DocumentDemandeDeTiragePK documentDemandeDeTiragePK) {
		this.documentDemandeDeTiragePK = documentDemandeDeTiragePK;
	}

	public int getNombreDesCopies() {
		return nombreDesCopies;
	}

	public void setNombreDesCopies(int nombreDesCopies) {
		this.nombreDesCopies = nombreDesCopies;
	}

	@Override
	public String toString() {
		return "DocumentDemandeDeTirage [documentDemandeDeTiragePK=" + documentDemandeDeTiragePK + ", nombreDesCopies="
				+ nombreDesCopies + "]";
	}

}
