import java.util.Scanner;

public class Problem4
{
	public static void main(String[] args)
	{
		int sum = 0, r, n;
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		n = kb.nextInt();
		
		do 
		{ 
			r = n % 10;
			n = n / 10;
			sum += r;
			
			if (n == 0 && sum >= 10)
			{
				System.out.println("Digit sum is " + sum);
				n = sum;
				sum = 0;
			}
			else if (n == 0)
			{
				System.out.println("Digit sum is " + sum);
			}
			
		} while (sum > 10 || n != 0);	
	}
}