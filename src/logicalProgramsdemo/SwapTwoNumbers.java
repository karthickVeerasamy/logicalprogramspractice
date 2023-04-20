package logicalProgramsdemo;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("before swapping value"+":"+a+" "+b);

		//logic 1-Third variable
		/*int c=a;
		    a=b;
		    b=c;*/
		    
		//logic 2-using + and - operator without using third variable
		/*a=a+b;//30
		b=a-b;//10
		a=a-b;//20*/
		
	    // logic-3 using * and / operator without using third varible
		//a and b values should not be zero
		/*a=a*b;//10*20=200
		b=a/b;//200/20=10
		a=a/b;//200/10=20*/
		
		//Logic-5   single statement
		//working right to left
	     b=a+b-(a=b);   //b=20 assign to a=> a=20;b=10+20=>b=30-20=10=>b=10
		    
		System.out.println("after swapping value"+":"+a+" "+b);
	}

}
