package javafullcourse;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicatearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nums[]= {1,2,5,5,6,6,7,2};

for(int i=0;i<nums.length-1;i++) {
	for(int j=i+1;j<nums.length;j++) {
		if((nums[i]==nums[j]) && (i !=j) ){
			System.out.println(" Duplicate Number is " + nums[j]);
		}
		
	}
}


int c[]=new int [10];
for(int i=0;i<10;i++) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a  Number : ");
c[i]=sc.nextInt();
}

System.out.println(Arrays.toString(c));

for(int number : c) {
	System.out.println(number);
}

	}

}
