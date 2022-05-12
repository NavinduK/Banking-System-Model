package com.example.demo.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pay_no")
	private Integer  pay_no;
	
	@Column(name="pay_amt")
	private Double pay_amt;
	
    @Column(name="pay_date")
	private String pay_date;

    @Column(name="loan_no")
	private Integer loan_no;

    public Payment(Integer pay_no, Double pay_amt, String pay_date, Integer loan_no) {
        this.pay_no = pay_no;
        this.pay_amt = pay_amt;
        this.pay_date = pay_date;
        this.loan_no = loan_no;
    }

    public Integer getPay_no() {
        return pay_no;
    }

    public void setPay_no(Integer pay_no) {
        this.pay_no = pay_no;
    }

    public Double getPay_amt() {
        return pay_amt;
    }

    public void setPay_amt(Double pay_amt) {
        this.pay_amt = pay_amt;
    }

    public String getPay_date() {
        return pay_date;
    }

    public void setPay_date(String pay_date) {
        this.pay_date = pay_date;
    }

    public Integer getLoan_no() {
        return loan_no;
    }

    public void setLoan_no(Integer loan_no) {
        this.loan_no = loan_no;
    }

}
