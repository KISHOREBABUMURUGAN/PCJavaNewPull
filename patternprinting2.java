package javafullcourse;
import java.util.Scanner;
public class patternprinting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums;
Scanner sc=new Scanner(System.in);
nums=sc.nextInt();
  for(int i=nums;i>=1;i--) {
	  for(int j=i;j>=1;j--) {
		  System.out.print("*");
	  }
	  System.out.println();
  }
	}

}
