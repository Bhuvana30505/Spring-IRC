package com.example.database.model;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@EnableAspectJAutoProxy
@Table(name="Bikemodel")
public class bikeModel {
	@Id
	@Column
	private int Bid;
	private String Bname;
	private int Bmodel;
	public int getBid() {
		return Bid;
	}
	public void setBid(int bid) {
		Bid = bid;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public int getBmodel() {
		return Bmodel;
	}
	public void setBmodel(int bmodel) {
		Bmodel = bmodel;
	}

}
