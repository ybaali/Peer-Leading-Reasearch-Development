import java.util.Scanner;

public class Distance
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		double x1, x2, y1, y2;
		System.out.print("Enter x1: ");
		x1 = kb.nextDouble();
		System.out.print("Enter y1: ");
		y1 = kb.nextDouble();
		System.out.print("Enter x2: ");
		x2 = kb.nextDouble();
		System.out.print("Enter y2: ");
		y2 = kb.nextDouble();
		
		double p1 = Math.pow(x2 - x1, 2);
		double p2 = Math.pow(y2 - y1, 2);
		double dis = Math.sqrt(p1 + p2);
		System.out.println("Distance: " + dis);
	}
}