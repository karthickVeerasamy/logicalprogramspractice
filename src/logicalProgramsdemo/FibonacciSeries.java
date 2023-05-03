package logicalProgramsdemo;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 1 1 2 3 5 8 13 21 34
//		Scanner scan =new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num=scan.nextInt();
		for(int i=1;i<15;i++) {
		System.out.println(getFibanocci(i));
		}

	}
	
	public static int getFibanocci(int num) {
		if(num==0 || num==1) {
			return 0;
		}else if(num==2) {
            return 1;
		}
		return getFibanocci(num-1)+getFibanocci(num-2);
	}

}
