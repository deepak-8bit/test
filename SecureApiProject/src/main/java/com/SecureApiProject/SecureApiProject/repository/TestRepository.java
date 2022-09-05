package com.SecureApiProject.SecureApiProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SecureApiProject.SecureApiProject.model.TestModel;

@Repository
public interface TestRepository extends JpaRepository<TestModel, Integer> {
	

}
