package logicalProgramsdemo;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		int num=1234;
		int even_count=0;
		int odd_count=0;
		while(num>0)//1234>0
		{
			int rem=num%10;//4
			if(rem%2==0)
			{
				even_count++;
			}
			else {
				odd_count++;
			}
			num=num/10;//123
		}
			System.out.println("number of even numbers "+even_count);
			System.out.println("number of odd numbers "+odd_count);
		
		
		
		
		
		
		}

	}


