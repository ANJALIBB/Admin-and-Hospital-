package com.anj.adminhospital.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable=false,unique = true)
	private long gst_number;
	@Column(nullable=false,unique = true)
	private String founder;
	@Column(nullable=false)
	private int year_of_estb;
	@ManyToOne
	@JoinColumn(name="admin_id")
	private Admin admin;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getGst_number() {
		return gst_number;
	}
	public void setGst_number(long gst_number) {
		this.gst_number = gst_number;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public int getYear_of_estb() {
		return year_of_estb;
	}
	public void setYear_of_estb(int year_of_estb) {
		this.year_of_estb = year_of_estb;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
	
	
	

}
