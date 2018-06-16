/*
 mod and divison and their differences, nested if/else
introduction to using counter */

import java.util.Scanner;

public class CheckIfSame
{
	public static void main(String[] args)
	{
		int n1, n2, quo1, quo2, rem1, rem2, counter = 0;
		Scanner kb = new Scanner(System.in);
		
	 	System.out.print("First number: ");
		n1 = kb.nextInt();
		System.out.print("Second number: ");
		n2 = kb.nextInt();
		
		quo1 = n1 / 10;
		quo2 = n2 / 10;
		rem1 = n1 % 10;
		rem2 = n2 % 10;
		
		boolean bq = quo1 == quo2;
		boolean br = rem1 == rem2;
		boolean bd = (rem1 == 0) && (rem2 == 0);
		boolean bq2 = quo1 % 2 == 0;
		
		if (bq)
			System.out.println("Quotients are the same!");
		
		if (bd)
			System.out.println("They are both divisible by ten!");

		if (bq && bd && bq2)
			System.out.println("Quotients are divisible by two!");
		else if (bq && bd)
			System.out.println("Quotients are not divisible by 2.");
		else if (br && !bq && !bd)
			System.out.println("Remainders are the same!");
		else if (!bq && !br && !bd)
			System.out.println("Nothing is the same.");
		
		
	}
	
}