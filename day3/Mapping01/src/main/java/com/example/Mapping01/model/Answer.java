package com.example.Mapping01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Answer {
 
	 @Id
		private int ansno;
		private String answer;
		public int getAnsno() {
			return ansno;
			
		}
		public String getAnswer() {
			return answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
		public void setAnsno(int ansno) {
			this.ansno = ansno;
		}
		}


