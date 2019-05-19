package com.boot.Mihi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class ProductDomain {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Product_id")
	private Integer pid;
	
	@Column(name = "Product_Name")
	private String pname;
	
	@Column(name = "Product_description")
	private String pdescription;
	
	@Column(name = "Poduct_Unit_Price")
	private Float pUnitPrice;
	
	@Column(name = "Units_In_Stock")
	private Integer pUnitinStock;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdescription() {
		return pdescription;
	}

	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}

	public Float getpUnitPrice() {
		return pUnitPrice;
	}

	public void setpUnitPrice(Float pUnitPrice) {
		this.pUnitPrice = pUnitPrice;
	}

	public Integer getpUnitinStock() {
		return pUnitinStock;
	}

	public void setpUnitinStock(Integer pUnitinStock) {
		this.pUnitinStock = pUnitinStock;
	}
	
	
	
	
	

}
