
public class SnakeAndLadder {

	public static void main(String[] args) {
		System.out.println("Please start the game ");
		int start = 0;  /// We are initializing player 1 position as 0
		int dieNum = (int)Math.floor(Math.random()*10)%6 + 1;
		System.out.println(dieNum);
	}

}
