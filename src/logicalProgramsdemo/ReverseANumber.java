package logicalProgramsdemo;

import java.util.*;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num=sc.nextInt();
		
	//1-using algorithm
		
	/*int rev=0;
	while(num!=0)
	{
		rev=rev*10 +num%10; //0*10+1234%10=4=>0+4=4//0+1234%10=4 /40+3=43  /430+2=432 /4320+1=4321
		num=num/10;                                //1234/10=>123  //123/10=12 //12/10=1 1/10=0
	}
		System.out.println("The reverse number is:"+rev);*/
      //if we use % we get last digit number
	 //if we use / we eliminate last digit
		
	//2-Using StringBuffer class 
		
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
	    StringBuffer rev=sb.reverse();
	    System.out.println("the Reverse value is :"+rev);*/
	//3-Using StringBuilder class
		
	StringBuilder sb=new StringBuilder();
	sb.append(num);
	StringBuilder rev=sb.reverse();
	System.out.println("the Reverse value is :"+rev);
	    
	    
	}

}
