import java.util.Scanner;

public class SameLastDigit
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int n1, n2;
		System.out.print("First number: ");
		n1 = kb.nextInt();
		System.out.print("Second number: ");
		n2 = kb.nextInt();
		
		int d1, d2;
		d1 = n1 % 10;
		d2 = n2 % 10;
		if (d1 == d2)
			System.out.println("Same last digit");
		else
			System.out.println("Different last digits");
	}
}