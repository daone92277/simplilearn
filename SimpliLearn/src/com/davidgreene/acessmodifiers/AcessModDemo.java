package com.davidgreene.acessmodifiers;

import accessDemo2.AccessDemoProtected;

class defAccess{
	void doIt() {
		System.out.println("Inside doit method of defAcess class");
	}
}


public class AcessModDemo extends AccessDemoProtected  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defAccess d1 = new defAccess(); 
		
		d1.doIt();
		final int a = 500;
		AcessModDemo a1 = new AcessModDemo();
		a1.display();
		
		 a =100;
	}

}
