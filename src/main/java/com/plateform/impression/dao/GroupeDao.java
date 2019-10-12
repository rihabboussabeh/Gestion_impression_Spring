package com.plateform.impression.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plateform.impression.model.Groupe;
@Repository
public interface GroupeDao extends JpaRepository<Groupe, Integer> {
	Groupe findById(int id);
}
