package rps;
import java.util.Random;

public class RockPaperScissors {

	private Random rand = new Random();
	private validRPSMoves enemyChoice;

	public String rpsFight(validRPSMoves userChoice) {
		return   ((enemyChoice = validRPSMoves.values()[this.rand.nextInt(3)])  != userChoice)
			? ((userChoice == validRPSMoves.PAPER && enemyChoice == validRPSMoves.ROCK)
			|| (userChoice == validRPSMoves.ROCK && enemyChoice == validRPSMoves.SCISSORS)
			|| (userChoice == validRPSMoves.SCISSORS && enemyChoice == validRPSMoves.PAPER)
			? "WIN": "LOSS") : "DRAW";}
}
