package com.plateform.impression.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plateform.impression.model.Administrateur;

@Repository
public interface AdministrateurDao extends JpaRepository<Administrateur, Integer> {
	Administrateur findById(int id);
	Administrateur findByLoginAndMotDePasse(String log, String pass);

}
