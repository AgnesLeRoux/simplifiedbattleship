package fr.ibformation.simplifiedbattleship.models;

public class Game {

	private GameStatus gameStatus = GameStatus.ongoing;
	private int nbMovesMax  = 10;
	private int currentMove  =0;
	private PlayerType currentPlayer = PlayerType.human;
	private int nbPointHuman = 0;
	private int nbPointAI = 0;
	private PlayerType winner = null;
	
	private Grid gridHuman;
	private Grid gridAI;
	
	public Game() {
		super();
	}
	public GameStatus getGameStatus() {
		return gameStatus;
	}
	public int getNbMovesMax() {
		return nbMovesMax;
	}
	public int getCurrentMove() {
		return currentMove;
	}
	public PlayerType getCurrentPlayer() {
		return currentPlayer;
	}
	public int getNbPointHuman() {
		return nbPointHuman;
	}
	public int getNbPointAI() {
		return nbPointAI;
	}
	public PlayerType getWinner() {
		return winner;
	}
	public Grid getGridHuman() {
		return gridHuman;
	}
	public Grid getGridAI() {
		return gridAI;
	}
	public void setGridHuman(Grid gridHuman) {
		this.gridHuman = gridHuman;
	}
	public void setGridAI(Grid gridAI) {
		this.gridAI = gridAI;
	}
	@Override
	public String toString() {
		String str = 
		 "Game [gameStatus=" + gameStatus + ", nbMovesMax=" + nbMovesMax + ", currentMove=" + currentMove
				+ ", currentPlayer=" + currentPlayer + ", nbPointHuman=" + nbPointHuman + ", nbPointAI=" + nbPointAI
				+ ", winner=" + winner + ", gridHuman=" + gridHuman + ", gridAI=" + gridAI + "]";
		return str;
	}

	
	
}
