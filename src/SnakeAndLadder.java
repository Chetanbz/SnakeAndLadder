
public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Please start the game ");
		int player1Position = 0;
		int player2Position = 0;
		outer:
		while(true) { // This loop will be terminated only if any player got exact 100
			// Player 1 is playing
			while (true) {
				System.out.println("Player 1 Playing ");
				int nextMove = 0;       // If nextMove is 0 then next player will play terminate loop
				int dieNum = (int)Math.floor(Math.random()*10)%6 + 1;
				int checkPlayStatus = (int)Math.floor(Math.random()*10)%3;
				if (checkPlayStatus == 0) {   //Ladder condition
					nextMove = 1;             // nextMove will be assigned 1 so player will continue for ladder case
					player1Position += dieNum;
				}
				else if (checkPlayStatus == 1) {//Snake condition
					player1Position -= dieNum;
				}
				else  {// No play condition
					continue;
				}
		
				//// Condition check for condtion win, less than 0, greater than 0
				if (player1Position == 100)   {  // Winning Condition  & break out of loop
					System.out.println("Player 1 Won ");
					break outer;
				}
				else if(player1Position >100) { // Player position needs to reverse, Player stays in original position
					System.out.println(player1Position + " wasted turn ");
					player1Position -=dieNum;	
				}
				else if (player1Position <= 0){ /// If count goes less than 0, reassign to 0
					player1Position = 0;
				}
				else {                  /// Play continue              
			
				}
				System.out.println("#Player 1 Position : "+ player1Position + " #Player 2 Position : "+ player2Position);
				if (nextMove ==0 ) {
					break;
				}
			}
			// Player 2 is playing
			while (true) {
				System.out.println("Player 2 Playing ");
				int nextMove = 0;       // If nextMove is 0 then next player will play terminate loop
				int dieNum = (int)Math.floor(Math.random()*10)%6 + 1;
				int checkPlayStatus = (int)Math.floor(Math.random()*10)%3;
				if (checkPlayStatus == 0) {   //Ladder condition
					nextMove = 1;             // nextMove will be assigned 1 so player will continue for ladder case
					player2Position += dieNum;
				}
				else if (checkPlayStatus == 1) {//Snake condition
					player2Position -= dieNum;
				}
				else  {// No play condition
					continue;
				}
		
				//// Condition check for condtion win, less than 0, greater than 0
				if (player2Position == 100)   {  // Winning Condition  & break out of loop
					System.out.println("Player 2 Won ");
					break outer;
				}
				else if(player2Position >100) { // Player position needs to reverse, Player stays in original position
					System.out.println(player2Position + " wasted turn ");
					player2Position -=dieNum;	
				}
				else if (player2Position <= 0){ /// If count goes less than 0, reassign to 0
					player2Position = 0;
				}
				else {                  /// Play continue              
			
				}
				System.out.println("#Player 1 Position : "+ player1Position + " #Player 2 Position : "+ player2Position);
				if (nextMove ==0 ) {
					break;
				}
			}
		
		
		}
	
	}
}
	
