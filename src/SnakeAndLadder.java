
public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Please start the game ");
		int position = 0;
		while (true) {
		int dieNum = (int)Math.floor(Math.random()*10)%6 + 1;
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
		
		if (position >100) {   // Winning Condition 
			System.out.println("Player Won ");
			break;
		}
		if (position <= 0) {   /// If count goes less than 0, reassign to 0
			position = 0;
		}
		System.out.println(position);
		}
	}
}
	
