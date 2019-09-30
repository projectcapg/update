package com.cg.ecm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ecm.dto.ExpenseClaimed;
import com.cg.ecm.repo.ExpenseClaimRepo;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class Controller {
	
	@Autowired
	ExpenseClaimRepo repo;
	
	@GetMapping("/expenseclaim/search/{id}")
	public ExpenseClaimed read(@PathVariable("id") int id)
	{
		return repo.findById(id).get();
	}
	
	@PutMapping("/expenseclaim/update/")
	public ExpenseClaimed update(@RequestBody ExpenseClaimed claim) {
		
		repo.save(claim);
		return claim;
	}
	@GetMapping("/expenseclaim/search/")
	public Iterable<ExpenseClaimed> index(){
		return repo.findAll();
	}
}
