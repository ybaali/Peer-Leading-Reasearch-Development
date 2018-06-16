public class Problem1
{
	public static void main(String[] args)
	{
		int[][] a = { { 3, -2, 18 },
					  { 14, 0, 9 } };
		int[][] a1 = transpose(a);
		printArray(a1);
		System.out.println();
		
		int[][] b = { { 5, 8 },
					  { 6, 6 },
					  { 0, 4 },
					  { -1, -2 } };
		int[][] b1 = transpose(b);
		printArray(b1);
	}
	
	public static int[][] transpose(int[][] a)
	{
		int[][] b = new int[a[0].length][a.length];
		
		int i, j;
		for (i = 0; i < a[0].length; i++)
		{
			for (j = 0; j < a.length; j++)
			{
				b[i][j] = a[j][i];
			}
		}
		
		return b;	
	}
	
	public static void printArray(int[][] a)
	{
		int i, j;
		for (i = 0; i < a.length; i++)
		{
			for (j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}