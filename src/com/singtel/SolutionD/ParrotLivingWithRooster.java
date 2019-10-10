package com.singtel.SolutionD;

public class ParrotLivingWithRooster extends ParrotDecorator {

	public ParrotLivingWithRooster(Bird b) {
		super(b);
	}

	@Override
	public void sing(){
		System.out.println("Cock-a-doodle-doo");
	}
}
