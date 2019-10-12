package com.plateform.impression.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plateform.impression.model.Enseignant;

@Repository
public interface EnseignantDao extends JpaRepository<Enseignant, Integer> {
	Enseignant findById(int id);

	Enseignant findByLoginAndMotDePasse(String log, String pass);

}
