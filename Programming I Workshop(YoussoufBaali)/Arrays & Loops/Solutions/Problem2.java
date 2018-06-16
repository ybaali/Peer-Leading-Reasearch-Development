public class Problem2
{
	public static void main(String[] args)
	{
		char[] a1 = { 'a', 'A', 'j', 'h' };
		char[] b1 = doubleChar(a1);
		printArray(b1);
		
		char[] a2 = { 'b', 'b', 'c' };
		char[] b2 = doubleChar(a2);
		printArray(b2);
	}
	
	public static char[] doubleChar(char[] a)
	{
		int len = a.length * 2;
		char[] doubleA = new char[len];
		
		int i;
		for (i = 0; i < a.length; i++)
		{
			doubleA[2 * i] = a[i];
			doubleA[2 * i + 1] = a[i];
		}
		
		return doubleA;
	}
	
	public static void printArray(char[] a)
	{
		int i;
		for (i = 0; i < a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}