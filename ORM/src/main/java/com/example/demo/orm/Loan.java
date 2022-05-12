package com.example.demo.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan")
public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="loan_no")
	private Integer  loan_no;
	
	@Column(name="loan_amt")
	private Double loan_amt;
	
    @Column(name="branch_no")
	private Integer branch_no;

    @Column(name="cus_id")
	private Integer cus_id;

    public Loan(Integer loan_no, Double loan_amt, Integer branch_no, Integer cus_id) {
        this.loan_no = loan_no;
        this.loan_amt = loan_amt;
        this.branch_no = branch_no;
        this.cus_id = cus_id;
    }

    public Integer getLoan_no() {
        return loan_no;
    }

    public void setLoan_no(Integer loan_no) {
        this.loan_no = loan_no;
    }

    public Double getLoan_amt() {
        return loan_amt;
    }

    public void setLoan_amt(Double loan_amt) {
        this.loan_amt = loan_amt;
    }

    public Integer getBranch_no() {
        return branch_no;
    }

    public void setBranch_no(Integer branch_no) {
        this.branch_no = branch_no;
    }

    public Integer getCus_id() {
        return cus_id;
    }

    public void setCus_id(Integer cus_id) {
        this.cus_id = cus_id;
    }


}