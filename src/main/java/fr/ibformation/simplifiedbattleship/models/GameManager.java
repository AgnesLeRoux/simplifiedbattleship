package fr.ibformation.simplifiedbattleship.models;

import java.util.ArrayList;
import java.util.List;

import fr.ibformation.simplifiedbattleship.factories.GridFactory;

public class GameManager {

	private int nbWin;
	private int nbLose;
	private int nbDraw;
	
	private List<Game> games = new ArrayList<>();
	
	public Game playNewGame()
	{
		if(games.size()==0 || games.get(games.size()-1).getGameStatus() == GameStatus.over )
		{
			Game game = new Game();
			GridFactory gf = GridFactory.getInstance();
			Grid gridAI = gf.computeNewGrid(PlayerType.ai);
			System.out.println(gridAI);
			Grid gridHuman = gf.computeNewGrid(PlayerType.human);
			
			System.out.println(gridHuman);
			
			game.setGridHuman(gridHuman);
			game.setGridAI(gridAI);
			
			
			
			games.add(game);
		}
		
		return games.get(games.size()-1);
	}

}
