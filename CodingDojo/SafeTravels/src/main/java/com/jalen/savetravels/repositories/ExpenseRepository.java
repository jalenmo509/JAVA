package com.jalen.savetravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jalen.savetravels.models.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
    // this method retrieves all the expenses from the database
    List<Expense> findAll();
}
