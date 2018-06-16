import java.util.Scanner;

public class Problem1
{
	public static void main(String[] args)
	{
		int[] b = { -1, 10, 4, 8 };
		sort(b);
		printArray(b);
		
		int[] c = { 5, -3 };
		sort(c);
		printArray(c);
		
		int[] d = { 9, 9, 2, 5, 0 };
		sort(d);
		printArray(d);
	}
	
	public static void sort(int[] a)
	{
		int i, j, min, ind, temp;
		for (i = 0; i < a.length - 1; i++)
		{
			min = a[i];
			ind = i;
			for (j = i; j < a.length; j++)
			{
				if (a[j] < min)
				{
					min = a[j];
					ind = j;
				}
			}
			temp = a[i];
			a[i] = min;
			a[ind] = temp;
		}
	}
	
	public static void printArray(int[] a)
	{
		int i;
		for (i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}