package com;

import java.util.ArrayList;

public class Employee {

	private int id;
	private String name;
	private ArrayList<String> programming;
	
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
	public ArrayList<String> getProgramming() {
		return programming;
	}
	public void setProgramming(ArrayList<String> programming) {
		this.programming = programming;
	}
	
}
