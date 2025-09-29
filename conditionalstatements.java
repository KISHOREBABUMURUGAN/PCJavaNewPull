package capgeminibasics;
import java.util.Scanner;
public class conditionalstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String attendance;
		System.out.println("Mark your attendance : ");
Scanner sc=new Scanner (System.in);


attendance=sc.nextLine();


   if(attendance.equals("present")) {
	   System.out.println("Done with your meeting");
	   System.out.println("Enter your age : ");
	   int nums;
	   nums=sc.nextInt();
	 
	   
	   if(nums>7) {
		   System.out.println("visit @ 1 floor");
	   }
	   else {
		   System.out.println("Invalid input");
	   }
   }
   else {
	   System.out.println("Not done");
   }
   
   
   //Scanner if condition
   
   
   int nums;
   nums=sc.nextInt();
   System.out.println("Enter your age");
   
   if(nums>7) {
	   System.out.println("visit @ 1 floor");
   }
   else {
	   System.out.println("Invalid input");
   }
	}

}
