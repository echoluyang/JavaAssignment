package com.hibernate.com.list;



import java.util.Map;

public class Grouppp {
	private long id;
	private String name;
	private Map<String, Employee> employees;
	
	
	public Grouppp() {
		System.out.println("Group Object Created");
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Map<String, Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Map<String, Employee> employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", employees=" + employees + "]";
	}
	
	

}

