package com.plateform.impression.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plateform.impression.model.AgentDeTirage;

@Repository
public interface AgentDeTirageDao extends JpaRepository<AgentDeTirage, Integer> {
	AgentDeTirage findById(int id);

	AgentDeTirage findByLoginAndMotDePasse(String log, String pass);

}
