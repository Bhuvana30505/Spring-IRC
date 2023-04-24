package com.example.demo5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Theatre")
public class Theatre {
	@Id
	@Column(name="Tid")
	private int Tid;
	private String Tname;
	private int Tmodel;
	public int getTid() {
		return Tid;
	}
	public void setTid(int tid) {
		Tid = tid;
	}
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}
	public int getTmodel() {
		return Tmodel;
	}
	public void setTmodel(int tmodel) {
		Tmodel = tmodel;
	}

}
