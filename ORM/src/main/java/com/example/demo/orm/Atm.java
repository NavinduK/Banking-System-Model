package com.example.demo.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "atm")
public class Atm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="atm_no")
	private Integer  acc_no;
	
	@Column(name="location_tag")
	private String cus_id;

    @Column(name="branch_no")
	private Integer  branch_no;

    public Atm(Integer acc_no, String cus_id, Integer branch_no) {
        this.acc_no = acc_no;
        this.cus_id = cus_id;
        this.branch_no = branch_no;
    }

    public Integer getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(Integer acc_no) {
        this.acc_no = acc_no;
    }

    public String getCus_id() {
        return cus_id;
    }

    public void setCus_id(String cus_id) {
        this.cus_id = cus_id;
    }

    public Integer getBranch_no() {
        return branch_no;
    }

    public void setBranch_no(Integer branch_no) {
        this.branch_no = branch_no;
    }

}