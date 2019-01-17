/**
 * 
 */
package com.etrade.expenses.servicesImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etrade.expenses.dao.ExpensesDao;
import com.etrade.expenses.services.ExpensesService;

/**
 * @author Apple
 *
 */
@Service("expensesService")
public class ExpensesServiceImpl implements ExpensesService {
	
	@Autowired
	ExpensesDao expenseDao;

	
	@Override
	@Transactional
	public List getExpensesHead() {
		return expenseDao.getExpensesHead();
	}

}
