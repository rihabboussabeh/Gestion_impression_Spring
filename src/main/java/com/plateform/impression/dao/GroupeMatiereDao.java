package com.plateform.impression.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.plateform.impression.model.GroupeMatiere;
import com.plateform.impression.model.GroupeMatierePK;

public interface GroupeMatiereDao extends JpaRepository<GroupeMatiere, GroupeMatierePK> {
	Optional<GroupeMatiere> findById(GroupeMatierePK id);
}
