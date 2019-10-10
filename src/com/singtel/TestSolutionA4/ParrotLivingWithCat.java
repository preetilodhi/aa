package com.singtel.TestSolutionA4;

public class ParrotLivingWithCat extends ParrotDecorator {

	public ParrotLivingWithCat(Bird b) {
		super(b);
	}

	@Override
	public void sing(){
		System.out.println("Meow, meow");
	}
}
