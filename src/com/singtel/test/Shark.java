package com.singtel.test;

public class Shark extends Fish {
	
	Shark(){
		System.out.println(" SHARK fish Instance ");
		
	}

	@Override
	public void sizeandcolour() {
		// TODO Auto-generated method stub
		System.out.println("Sharks are large and grey");
	}
	
	public void eat()
	{
		System.out.println("Sharks eat Small fish");
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

