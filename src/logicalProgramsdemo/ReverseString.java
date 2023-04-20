package logicalProgramsdemo;

public class ReverseString {

	public static void main(String[] args) {
	//1-Using string + concatenation operator
		String str="KAVIN";
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string is:"+rev);

		//2-by using character array
		/*char a[]=str.toCharArray();
		int len=a.length;
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];//DCBA
		}
		System.out.println("the reverse string is:"+rev);*/
		
		//3 Using StringBuffer class
		/*StringBuffer sb=new StringBuffer(str);
		StringBuffer bs=sb.reverse();
		System.out.println("The reverse string is"+" "+bs);*/
		
		
		
		
		
	}
}
