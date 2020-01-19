package com.singtel.test;

class Bird extends Animal {

	public void fly() {
		System.out.println("I am flying");
	}

	public void sing() {
		System.out.println("Bird is singing");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub

	}

	public boolean isFly() {
		return Boolean.TRUE;
	}

	public boolean isSing() {
		return Boolean.TRUE;
	}

	public boolean isWalk() {
		return Boolean.TRUE;
	}

	public boolean isSwim() {
		return Boolean.TRUE;
	}
}
