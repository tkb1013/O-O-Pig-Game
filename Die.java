package Pig;
/*
	This program is based off of the Pig dice game. 
	See this website for more details on the implementation: http://nifty.stanford.edu/2010/neller-pig/oogame.html
*/
import java.util.Random; 

public class Die
{
   private int sides, min;
   private int[] outcomes;
   
   
   public Die(int[] o)
   {
      outcomes = o;
   }
   
   public Die(int s, int m)
   {
      sides = s;
      min = m;
   }
   
   public Die()
   {
      this(6, 1);
      outcomes = new int[sides];
      outcomes[0] = min;   
      outcomes[1] = 2;
      outcomes[2] = 3;
      outcomes[3] = 4;
      outcomes[4] = 5;
      outcomes[5] = 6;
    }
   
   public int nextRoll()
   {
      Random r = new Random();
      
      return outcomes[r.nextInt(outcomes.length)];
   }
}
