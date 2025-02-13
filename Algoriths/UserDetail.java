package com.Algorithms.Algoriths;

public class UserDetail {
	
	private int id;
	private String name ;
	private String status ;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public UserDetail(int id, String name, String status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", name=" + name + ", status=" + status + "]";
	}
	
	
	
	

}
