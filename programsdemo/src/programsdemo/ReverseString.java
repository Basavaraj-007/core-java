package programsdemo;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		//Using + (String concatinator) operator
		
		/*String str="xyz";
		String rev=new StringBuilder(str).reverse().toString();
		System.out.printf("original String :%s,reversed String %s %n",str,rev);*/
		
/*		String str="TryMadbeku";
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2.reverse();
		System.out.println(str2);*/
		
		
		/*String rev=rev(str);
		
		System.out.println("reveres word :"+rev);*/

		
		
		/*int len=str.length();
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverse String is:"+ rev);*/
	
	
	//2.USing char array
	
	/*char a[]=str.toCharArray();
	int len=a.length;
	
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+a[i];
	}
	System.out.println("Reverse String is:"+ rev);*/


/*	private static String rev(String str) {
		
		if(str==null || str.isEmpty()) {
			
			return str;
		}
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		return rev;*/
	
	
	//reverse a number
	
	/*int reverse=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	int i = sc.nextInt();
	
	while(i!=0) {
		reverse=reverse*10+i%10;
		i=i/10;
	}
	System.out.println("Number after reverse :"+reverse );
	
	
	
	
	
	
	}*/
		
		/*int num, a=0,b=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number- ");
		int n = sc.nextInt();
		
		System.out.println("finobacci series is-");
		for(int i=0;i<n;i++) {
			if(i<=1)
				num=i;
			else {
				num=a+b;
				a=b;
				b=num;
				
			}
			System.out.println(num);
		}*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array -");
		int n=sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter" +n+ "array elements");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int largest = arr[0];
		int smallest=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
			if(arr[i]<smallest) {
				smallest= arr[i];
			}
		}
		System.out.println(largest+" is largest number and "+ smallest +" is smallest number");
		}}


