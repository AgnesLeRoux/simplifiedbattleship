package fr.ibformation.simplifiedbattleship.models;

public class Game {

	private GameStatus gameStatus;
	private int nbMovesMax  = 10;
	private int currentMove  =0;
	private PlayerType currentPlayer = PlayerType.human;
	private int nbPointHuman;
	private int nbPointIA;
	private PlayerType winner;
	
	private Grid gridHuman;
	private Grid gridIA;
}
