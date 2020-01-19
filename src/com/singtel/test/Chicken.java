package com.singtel.test;

public class Chicken extends Bird {
	
	Chicken(){
		System.out.println(" Chicken Instance ::::");
	}
	
	public void sing()
	 {
		 System.out.println("Chicken say cluck Cluck"); 
	 }
    
	public void fly()
	 {
		 System.out.println("Chicken can not fly"); 
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
