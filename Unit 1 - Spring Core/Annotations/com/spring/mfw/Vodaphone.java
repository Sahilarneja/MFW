package com.spring.mfw;

public class Vodaphone implements sim {

	@Override
	public void calling() {
		System.out.println("Calling using Vodaphone");
	}

	@Override
	public void data() {
		System.out.println("Using Vodaphone's Data");
	}

}
