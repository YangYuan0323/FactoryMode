package com.abstractfactory.abstractfactory;

import java.util.Date;

public class Login {
	
	private int id;
	
    private Date date;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Login [id=" + id + ", date=" + date + "]";
	}
}
