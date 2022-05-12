package com.example.demo.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	@Id
	@Column(name="acc_no")
	private String  acc_no;
	
	@Column(name="acc_bal")
	private Double acc_bal;
	
	@Column(name="cus_id")
	private Integer cus_id;

    @Column(name="branch_no")
	private Integer  branch_no;

    public Account(String acc_no, Double acc_bal, Integer cus_id, Integer branch_no) {
        this.acc_no = acc_no;
        this.acc_bal = acc_bal;
        this.cus_id = cus_id;
        this.branch_no = branch_no;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public Double getAcc_bal() {
        return acc_bal;
    }

    public void setAcc_bal(Double acc_bal) {
        this.acc_bal = acc_bal;
    }

    public Integer getCus_id() {
        return cus_id;
    }

    public void setCus_id(Integer cus_id) {
        this.cus_id = cus_id;
    }

    public Integer getBranch_no() {
        return branch_no;
    }

    public void setBranch_no(Integer branch_no) {
        this.branch_no = branch_no;
    }

}
