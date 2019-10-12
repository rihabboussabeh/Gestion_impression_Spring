package com.plateform.impression.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plateform.impression.model.Matiere;

@Repository
public interface MatiereDao extends JpaRepository<Matiere, Integer> {
	Matiere findById(int id);
}
