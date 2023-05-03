package logicalProgramsdemo;

public class CountSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1111;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("the sum of given digit is "+sum);
	}

}
