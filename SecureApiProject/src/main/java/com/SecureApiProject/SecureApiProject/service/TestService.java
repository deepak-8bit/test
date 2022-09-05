package com.SecureApiProject.SecureApiProject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.SecureApiProject.SecureApiProject.model.TestModel;
import com.SecureApiProject.SecureApiProject.repository.TestRepository;

@Service
public class TestService {
	
	@Autowired
	private TestRepository repo;
	
	
	
	public TestModel saveduser( TestModel testm) {
		
		return repo.save(testm);
	}
	
	
	public List<TestModel> getusers(){
		return repo.findAll();
	}
	
	public Optional<TestModel> userbyid(int id) {
		return repo.findById(id);
	}


	public void userdeleteById(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

}
