package com.plateform.impression.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plateform.impression.model.DocumentDemandeDeTirage;
import com.plateform.impression.model.DocumentDemandeDeTiragePK;

@Repository
public interface DocumentDemandeDeTirageDao extends JpaRepository<DocumentDemandeDeTirage, DocumentDemandeDeTiragePK> {
	Optional<DocumentDemandeDeTirage> findById(DocumentDemandeDeTiragePK id);
}
