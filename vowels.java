package javafullcourse;
import java.util.Scanner;
public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String name;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter your name");
     name=sc.next();
     char a[]=name.toCharArray();
      for(int i=0; i<name.length();i++)
      {
    	  if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
    		  
    		  System.out.print(a[i]);
    	  }
      
      }
      }

}
