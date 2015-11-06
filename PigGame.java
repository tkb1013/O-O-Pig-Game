/*
	This program is based off of the Pig dice game. 
	See this website for more details on the implementation: http://nifty.stanford.edu/2010/neller-pig/oogame.html
*/

public class PigGame
{
   public static final int GOAL_SCORE = 100;
   private PigPlayer player1, player2;
   
   public PigGame()
   {
      player1 = new UserPigPlayer();
      player2 = new UserPigPlayer();
   }
   
   public PigGame(PigPlayer p1, PigPlayer p2)
   {
      player1 = p1;
      player2 = p2;
   }
   
   public void play()
   {
      int playOneScore = 0, playTwoScore = 0, turnTotal1 = 0, turnTotal2 = 0;
      Die die = new Die();
        
      while(playOneScore < GOAL_SCORE && playTwoScore < GOAL_SCORE)
      {
          System.out.println("Player 1 score: " + playOneScore);
          System.out.println("Player 2 score: " + playTwoScore);
          
          System.out.println("It is player 1's turn.");
          
          while(player1.isRolling(playOneScore, playTwoScore, turnTotal1))
          {  
             int roll = die.nextRoll();
             System.out.println("Roll: " + roll);
                  
             if(roll >= 2 && roll <= 6)
             {
                turnTotal1 += roll;
                continue;      
             }
             else if(roll == 1)
             {
               turnTotal1 = 0;
               break;       
             }
          }
          
          playOneScore += turnTotal1;
          System.out.println("New Score: " + playOneScore);
          turnTotal1 = 0;
          
          if(playOneScore >= GOAL_SCORE)
            break;
            
          System.out.println("Player 1 score: " + playOneScore);
          System.out.println("Player 2 score: " + playTwoScore);
          
          System.out.println("It is player 2's turn.");
          
          while(player2.isRolling(playTwoScore, playOneScore, turnTotal2))
          {  
             int roll = die.nextRoll();
             System.out.println("Roll: " + roll);
                  
             if(roll >= 2 && roll <= 6)
             {
                turnTotal2 += roll;
                continue;                   
             }
             else if(roll == 1)
             {
               turnTotal2 = 0;
               break;       
             }
          }
          
          playTwoScore += turnTotal2;
          System.out.println("New Score: " + playTwoScore);
          turnTotal2 = 0;
      }
   }
}
