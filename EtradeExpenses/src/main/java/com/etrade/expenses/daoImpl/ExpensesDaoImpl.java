/**
 * 
 */
package com.etrade.expenses.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.etrade.expenses.dao.ExpensesDao;
import com.etrade.expenses.entities.ExpenseHead;

/**
 * @author Apple
 *
 */
@Repository
public class ExpensesDaoImpl implements ExpensesDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	@Override
	public List getExpensesHead() {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(ExpenseHead.class);
		List<ExpenseHead> expenseList = criteria.list();
		return expenseList;
	}

}
