package com.boot.Tash.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class OrderDomain {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "oid")
	private Integer id;
	private String odescription;
	private String odate;
	private String otype;

	public Integer getOid() {
		return id;
	}

	public void setOid(Integer oid) {
		this.id = oid;
	}

	public String getOtype() {
		return otype;
	}

	public void setOtype(String otype) {
		this.otype = otype;
	}

	public String getOdescription() {
		return odescription;
	}

	public void setOdescription(String odescription) {
		this.odescription = odescription;
	}

	public String getOdate() {
		return odate;
	}

	public void setOdate(String odate) {
		this.odate = odate;
	}

}
