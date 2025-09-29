package javafullcoursepart2;

import java.util.Arrays;

public class integertostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20;
  String b=Integer.toString(20);
  System.out.println(b);
  
  String c=b.replace("2","A");
  System.out.println(c);  //integer to string
  
  
  String x="12324";
  int i =  Integer.parseInt(x);
  System.out.println(i);   //String to integer 
  
  
  String m="murugan";    //string to array
  char ch[]=m.toCharArray();
  for(int l=0;l<=ch.length-1;l++) {
	  System.out.println(ch[l]);
  }
 
  
  int nums[]=new int [5];
  System.out.println(Arrays.toString(nums));  //array to string
  
	}

}
