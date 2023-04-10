package com.spring.mfw;

public class airtel implements sim {

	@Override
	public void calling() {
		System.out.println("Calling using Airtel");
	}

	@Override
	public void data() {
		System.out.println("Using Airtel's Data");
	}

}
