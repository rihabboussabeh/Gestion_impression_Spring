package com.plateform.impression.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name = "AGENT_DE_TIRAGE")
public class AgentDeTirage extends Utilisateur {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5206069123372279846L;

	private static final String PATTERN2 = "^[A-Za-z]+$";
	private static final String ERREUR2 = "Ce champ doit être alphabétique";

	@Id
	@GeneratedValue
	@Column(name = "ID_AGENT_DE_TIRAGE")
	private int idAgentDeTirage;
	@Length(min = 3, max = 20, message = ERREUR + "min = 3 , max = 20")
	@Pattern(regexp = PATTERN2, message = ERREUR2)
	@Column(name = "NOM")
	private String nom;
	@Length(min = 3, max = 20, message = ERREUR + "min = 3 , max = 20")
	@Pattern(regexp = PATTERN2, message = ERREUR2)
	@Column(name = "PRENOM")
	private String prenom;
	@OneToMany(mappedBy = "agentDeTirage")
	private List<DemandeDeTirage> demandesDeTirage;

	public AgentDeTirage() {
		super();
	}

	public AgentDeTirage(
			@Length(min = 3, max = 20, message = ERREUR
					+ ": min = 3 , max = 20") @Pattern(regexp = PATTERN1, message = ERREUR1) String login,
			@Length(min = 3, max = 20, message = ERREUR + ": min = 3 , max = 20") String motDePasse,
			@Length(min = 3, max = 20, message = ERREUR
					+ ": min = 3 , max = 20") @Pattern(regexp = PATTERN2, message = ERREUR2) String nom,
			@Length(min = 3, max = 20, message = ERREUR
					+ ": min = 3 , max = 20") @Pattern(regexp = PATTERN2, message = ERREUR2) String prenom) {
		super(login, motDePasse);
		this.nom = nom;
		this.prenom = prenom;
	}

	public AgentDeTirage(
			@Length(min = 3, max = 20, message = ERREUR
					+ ": min = 3 , max = 20") @Pattern(regexp = PATTERN1, message = ERREUR1) String login,
			@Length(min = 3, max = 20, message = ERREUR + ": min = 3 , max = 20") String motDePasse,
			int idAgentDeTirage,
			@Length(min = 3, max = 20, message = ERREUR
					+ ": min = 3 , max = 20") @Pattern(regexp = PATTERN2, message = ERREUR2) String nom,
			@Length(min = 3, max = 20, message = ERREUR
					+ ": min = 3 , max = 20") @Pattern(regexp = PATTERN2, message = ERREUR2) String prenom) {
		super(login, motDePasse);
		this.idAgentDeTirage = idAgentDeTirage;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getIdAgentDeTirage() {
		return idAgentDeTirage;
	}

	public void setIdAgentDeTirage(int idAgentDeTirage) {
		this.idAgentDeTirage = idAgentDeTirage;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public List<DemandeDeTirage> getDemandesDeTirage() {
		List<DemandeDeTirage> liste = new ArrayList<>();
		for (DemandeDeTirage demandeDeTirage : this.demandesDeTirage) {
			liste.add(demandeDeTirage);
		}
		return liste;
	}

	public void setDemandeDeTirage(Iterable<DemandeDeTirage> demandesDeTirage) {
		if (this.demandesDeTirage != null) {
			this.demandesDeTirage.clear();
			for (DemandeDeTirage demandeDeTirage : demandesDeTirage) {
				this.demandesDeTirage.add(demandeDeTirage);
			}
		}
	}

	public void addDemandeDeTirage(DemandeDeTirage demandeDeTirage) {
		if(!this.getDemandesDeTirage().contains(demandeDeTirage)) {
			this.getDemandesDeTirage().add(demandeDeTirage);
		}
	}

	@Override
	public String toString() {
		return "AgentDeTirage [idAgentDeTirage=" + idAgentDeTirage + ", nom=" + nom + ", prenom=" + prenom + "]";
	}

}
