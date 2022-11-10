package programsdemo;

import java.util.Scanner;

public class Programs {

	public static void main(String a[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:");
		
		int num=sc.nextInt();
		
		//1.Using algorithm
		
	/*	int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
		}*/
		
		//Using StringBuffer class
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		
		System.out.println("Reverse Number is:"+ rev);
		
	}
}
