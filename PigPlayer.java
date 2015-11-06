/*
	This program is based off of the Pig dice game. 
	See this website for more details on the implementation: http://nifty.stanford.edu/2010/neller-pig/oogame.html
*/

public interface PigPlayer
{
   boolean isRolling(int myScore, int otherScore, int turnTotal);
}
