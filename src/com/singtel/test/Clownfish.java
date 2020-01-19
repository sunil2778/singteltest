package com.singtel.test;

public class Clownfish extends Fish {

	Clownfish(){
		System.out.println(" clown  fish Instance ");
	}
	
	@Override
	public void sizeandcolour() {
		// TODO Auto-generated method stub
		System.out.println("Clownfish are small and colourful (orange)");
	}
	
	public void otherQuality() {
		System.out.println("Clown Fish Makes jokes");
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




