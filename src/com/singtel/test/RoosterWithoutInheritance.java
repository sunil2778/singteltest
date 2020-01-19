package com.singtel.test;
/* using composition instead of inheritance */
public class RoosterWithoutInheritance implements Activity {
	
	public RoosterWithoutInheritance() {
		System.out.println("RoosterWithoutInheritance  Instance ::::  ");
	}

	Chicken chicken =new Chicken();

	@Override
	public void fly() {

		chicken.fly();
	}

	@Override
	public void sing() {
		chicken.sing();
		
	}

	@Override
	public void swim() {
		chicken.swim();
		
	}

	 public boolean isFly() {
			return Boolean.TRUE;
		}

		public boolean isSing() {
			return Boolean.FALSE;
		}

		public boolean isWalk() {
			return Boolean.TRUE;
		}

		public boolean isSwim() {
			return Boolean.TRUE;
		}

}
