package com.codingdojo.Zoológico.part2;

public class Gorilla extends Mammal {

	public void throwSomething() {
		System.out.println("Take that you stupid human!");
		energyLevel -= 5;
	}

	public void eatBananas(){
		System.out.println("yummy, this is so good!");
		energyLevel += 10;
	}

	public void climb(){
		System.out.println("I just climbed up to the top of the three");
		energyLevel-=10;
	}
}
