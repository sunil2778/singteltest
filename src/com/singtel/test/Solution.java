package com.singtel.test;

import java.util.Arrays;
import java.util.List;

public class Solution {
	
	Animal[] animals = new Animal[]{
			new Bird(),
			new Duck(),
			new Chicken(),
			new Rooster(),
			new Parrot(),
			new Fish(),
			new Shark(),
			new Clownfish(),
			new Dolphin(),
			
			new ButterFly(),
			new Duck()
			
			};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird();
		Parrot parrot = new Parrot();
		
		bird.walk();
		bird.fly();
		bird.sing();
		parrot.sing();
		parrot.fly();
		parrot.getParrotNeibour(ParrotType.PARROTCAT);
		Shark shark= new Shark();
		shark.eat();
		shark.sizeandcolour();
		Solution sol =new Solution();
		sol.flycount();
		sol.swimcount();
		sol.singcount();
		sol.walkcount();
	}

	public long flycount() {
		List<Animal> animalList=Arrays.asList(animals);
		 long flycount =animalList.stream().filter(e->e.isFly()).count();
		 System.out.println(" fly count    :::::::::::"+flycount);
		 return flycount;
		
	}
	
	public long singcount() {
		List<Animal> animalList=Arrays.asList(animals);
		 long singcount =animalList.stream().filter(e->e.isSing()).count();
		 System.out.println(" sing  count    :::::::::::"+singcount);
		 return singcount;
		
	}
	public long swimcount() {
		List<Animal> animalList=Arrays.asList(animals);
		 long swimcount =animalList.stream().filter(e->e.isSwim()).count();
		 System.out.println(" swim count    :::::::::::"+swimcount);
		 return swimcount;
		
	}
	
	public long walkcount() {
		List<Animal> animalList=Arrays.asList(animals);
		 long walkcount =animalList.stream().filter(e->e.isWalk()).count();
		 System.out.println(" walk count    :::::::::::"+walkcount);
		 return walkcount;
		
	}
}
