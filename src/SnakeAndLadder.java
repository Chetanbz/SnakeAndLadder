
public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Please start the game ");
		int dieNum = (int)Math.floor(Math.random()*10)%6 + 1;
		
		int checkPlayStatus = (int)Math.floor(Math.random()*10)%3;
		if (checkPlayStatus == 0) {
			System.out.println(" No Play");
		}
		else if (checkPlayStatus == 1) {
			System.out.println(" Ladder");
		}
		else  {
			System.out.println(" Snake");
		}
	}
}
	
