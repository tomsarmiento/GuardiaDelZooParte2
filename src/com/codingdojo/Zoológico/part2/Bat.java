package com.codingdojo.Zoológico.part2;

public class Bat extends Mammal {
	int energyLevel = 300;

	public void fly(){
		System.out.println("FLAP FLAP FLAP, im flying");
		energyLevel-=50;
	}

	public void eatHumans(){
		System.out.println("Well, who cares");
		energyLevel+=25;
	}

	public void attackTown(){
		System.out.println("hiss hiss hiss, i will destroy this town!");
		energyLevel-=100;
	}

	public void displayEnergy(){
		System.out.println("My energy level is: "+energyLevel);
	}
}
