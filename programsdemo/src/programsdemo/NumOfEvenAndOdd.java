package programsdemo;

public class NumOfEvenAndOdd {

	public static void main(String[] args) {

		int num=234567;
		
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num=num/10;
			
		}
		
	}

}
