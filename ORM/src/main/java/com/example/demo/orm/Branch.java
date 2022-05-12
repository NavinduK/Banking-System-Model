package com.example.demo.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "branch")
public class Branch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="branch_no")
	private Integer  branch_no;
	
	@Column(name="branch_city")
	private String branch_city;
	
	@Column(name="branch_assets")
	private String branch_assets;

    public Branch(Integer branch_no, String branch_city, String branch_assets) {
        this.branch_no = branch_no;
        this.branch_city = branch_city;
        this.branch_assets = branch_assets;
    }

    public Integer getBranch_no() {
        return branch_no;
    }

    public void setBranch_no(Integer branch_no) {
        this.branch_no = branch_no;
    }

    public String getBranch_city() {
        return branch_city;
    }

    public void setBranch_city(String branch_city) {
        this.branch_city = branch_city;
    }

    public String getBranch_assets() {
        return branch_assets;
    }

    public void setBranch_assets(String branch_assets) {
        this.branch_assets = branch_assets;
    }
}
