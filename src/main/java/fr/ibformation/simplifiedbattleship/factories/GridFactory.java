package fr.ibformation.simplifiedbattleship.factories;

import fr.ibformation.simplifiedbattleship.models.Boat;
import fr.ibformation.simplifiedbattleship.models.Grid;
import fr.ibformation.simplifiedbattleship.models.PlayerType;

public final class GridFactory {

	private static GridFactory instance = null;
	
	private int nbRows = 10;
	private int nbCols = 11;
	private BoatFactory bf = BoatFactory.getInstance();
	
	private GridFactory()
	{
		super();
	}
	
	public final static GridFactory getInstance()
	{
		if(instance == null)
		{
			instance = new GridFactory();
		}
		return instance;
	}

	public Grid computeNewGrid(PlayerType pt)
	{
		Grid grid = new Grid(pt, nbRows, nbCols);
		
		Boat b1 = bf.computeNewBoat(5,grid);
		grid.addBoat(b1);
		Boat b2 = bf.computeNewBoat(2, grid);
		grid.addBoat(b2);
		
		return grid;
	}
	
}
