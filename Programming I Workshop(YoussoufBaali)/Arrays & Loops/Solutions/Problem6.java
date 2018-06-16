import java.util.Scanner;

public class Problem6
{
	
		
	   
     public static void main(String[]args)
   
   {
      Scanner kbd = new Scanner(System.in);
   
      String s="";
      
      char [] c = new char[5];
      
      System.out.print("Enter 5 capital letters: ");
      
      
      
      for(int i=0; i<c.length;i++)
      
     {  
         c[i]=kbd.next().charAt(0);
         
         if(c[i]=='A' || c[i]=='B')
         {
            s=" is a good grade!";
            
            System.out.println(c[i]+""+s);
            
         }
         
         else if(c[i]=='C')
         {
            s=" is an average grade!";
            
            System.out.println(c[i]+""+s);
            
         }
         else if(c[i]=='D' || c[i]=='F')
         {
            s=" is a failing grade!";
            
            System.out.println(c[i]+""+s);
            
         }
      
         else
         System.out.println(c[i]+""+" is invalid grade!");
      }
   }

    
         
      }
