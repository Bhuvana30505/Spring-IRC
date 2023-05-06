package com.example.Mapping01.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
@Entity
public class Question {
	@Id
	private int qno;
	private String qname;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Answer>Ans;
	public int getQno() {
		return qno;
		
	}
	public String getQname() {
		return qname;
	}
	public void setQname(String qname) {
		this.qname = qname;
	}
	public List<Answer> getAns() {
		return Ans;
	}
	public void setAns(List<Answer> ans) {
		Ans = ans;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}

}
