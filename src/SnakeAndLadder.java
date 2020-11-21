
public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Please start the game ");
		int position = 0;
		int count = 0 ;     // It count number of time die thrown 
		while (true) {
		int dieNum = (int)Math.floor(Math.random()*10)%6 + 1;
		count++;
		int checkPlayStatus = (int)Math.floor(Math.random()*10)%3;
		if (checkPlayStatus == 0) {   //Ladder condition
			position += dieNum;
		}
		else if (checkPlayStatus == 1) {//Snake condition
			position -= dieNum;
		}
		else  {// No play condition
		   continue;
		}
		
	    //// Condition check for condtion win, less than 0, greater than 0
		if (position == 100)   {  // Winning Condition  & break out of loop
			System.out.println("Player Won ");
			break;
		}
		else if(position >100) { // Player position needs to reverse, Player stays in original position
			System.out.println(position + " wasted turn ");
			position -=dieNum;	
		}
		else if (position <= 0){ /// If count goes less than 0, reassign to 0
			position = 0;
		}
		else {                  /// Play continue              
			
		}
		System.out.println(position);
		}
	System.out.println("Total number of times die need to roll to win the game  is : " + count);
	}
}
	
