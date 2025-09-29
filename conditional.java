package capgeminibasics;
import java.util.Scanner;
public class conditional {
    public static void main(String[]args) {
    	String booking;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter your wfo entries : ");
    	booking=sc.nextLine();
    	
    	
    	
   if(booking.equals("present")) {
    		System.out.println("pass");
    		
    	}
    else if (booking.equals("absent")) {
    		System.out.println("fail");
    	}
    	

	//character
String	attendance=sc.nextLine();
	System.out.println(" Mark your attendance : " );
	   
	if(attendance.equals("p")) {
		System.out.println("present");
	}
	else if(attendance.equals("f")) {
		System.out.println("on duty");
	}
	else {
		System.out.println("Absent");
	}
    	
    	
    	System.out.println("Thankyou for yoour cooperatopn");
    	
    }
}
