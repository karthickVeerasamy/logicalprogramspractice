package logicalProgramsdemo;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		
		System.out.println("Enter second number");
		int b=sc.nextInt();
		
		System.out.println("Enter third number");
		int c=sc.nextInt();
		//approach 1
		/*if(a>b&&a>c) {
			System.out.println(a+" is largest");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is largest");
		}
		else {
			System.out.println(c+" is largest");
		}*/
		
		//Ternary operator in  java
		
		int largest=a>b?a:b;//largest of a and b
		 largest=c>largest?c:largest;
		 System.out.println("largest number is "+largest);

	}

}
