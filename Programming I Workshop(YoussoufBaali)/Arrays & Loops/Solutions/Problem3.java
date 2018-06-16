import java.util.Scanner;
public class Problem3{
   public static void main(String[] args)
   {
      Scanner kb = new  Scanner(System.in);
      int n, i, j, count = 0;
      System.out.print("Enter n integer(n >1): ");
      n = kb.nextInt();
      int[] arr = new int[n];
      System.out.print("Enter "+ n + " integers followed by the space: ");
      for(i = 0; i < arr.length; i++){
         arr[i] = kb.nextInt();
         if (arr[i] == 0)  
            count++;
      }
      if (count == 0)
         System.out.println("There are no zeros in the array.");
      else{
         int[] x = new int[n];
         int k = 0;
         for (i = 0; i < x.length; i++)
         {
            if (arr[i] != 0)   {         
                x[k] = arr[i];
                k++;
             } 
         }
        
         for (i = 0; i < x.length; i++)
         {
            if (arr[i] == 0)   {         
                x[k] = arr[i];
                k++;
               
             } 
         }
          int countA = 0;
         System.out.print("The new array with 0's at the end: ");
         for(i = 0; i < x.length; i++)
         {
            System.out.print(x[i] + " ");
            if (x[i] == 0)
               countA++; 
         }
         System.out.println();
         System.out.println("There are "+ countA + " zeros in the array"+ " and there are "+ (n-countA) + " integers before them. ");
      }//else ends    
   }
}