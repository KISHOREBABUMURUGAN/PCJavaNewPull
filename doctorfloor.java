
package ternaryoperator;
import java.util.Scanner;
public class doctorfloor {

	public static void main(String[] args) {
	int nums;
	Scanner input = new Scanner (System.in);
	String str;
	System.out.println("Enter yout name=");
	str=input.nextLine();
	String ktr;
	System.out.println("Enter father's name=");
	ktr=input.nextLine();
	String vtr;
	System.out.println("Enter temperature of the body=");
	vtr=input.nextLine();
	System.out.println("Enter your age=");
	nums=input.nextInt();
	
	
	if (nums>=4&&nums<=9) {
		System.out.println("Go to first floor");
		System.out.println("Token number=12");
		
		
	}
	else if(nums>=10&&nums<=19) {
		System.out.println("Go to second floor");
		System.out.println("Token number=13");
	}
	else if (nums>=20&&nums<=30) {
		System.out.println("go to third floor");
		System.out.println("Token number=14");
	}
	else {
		System.out.println("Today appointment is over");
		
	}
	
	}

}
