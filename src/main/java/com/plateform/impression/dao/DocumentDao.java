package com.plateform.impression.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.plateform.impression.model.Document;

@Repository
public interface DocumentDao extends JpaRepository<Document, Integer> {
	Document findById(int id);
}
