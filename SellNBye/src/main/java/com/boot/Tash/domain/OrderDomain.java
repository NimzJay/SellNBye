package com.boot.Tash.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orderTab")
public class OrderDomain {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "order_id")
	private Integer oid;
	
	@Column(name = "order_type")
	private String otype;
	
	@Column(name = "order_description")
	private String odescription;
	
	@Column(name = "order_date")
	private String odate;
	
	

	public Integer getoid() {
		return oid;
	}

	public void setoid(Integer oid) {
		this.oid = oid;
	}

	public String getotype() {
		return otype;
	}

	public void setotype(String otype) {
		this.otype = otype;
	}

	public String getodescription() {
		return odescription;
	}

	public void setodescription(String odescription) {
		this.odescription = odescription;
	}

	public String getodate() {
		return odate;
	}

	public void setodate(String odate) {
		this.odate= odate;
	}

	
	
	
	

}
