package com.springcore.pre_post;

public class class_ {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting price");
		this.name = name;
	}

	public class_() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "class_ [name=" + name + "]";
	}

}
