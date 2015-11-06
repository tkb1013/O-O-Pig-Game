/*
	This program is based off of the Pig dice game. 
	See this website for more details on the implementation: http://nifty.stanford.edu/2010/neller-pig/oogame.html
*/

public class HoldAt20PigPlayer implements PigPlayer
{
   public boolean isRolling(int myScore, int otherScore, int turnTotal)
   {
      return ((turnTotal < 20) && (myScore + turnTotal < PigGame.GOAL_SCORE));
   }  
}
