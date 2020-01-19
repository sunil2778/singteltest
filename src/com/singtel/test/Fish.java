package com.singtel.test;

public class Fish extends Animal implements FishActivity { 
	
	Fish(){
		System.out.println(" fish Objects and their methods ::::     ");
	}

	@Override
	public void fly() {
		System.out.println("Fish Don't Fly");

	}

	@Override
	public void sing() {
		System.out.println("Fish Don't sing");
	}

	@Override
	public void swim() {
		System.out.println("Fish Swim");

	}
	
	public void walk(){
		System.out.println("Fish Don't walk");
		}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sizeandcolour() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void otherQuality() {
		// TODO Auto-generated method stub
		
	}
	public boolean isFly() {
		return Boolean.FALSE;
	}

	public boolean isSing() {
		return Boolean.FALSE;
	}

	public boolean isWalk() {
		return Boolean.FALSE;
	}

	public boolean isSwim() {
		return Boolean.TRUE;
	}
}
