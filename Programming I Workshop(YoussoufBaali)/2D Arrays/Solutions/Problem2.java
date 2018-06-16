public class Problem2
{
	public static void main(String[] args)
	{
		int[][] a1 = numberPatternArray(3, 4);
		printArray(a1);
		System.out.println();
		
		int[][] a2 = numberPatternArray(9, 9);
		printArray(a2);
		System.out.println();
		
		int[][] a3 = numberPatternArray(5, 2);
		printArray(a3);
	}
	
	public static int[][] numberPatternArray(int r, int c)
	{
		int[][] a = new int[r][c];
		int i, j;
		for (i = 0; i < r; i++)
		{
			for (j = 0; j < c; j++)
			{
				a[i][j] = 10 * i + j;
			}
		}
		return a;
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