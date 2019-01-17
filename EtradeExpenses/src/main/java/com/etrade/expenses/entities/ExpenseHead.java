package com.etrade.expenses.entities;

import java.io.Serializable;
import javax.persistence.*;

//import org.springframework.boot.autoconfigure.domain.EntityScan;


/**
 * The persistent class for the tbl_expense_head database table.
 * 
 */
@Entity
@Table(name="expense_head")
//@NamedQuery(name="TblExpenseHead.findAll", query="SELECT t FROM TblExpenseHead t")
public class ExpenseHead implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="expense_head_id_pk")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int expenseHeadIdPk;

	@Column(name="expense_head_description")
	private String expenseHeadDescription;

	@Column(name="expense_head_name")
	private String expenseHeadName;

	@Column(name="expense_head_status")
	private String expenseHeadStatus;

	public ExpenseHead() {
	}

	public int getExpenseHeadIdPk() {
		return this.expenseHeadIdPk;
	}

	public void setExpenseHeadIdPk(int expenseHeadIdPk) {
		this.expenseHeadIdPk = expenseHeadIdPk;
	}

	public String getExpenseHeadDescription() {
		return this.expenseHeadDescription;
	}

	public void setExpenseHeadDescription(String expenseHeadDescription) {
		this.expenseHeadDescription = expenseHeadDescription;
	}

	public String getExpenseHeadName() {
		return this.expenseHeadName;
	}

	public void setExpenseHeadName(String expenseHeadName) {
		this.expenseHeadName = expenseHeadName;
	}

	public String getExpenseHeadStatus() {
		return this.expenseHeadStatus;
	}

	public void setExpenseHeadStatus(String expenseHeadStatus) {
		this.expenseHeadStatus = expenseHeadStatus;
	}

}