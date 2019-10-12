package com.plateform.impression.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "DOCUMENT")
public class Document implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4702350339874814312L;

	private static final String ERREUR = "Contrainte de longeur non respectée : ";

	@Id
	@GeneratedValue
	@Column(name = "ID_DOCUMENT")
	private int idDocument;
	@Length(min = 3, max = 20, message = ERREUR + ": min =3, max = 20")
	@Column(name = "NOM")
	private String nom;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MATIERE")
	private Matiere matiere;

	public Document() {
	}

	public Document(
			@Length(min = 3, max = 20, message = "Contrainte de longeur non respectée : : min =3, max = 20") String nom,
			Matiere matiere) {
		this.nom = nom;
		this.matiere = matiere;
	}

	public Document(int idDocument,
			@Length(min = 3, max = 20, message = "Contrainte de longeur non respectée : : min =3, max = 20") String nom,
			Matiere matiere) {
		this.idDocument = idDocument;
		this.nom = nom;
		this.matiere = matiere;
	}

	public int getIdDocument() {
		return idDocument;
	}

	public void setIdDocument(int idDocument) {
		this.idDocument = idDocument;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
		if (!matiere.getDocuments().contains(this)) {
			matiere.getDocuments().add(this);
		}
	}

	@Override
	public String toString() {
		return "Document [idDocument=" + idDocument + ", nom=" + nom + ", matiere=" + matiere + "]";
	}

}
