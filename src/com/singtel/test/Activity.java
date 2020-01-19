package com.singtel.test;

public interface Activity {
	
	void fly();
	void sing();
	default void walk(){
		System.out.println("I am walking");
		}
	void swim();
 boolean isFly();
 boolean isSing();
 boolean isWalk();
 boolean isSwim();
    
}
