package com.singtel.test;

public class ButterFly extends Animal {

	
	ButterFly(){
		System.out.println(" ButterFLy Instance :::");
	}
	@Override
	public void fly() {
		
		System.out.println("ButterFly Can FLY");
	}

	@Override
	public void sing() {
		System.out.println("A butterfly does not make a sound");

	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub

	}
	@Override
	public boolean isFly() {
		// TODO Auto-generated method stub
		return Boolean.TRUE;
	}
	@Override
	public boolean isSing() {
		// TODO Auto-generated method stub
		return Boolean.TRUE;
	}
	@Override
	public boolean isWalk() {
		// TODO Auto-generated method stub
		return Boolean.TRUE;
	}
	@Override
	public boolean isSwim() {
		// TODO Auto-generated method stub
		return Boolean.TRUE;
	}

}
