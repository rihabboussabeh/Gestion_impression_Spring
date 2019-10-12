package com.plateform.impression.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plateform.impression.model.Enseigner;
import com.plateform.impression.model.EnseignerPK;

@Repository
public interface EnseignerDao extends JpaRepository<Enseigner, EnseignerPK> {
	Optional<Enseigner> findById(EnseignerPK enseignerPK);
}
