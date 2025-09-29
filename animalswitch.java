package ternaryoperator;
import java.util.Scanner;
public class animalswitch {
public static void main(String[] args) {
	

	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter animals name=");
	String str=sc.nextLine();
	
	if(str.equals("dog")) {
		System.out.println("bow bow");
		
	}
	else if(str.equals("cat")) {
		System.out.println("meow meow");
	}
	else if(str.equals("monkey")) {
		System.out.println("bark bark");
	}
	else {
		System.out.println("Enter valid name");
	}
	
	
	
	
}
}