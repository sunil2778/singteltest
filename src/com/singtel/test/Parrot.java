package com.singtel.test;

public class Parrot extends Bird {
	
	Parrot(){
		System.out.println("Parrot Instance ::::::::::   ");
	}
	
	Parrot(String parrotType){
		System.out.println(parrotType);
	}

	public  void fly() {
		
		System.out.println("Parrot is  flying");
		}
	 
	  public void sing()
	 {
		 System.out.println("Parrot is singing"); 
	 }
	  
	  private void sing(String var)
		 {
			 System.out.println("Parrot say    "+ var); 
		 }
	  
	  public void  getParrotNeibour(ParrotType parrotNeibour) {
		  
		  switch (parrotNeibour) 
	        { 
	        case PARROTCAT: 
	        {
	        	//new Parrot();
	        	this.sing("Meow");
	        	System.out.print("Parrot living with cat");
	            break; 
	        }
	        case PARROTDOG: 
	        {
	        	this.sing("Woof woof");
	        	System.out.print("Parrot living with DOG");
	            break; 
	        }
	        case PARROTROOSTER: 
	        {
	        	this.sing("Cock-a-doodle-doo");
	        	System.out.print("Parrot living with Rooster");
	            break; 
	        }
	        case PARROTPHONE: 
	        {
	        	new Parrot(parrotNeibour.name());
	        	System.out.print("Parrot living with Phone");
	            break; 
	        }
	        case PARROTDUCK: 
	        {
	        	//new Parrot(parrotNeibour.name());
	        	System.out.print("Parrot living with Duck");
	            break; 
	        }
	        
	        case PARROTOTHER: 
	        {
	        	//new Parrot(parrotNeibour.name());
	        	System.out.print("Parrot living with other");
	            break; 
	        }
	        
	        default: 
	            System.out.println("parrot neibour not defined"); 
	            break; 
	        } 
		  
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

