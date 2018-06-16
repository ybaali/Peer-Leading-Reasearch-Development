import java.util.Scanner;

public class Problem3
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);
      
      int product = 1, input, count = 0;
      
      do
      {
      	System.out.print("Enter a positive integer: ");
      	input = kb.nextInt();
      	if (input > 0)
      	{
      		product *= input;
      		count++;
      	}
      } while (count < 5 && input > 0);
      
      if (count == 0)
      	product = 0;
 
      System.out.println("Number of positive numbers is: " + count);
      System.out.println("The product of positive numbers is: " + product);
    
   }
}