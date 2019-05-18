package com.boot.Biffer.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class CategoryDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "cid")
	private Integer id;
	private String cname;
	private String description;
	
	public Integer getId() {
		return id;
	}
	
	public void  setId(Integer id) {
		this.id = id;
	}
	
	public String getCname() {
		return cname;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
		
	

}
