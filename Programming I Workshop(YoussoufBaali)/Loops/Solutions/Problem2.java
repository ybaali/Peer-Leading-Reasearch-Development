import java.util.Scanner;

public class Problem2
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int n = 0, prevN, bigS = 0, smallS = 0;
		
		do
		{	
			prevN = n;
			System.out.print("Enter a positive integer: ");
			n = kb.nextInt();
			if (prevN != 0 && n - prevN > 5)
				bigS++;
			else if (prevN != 0 && n - prevN <= 5 && n - prevN > 0)
				smallS++;
				
		} while (n > 0 && n > prevN);
		
		System.out.println("Big steps: " + bigS);
		System.out.println("Small steps: " + smallS);
		System.out.println("Ending value: " + n);
	}
}