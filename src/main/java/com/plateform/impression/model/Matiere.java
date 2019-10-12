package com.plateform.impression.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "MATIERE")
public class Matiere implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -996028911375933528L;

	@Id
	@GeneratedValue
	@Column(name = "ID_MATIERE")
	private int idMatiere;
	@Length(min = 3, max = 50, message = "Contrainte de longeur non respecté: min=3 max=50")
	@Column(name = "DESIGNATION")
	private String designation;
	@Min(value = 1)
	@Column(name = "NOMBRE_DES_ETUDIANTS")
	private int nombreDesEtudiants;
	@OneToMany(mappedBy = "matiere")
	private List<Document> documents;

	public Matiere() {
	}

	public Matiere(
			@Length(min = 3, max = 50, message = "Contrainte de longeur non respecté: min=3 max=50") String designation,
			@Min(1) int nombreDesEtudiants) {
		this.designation = designation;
		this.nombreDesEtudiants = nombreDesEtudiants;
	}

	public Matiere(int idMatiere,
			@Length(min = 3, max = 50, message = "Contrainte de longeur non respecté: min=3 max=50") String designation,
			@Min(1) int nombreDesEtudiants) {
		this.idMatiere = idMatiere;
		this.designation = designation;
		this.nombreDesEtudiants = nombreDesEtudiants;
	}

	public int getIdMatiere() {
		return idMatiere;
	}

	public void setIdMatiere(int idMatiere) {
		this.idMatiere = idMatiere;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getNombreDesEtudiants() {
		return nombreDesEtudiants;
	}

	public void setNombreDesEtudiants(int nombreDesEtudiants) {
		this.nombreDesEtudiants = nombreDesEtudiants;
	}

	public List<Document> getDocuments() {
		List<Document> liste = new ArrayList<>();
		for (Document document : this.documents) {
			liste.add(document);
		}
		return liste;
	}

	public void setDocuments(Iterable<Document> documents) {
		if (this.documents != null) {
			this.documents.clear();
			for (Document document : documents) {
				this.documents.add(document);
			}
		}
	}

	public void addDocument(Document document) {
		this.documents.add(document);
		if (document.getMatiere() != this) {
			document.setMatiere(this);
		}
	}

	@Override
	public String toString() {
		return "Matiere [idMatiere=" + idMatiere + ", designation=" + designation + ", nombreDesEtudiants="
				+ nombreDesEtudiants + "]";
	}

}
