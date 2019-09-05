package com.payroll.model;

public class Accountant {
	private int accountant_id;
	String accountant_name;
	String accoutant_pass;
	public Accountant(int accountant_id, String accountant_name, String accoutant_pass) {
		super();
		this.accountant_id = accountant_id;
		this.accountant_name = accountant_name;
		this.accoutant_pass = accoutant_pass;
	}
	public int getAccountant_id() {
		return accountant_id;
	}
	public void setAccountant_id(int accountant_id) {
		this.accountant_id = accountant_id;
	}
	public String getAccountant_name() {
		return accountant_name;
	}
	public void setAccountant_name(String accountant_name) {
		this.accountant_name = accountant_name;
	}
	public String getAccoutant_pass() {
		return accoutant_pass;
	}
	public void setAccoutant_pass(String accoutant_pass) {
		this.accoutant_pass = accoutant_pass;
	}
	
	

}
