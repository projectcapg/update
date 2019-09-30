package com.cg.ecm.repo;

import org.springframework.data.repository.CrudRepository;

import com.cg.ecm.dto.ExpenseClaimed;

public interface ExpenseClaimRepo extends CrudRepository<ExpenseClaimed, Integer> {

}
