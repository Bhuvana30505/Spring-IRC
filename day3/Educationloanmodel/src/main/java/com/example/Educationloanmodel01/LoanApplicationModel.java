package com.example.Educationloanmodel01;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class LoanApplicationModel {
	@Id
	private  int loanId;
	private String loantype;
	private String applicantaddress;
	private String applicantmobile;
	private String applicantEmail;
	private String applicantAadhar;
	private String aplicantpan;
	private String applicantSalary;
	private String loanAmountRequired;
	private String loanRepaymentMonths;
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoantype() {
		return loantype;
	}
	public void setLoantype(String loantype) {
		this.loantype = loantype;
	}
	public String getApplicantaddress() {
		return applicantaddress;
	}
	public void setApplicantaddress(String applicantaddress) {
		this.applicantaddress = applicantaddress;
	}
	public String getApplicantmobile() {
		return applicantmobile;
	}
	public void setApplicantmobile(String applicantmobile) {
		this.applicantmobile = applicantmobile;
	}
	public String getApplicantEmail() {
		return applicantEmail;
	}
	public void setApplicantEmail(String applicantEmail) {
		this.applicantEmail = applicantEmail;
	}
	public String getApplicantAadhar() {
		return applicantAadhar;
	}
	public void setApplicantAadhar(String applicantAadhar) {
		this.applicantAadhar = applicantAadhar;
	}
	public String getAplicantpan() {
		return aplicantpan;
	}
	public void setAplicantpan(String aplicantpan) {
		this.aplicantpan = aplicantpan;
	}
	public String getApplicantSalary() {
		return applicantSalary;
	}
	public void setApplicantSalary(String applicantSalary) {
		this.applicantSalary = applicantSalary;
	}
	public String getLoanAmountRequired() {
		return loanAmountRequired;
	}
	public void setLoanAmountRequired(String loanAmountRequired) {
		this.loanAmountRequired = loanAmountRequired;
	}
	public String getLoanRepaymentMonths() {
		return loanRepaymentMonths;
	}
	public void setLoanRepaymentMonths(String loanRepaymentMonths) {
		this.loanRepaymentMonths = loanRepaymentMonths;
	}
	

}
