package com.singtel.TestSolutionA3;

public class Chicken extends Bird {
	@Override
	public void sing(){
		if(this.getSex() == Sex.FEMALE)
			System.out.println("Cluck, cluck");
		else
			System.out.println("Cock-a-doodle-doo");
	}
}
