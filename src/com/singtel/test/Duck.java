package com.singtel.test;

public class Duck extends Bird {
	
	
	Duck(){
		System.out.println(" Duck Instance :::::  ");
	}
	
	 public void sing()
	 {
		 System.out.println("Duck say quack Quack"); 
	 }
    
	 
	 public void swim()
	 {
		 System.out.println("Duck can swim"); 
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
