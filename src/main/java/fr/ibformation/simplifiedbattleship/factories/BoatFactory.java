package fr.ibformation.simplifiedbattleship.factories;

import java.util.Random;

import fr.ibformation.simplifiedbattleship.models.Boat;
import fr.ibformation.simplifiedbattleship.models.Grid;
import fr.ibformation.simplifiedbattleship.models.Orientation;

public class BoatFactory {
	
private static Random rnd = new Random(73);
	
	public static Boat computeNewBoat(int size, Grid grid )
	{
		Boat boat = new Boat();
		boat.setGrid(grid);
		boat.setSize(size);
		
		int nbRows = grid.getNbRows();
		int nbCols = grid.getNbCols();
		
		boolean boatOverlap = true;
		while(boatOverlap)
		{
			if(rnd.nextBoolean())
			{
				boat.setOrientation(Orientation.vertical);
				boat.setCoord1(rnd.nextInt(nbRows-size+1));
				boat.setCoord2(rnd.nextInt(nbCols));
			}
			else
			{
				boat.setOrientation(Orientation.horizontal);
				boat.setCoord1(rnd.nextInt(nbRows));
				boat.setCoord2(rnd.nextInt(nbCols-size+1));
			}
			
			boatOverlap = false;
			for(Boat boatInGrid : grid.getBoats())
			{
				if(boatInGrid.overlap(boat))
				{	
					boatOverlap = true;
					break;
				}
			}
		}
		return boat;
	}

}
