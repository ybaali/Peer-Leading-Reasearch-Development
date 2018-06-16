public class Problem2
{
	public static void main(String[] args)
	{
		int[] b = { 2, 2 };
		int[] b1 = noDuplicates(b);
		printArray(b1);
		
		int[] c = { 1, 5, -4, 5, -4, 1, 0 };
		int[] c1 = noDuplicates(c);
		printArray(c1);
		
		int[] d = { -2, 8, 9 };
		int[] d1 = noDuplicates(d);
		printArray(d1);
	}
	
	public static int[] noDuplicates(int[] a)
	{
		int count = 0, i, j;
		boolean prev;
		for (i = 0; i < a.length; i++)
		{
			prev = false;
			for (j = 0; j < i; j++)
			{
				if (a[i] == a[j])
					prev = true;
			}
			
			if (!prev)
				count++;
		}
		
		int[] b = new int[count];
		int k = 0;
		for (i = 0; i < a.length; i++)
		{
			prev = false;
			for (j = 0; j < i; j++)
			{
				if (a[i] == a[j])
					prev = true;
			}
			
			if (!prev)
			{
				b[k] = a[i];
				k++;
			}
		}
		return b;
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