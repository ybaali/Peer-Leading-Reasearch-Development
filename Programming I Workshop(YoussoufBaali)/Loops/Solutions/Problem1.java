public class Problem1
{
	public static void main(String[] args)
	{
		int heads = 0, tails = 0;
		int i;
		for (i = 1; i <= 1000000; i++)
		{
			int n = (int) (Math.random() * 2);
			if (n == 0)
				heads++;
			else
				tails++;
		}
		System.out.println("Heads: " + heads);
		System.out.println("Tails: " + tails);
		System.out.println(heads + " Heads + " + tails + " Tails is " + (heads + tails) + " flips");
	}
}