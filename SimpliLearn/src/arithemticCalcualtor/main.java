package arithemticCalcualtor;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {	
		
		double a,b;
		
		System.out.println(" Enter selection as A/S/M or D");
		Scanner sc = new Scanner(System.in);
		
		char ip = sc.next().charAt(0);
		
		System.out.println("Enter the number");
		
		a=sc.nextDouble();
		b=sc.nextDouble();
		
		switch(ip) 
		{
		
		case 'A':
			
			output = a+b; 
			break;
		
		case 'B': 
			output = a-b; 
			break;
		
		}
		

		
		
	}
	
	public static int addNumbers(int a, int b) {
			return a+b;
	}
	

}
