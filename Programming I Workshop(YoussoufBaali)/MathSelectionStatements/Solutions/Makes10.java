import java.util.Scanner;

public class Makes10
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int n1, n2;
		System.out.print("First number: ");
		n1 = kb.nextInt();
		System.out.print("Second number: ");
		n2 = kb.nextInt();
		
		if (n1 + n2 == 10)
			System.out.println(n1 + " + " + n2 + " sums up to 10");
		else
			System.out.println("Does not sum up to 10");
			
		if (n1 == 10 || n2 == 10)
			System.out.println("One number is 10");
		else
			System.out.println("Neither number is 10");
	}
}