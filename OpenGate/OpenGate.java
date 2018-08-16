import java.util.Scanner;

public class OpenGate

{
   public static void main(String[]args)
   {
      Scanner kbd = new Scanner(System.in);
      NewGame();//start a new game//
      
   }//main method//
         
   public static void NewGame()
      {
         System.out.println();
         System.out.println();
         System.out.println("---------");
         System.out.println("NEW GAME");
         System.out.println("---------");
         System.out.println();
         System.out.println();
         System.out.println("**************************************************************");
         System.out.println("**************************************************************");
         System.out.println();
         System.out.println("Hello!! Welcome to the OpenGate game! Ready to play?");
         System.out.println();
         System.out.println("**************************************************************");
         System.out.println("**************************************************************");
         System.out.println();
         System.out.println();
         TableLoop();//Start comparing the the digits entered by either the player or computer with the elements of the 2D array when row=col(Major Diagonal of the table 2D array//
      }
         
   public static void TableLoop()
   {
      int countPlayer=0,countComputer=0,i=1;//i=1 because the user has to start entering digits from number 1//
      
      int [][]codeTable=WinningCodeTable();//3 by 3 2D array//
                 
      for(int row=0; row<codeTable.length; row++)
      {
            for(int col=0; col<codeTable[row].length; col++)
         {
               if(row==col)//Major Diagonal when row=col//
               {
                   if (codeTable[row][col]==PlayerCode(i))
                   countPlayer++;
                   if(countPlayer==3)//the digits entered by player must be correct all of them to meet the first condition of winning//
                  {
                     AlmostWinner("player");
                  }
                  if(codeTable[row][col]== ComputerCode(i))
                  countComputer++;
                   i++;
                  if(countComputer==3)//the digits entered by computer must be correct all of them to meet the first condition of winning//
                   AlmostWinner("computer");
               }
         }//second loop//
      }//first looop//
     
               if(countPlayer!=3 && countComputer!=3)
                  {
                     System.out.println();
                     System.out.println("Game Over! No one wins!");
                     System.out.println();
                     NewGame();
                  }
  }
  
   public static int[][] WinningCodeTable()
   {
      int [][]table = {{1,2,3},{5,4,6},{9,8,7}};/*The user(players) does not know what the table elements are, it is secretive , 
      and that is what the game is about to guess a number that matches the major diagonal of the table
      ....in this case the winning collection of three digits is : 147 */
      return table;
   }
   
   public static int PlayerCode(int p)
   {
         Scanner kbd = new Scanner(System.in);
         int player;    
         System.out.print("Enter digit" + p+ " for player(1-9): ");
         player=kbd.nextInt(); 
         return player;
   }
   
    public static int ComputerCode(int c)
   {
        Scanner kbd = new Scanner(System.in);
        int computer;
        System.out.print("Enter digit" + c + " for computer(1-9): ");
        computer=kbd.nextInt();
        return computer;
   }
   
   public static void AlmostWinner(String aw)
   {
       System.out.println();
       System.out.println("Wow!! you are about to win!! That is the right code!! make sure the electrical circuit is ON");//second condition to win, to make sure the electrical circuit is on//
       System.out.println();
       if(Power()==0) 
      {  
         System.out.print("The status of circuit(binary 0 or 1): ");   
         System.out.println(BinaryCircuit(0));//automatically prints the status of the binary circuit depending on the electrical power entered by the user//
         System.out.println();
         System.out.println("Oops! sorry! Circuit needs to be turned on, restart the game");
         System.out.println();
         System.out.println();
         NewGame();
      }
      else
      {
         System.out.print("the status of circuit(binary 0 or 1): ");      
         System.out.println(BinaryCircuit(1));//automatically prints the status of the binary circuit depending on the electrical power entered by the user/
         System.out.println();
         System.out.println("Congratulations " + aw + "! You opened the gate! Winner!");
         System.out.println();
         System.out.println();
         NewGame();      
      }
   }

   public static int Power()
   {
      Scanner kbd = new Scanner(System.in);
      int n;
      System.out.print("Guess the electrical power of the circuit(>=0): ");
      n=kbd.nextInt();//if The power entered by the user is 0, means there is no electrical power which means the condition is not fully met even though the code entered is correct//
      System.out.println();
      return n;
   }

   public static int BinaryCircuit (int p)
   {
      int circuit=-1;//just to initialize first the integer circuit with any integer//   
      if(p==0)
      circuit=0;//0 in binary means there is no voltage or electrical power//
      else if(p==1)
      circuit=1;//1 in binary means there is voltage or electrical power//
      return circuit;
   }
}