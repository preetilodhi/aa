package com.singtel.SolutionB;

import com.singtel.SolutionB.Fish.Colour;
import com.singtel.SolutionB.Fish.Size;



public class TestSecB {
	public static void main(String[] args) {
		Fish fish = new Fish();
		System.out.println("Fish");
		fish.swim();
		
		ClownFish clownFish = new ClownFish(Size.SMALL, Colour.ORANGE);
		System.out.println("clownFish");
		clownFish.makeJokes();
		
		SharkFish sharkFish = new SharkFish(Size.LARGE, Colour.GREY);
		System.out.println("sharkFish");
		sharkFish.eat(clownFish);
	}
}
