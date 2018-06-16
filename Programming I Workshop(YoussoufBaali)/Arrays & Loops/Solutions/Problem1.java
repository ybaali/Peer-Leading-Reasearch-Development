import java.util.Scanner;

public class Problem1
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		int n;
		System.out.print("Enter n (> 0): ");
		n = kb.nextInt();
		int[] a = new int[n];
		
		System.out.print("Enter " + n + " integers: ");
		int i, index = 0, min = 0;
		for (i = 0; i < a.length; i++)
		{
			a[i] = kb.nextInt();
			if (i == 0)
			{
				index = 0;
				min = a[i];
			}
			else if (a[i] < min)
			{
				index = i;
				min = a[i];
			}	
		}
		
		if (index == a.length - 1)
			System.out.println("No numbers after min");
		else
		{ 
        System.out.print("After minimum: ");
			for (i = index + 1; i < a.length; i++)
			{
				System.out.print(a[i] + " ");
			} 
			System.out.println();
		}
	}
}