package com.SecureApiProject.SecureApiProject.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SecureApiProject.SecureApiProject.model.TestModel;
import com.SecureApiProject.SecureApiProject.service.TestService;

@RestController
public class TestController {

	@Autowired
	private TestService service;

	@PostMapping("/save")
	public ResponseEntity<TestModel> saveduser(@RequestBody TestModel testm) {
//		TestModel test=	service.saveduser(testm);
		return new ResponseEntity<TestModel>(service.saveduser(testm), HttpStatus.CREATED);
	}

	@GetMapping("/findall")
	public ResponseEntity<List<TestModel>> getAllUsers() {
		return new ResponseEntity<List<TestModel>>(service.getusers(), HttpStatus.FOUND);
	}

	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Optional<TestModel>> getUserById(@PathVariable int id, TestModel testm) {
		return new ResponseEntity<>(service.userbyid(id), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id) {
		service.userdeleteById(id);
		return new ResponseEntity<String>("this user deleted  =  " + id, HttpStatus.ACCEPTED);
	}

}
