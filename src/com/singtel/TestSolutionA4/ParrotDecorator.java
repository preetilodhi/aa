package com.singtel.TestSolutionA4;

public class ParrotDecorator implements SingIF{

	protected Bird bird;
	
	public ParrotDecorator(Bird b){
		this.bird=b;
	}
	
	@Override
	public void sing() {
		this.bird.sing();
	}

}