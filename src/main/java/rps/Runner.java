package rps;

public class Runner {

	public static void main(String[] args) {

		RockPaperScissors rpsSim = new RockPaperScissors();

		for (int i = 0; i < 100; i++) {
			System.out.println("PAPER FIGHT ^^ " + rpsSim.rpsFight(validRPSMoves.PAPER));
			System.out.println("ROCK FIGHT ^^ " + rpsSim.rpsFight(validRPSMoves.ROCK));
			System.out.println("SCISSOR FIGHT ^^ " + rpsSim.rpsFight(validRPSMoves.SCISSORS));

		}
	}

}
