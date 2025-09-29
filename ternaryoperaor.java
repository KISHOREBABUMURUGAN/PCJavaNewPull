package ternaryoperator;
import java .util.Scanner;
public class ternaryoperaor {

	public static void main(String[] args) {
	 int i,j;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number i=");
	 i=sc.nextInt();
	 System.out.println("Enter a number j=");
	 j=sc.nextInt();
	 
	 
	 j=i>5?1:2; 
	 System.out.println(j);

	}

}
