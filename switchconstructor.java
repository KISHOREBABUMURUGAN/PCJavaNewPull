package ternaryoperator;
import java.util.Scanner;
public class switchconstructor {

	public static void main(String[] args) {
		String str;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a name=");
		str=input.nextLine();
		
		switch(str) {
		case ("kishore"):
			System.out.println("Number one");
			break;
		case ("babu"):
			System.out.println("Number two"); 
			break;
		case ("vihitha"):
			System.out.println("Number three");
			break;
		case ("murugan"):
			System.out.println("Number four");
			break;
		case ("vishnu"):
			System.out.println("Number five");
			break;
			default:
				System.out.println("Invalid input");
			
		}
		}
	}
