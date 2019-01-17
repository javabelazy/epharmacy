package com.etrade.expenses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.etrade.expenses.services.ExpensesService;

@SpringBootApplication
@RestController
public class EtradeExpensesApplication {
	
	@Autowired
	ExpensesService expenseService;

	public static void main(String[] args) {
		SpringApplication.run(EtradeExpensesApplication.class, args);
	}
	
	@RequestMapping(value= "/getAllExpenseHead", method=RequestMethod.GET, headers="Accept=application/json")
	public List getExpensesDetails() {
		return expenseService.getExpensesHead() ;
	}

	@RequestMapping(value= "/")
	public String test() {
		return "connection success";
	}
	
}

