package javafullcourse;
import java .util.Scanner;
public class Studentclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int STUDENTID;
String NAME;
int marks;
Scanner sc=new Scanner (System.in);
System.out.println("Enter your Student id : ");
STUDENTID=sc.nextInt();
System.out.println("Enter your name : ");
		NAME=sc.next();
int sum=0;
for (int i=1;i<6;i++ ) {
			System.out.println(" Marks of "+ i +" subject : ");
			marks=sc.nextInt();
			
			
			sum=sum+marks;
		}
		System.out.println(" My student_ID is "+STUDENTID);
		System.out.println(" My Name is "+NAME);
		System.out.println(" My total marks is "+sum);
		
	}

}
