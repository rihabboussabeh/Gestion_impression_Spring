package com.plateform.impression.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plateform.impression.model.DemandeDeTirage;

@Repository
public interface DemandeDeTirageDao extends JpaRepository<DemandeDeTirage, Integer> {
	DemandeDeTirage findById(int id);
}
