package com.singtel.test;

public class Dolphin extends Animal {
	
	Dolphin()
	{
		
		System.out.println(" DOLPhin Instance ::::::");
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub

	}

	@Override
	public void swim() {
		System.out.println(" DOLPhin Can SWim fastly");

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


