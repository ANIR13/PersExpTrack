package com.anirthec.expencetrack.controller;

import com.anirthec.expencetrack.model.Expense;
import com.anirthec.expencetrack.service.ExpenseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("expense", new Expense());
        model.addAttribute("expenses", expenseService.retrieveAllExpenses());
        return "index";
    }

    @PostMapping("/expenses")
    public String addExpense(@ModelAttribute Expense expense) {
        expenseService.createExpense(expense);
        return "redirect:/";
    }

    @GetMapping("/expenses")
    public String getAllExpenses(Model model) {
        List<Expense> expenses = expenseService.retrieveAllExpenses();
        model.addAttribute("expenses", expenses);
        return "expenses";
    }

    @DeleteMapping("/expenses/{id}")
    public String deleteExpense(@PathVariable Long id) {
        expenseService.removeExpense(id);
        return "redirect:/";
    }
}