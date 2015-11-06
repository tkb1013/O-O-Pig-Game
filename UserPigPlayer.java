import java.util.*;

public class UserPigPlayer implements PigPlayer
{
   public UserPigPlayer()
   {
      System.out.println("Enter nothing to roll; enter anything to hold.");
   }
   
   public boolean isRolling(int myScore, int otherScore, int turnTotal)
   {
      String input;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Turn total: " + turnTotal + " " + "Roll/Hold? ");
      input = keyboard.nextLine();
      
      return (input.equals(""));  
   }
   
}
