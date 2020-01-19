package com.singtel.test;

public class Caterpiller extends ButterFly {
	
	Caterpiller(){
		System.out.println("CaterPiller Instance  :::");
	}
	@Override
	public void fly() {
		
		System.out.println("CaterPiller Can not FLY");
	}
	
	
	
	public void walk(){
		System.out.println("CaterPiller  can walk");
		}
	@Override
	public boolean isFly() {
		// TODO Auto-generated method stub
		return Boolean.FALSE;
	}
	@Override
	public boolean isSing() {
		// TODO Auto-generated method stub
		return Boolean.FALSE;
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
