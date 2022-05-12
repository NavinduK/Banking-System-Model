package com.example.demo.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creditcard")
public class CreditCard {
	@Id
	@Column(name="card_no")
	private String  cus_id;
	
	@Column(name="credit_limit")
	private Double cus_name;
	
	@Column(name="acc_no")
	private String cus_address;

    public CreditCard(String cus_id, Double cus_name, String cus_address) {
        this.cus_id = cus_id;
        this.cus_name = cus_name;
        this.cus_address = cus_address;
    }

    public String getCus_id() {
        return cus_id;
    }

    public void setCus_id(String cus_id) {
        this.cus_id = cus_id;
    }

    public Double getCus_name() {
        return cus_name;
    }

    public void setCus_name(Double cus_name) {
        this.cus_name = cus_name;
    }

    public String getCus_address() {
        return cus_address;
    }

    public void setCus_address(String cus_address) {
        this.cus_address = cus_address;
    }
    

}