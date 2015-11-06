package Pig;

/*
	This program is based off of the Pig dice game. This is the driver class for the game. 
	See this website for more details on the implementation: http://nifty.stanford.edu/2010/neller-pig/oogame.html
*/
import java.util.*;

public class OOPig
{
   public static void main (String[] args)
   {
      PigPlayer player1, player2;
      Random rand = new Random();
      
      int num = rand.nextInt(2);
      
      if(num == 0)
      {
         System.out.println("You will be player 1.");
         player1 = new UserPigPlayer();
         player2 = new HoldAt20PigPlayer();
      }
      else
      {
         System.out.println("You will be player 2.");
         player2 = new UserPigPlayer();
         player1 = new HoldAt20PigPlayer();
      }
      
      PigGame game = new PigGame(player1, player2);
      
      game.play();
   }
}
