package logicalProgramsdemo;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.next();
		String orgstr=str;
		String rev="";
		
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(orgstr.equals(rev)) {
			System.out.println(orgstr+" palindrome string");
		}
		else {
			System.out.println(orgstr+ " not palindrome");
		}
	

	}

}
