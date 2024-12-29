package com.anirthec.expencetrack.service;

import com.anirthec.expencetrack.model.Expense;
import com.anirthec.expencetrack.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense createExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public List<Expense> retrieveAllExpenses() {
        return expenseRepository.findAll();
    }

    public void removeExpense(Long id) {
        expenseRepository.deleteById(id);
    }
}