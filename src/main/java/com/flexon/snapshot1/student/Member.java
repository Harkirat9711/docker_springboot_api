package com.flexon.snapshot1.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class Member {
	
	@Id
	@GeneratedValue
	private int member_id;
	private String first_name;
	private String last_name;
	private int number;
	private String email;
	
	
	public Member(){
		
	}
	public Member(int member_id, String first_name, String last_name, int number, String email) {
		super();
		this.member_id = member_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.number = number;
		this.email = email;
	}

	

	public int getMember_id() {
		return member_id;
	}


	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}


	public String getFirst_name() {
		return first_name;
	}


	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}


	public String getLast_name() {
		return last_name;
	}


	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}


	public long getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "Member [ID=" + member_id  + ", First Name=" + first_name+ "]";
	}
	
}
	

	
