package com.etrade.expenses.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the tbl_expense_history database table.
 * 
 */
@Entity
@Table(name="expense_history")
//@NamedQuery(name="TblExpenseHistory.findAll", query="SELECT t FROM TblExpenseHistory t")
public class ExpenseHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="expense_head_history_pk")
	private int expenseHeadHistoryPk;

	@Column(name="employee_id_pk")
	private int employeeIdPk;

	@Column(name="expense_head_id_pk")
	private int expenseHeadIdPk;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="expense_update_date")
	private Date expenseUpdateDate;

	@Column(name="expense_update_done")
	private String expenseUpdateDone;

	public ExpenseHistory() {
	}

	public int getExpenseHeadHistoryPk() {
		return this.expenseHeadHistoryPk;
	}

	public void setExpenseHeadHistoryPk(int expenseHeadHistoryPk) {
		this.expenseHeadHistoryPk = expenseHeadHistoryPk;
	}

	public int getEmployeeIdPk() {
		return this.employeeIdPk;
	}

	public void setEmployeeIdPk(int employeeIdPk) {
		this.employeeIdPk = employeeIdPk;
	}

	public int getExpenseHeadIdPk() {
		return this.expenseHeadIdPk;
	}

	public void setExpenseHeadIdPk(int expenseHeadIdPk) {
		this.expenseHeadIdPk = expenseHeadIdPk;
	}

	public Date getExpenseUpdateDate() {
		return this.expenseUpdateDate;
	}

	public void setExpenseUpdateDate(Date expenseUpdateDate) {
		this.expenseUpdateDate = expenseUpdateDate;
	}

	public String getExpenseUpdateDone() {
		return this.expenseUpdateDone;
	}

	public void setExpenseUpdateDone(String expenseUpdateDone) {
		this.expenseUpdateDone = expenseUpdateDone;
	}

}