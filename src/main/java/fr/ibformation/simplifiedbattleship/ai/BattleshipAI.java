package fr.ibformation.simplifiedbattleship.ai;

import java.util.Random;
import fr.ibformation.simplifiedbattleship.models.Grid;
import fr.ibformation.simplifiedbattleship.models.Shooting;

public class BattleshipAI implements GenericAI<Shooting, Grid> {

	Random rnd = new Random(73);
	
	@Override
	public Shooting play(Grid g) 
	{
		int coord1 = 0;
		int coord2 = 0;
		boolean ok = false;
		while(!ok)
		{
			coord1 = rnd.nextInt(g.getNbRows());
			coord2 = rnd.nextInt(g.getNbCols());
			if(!g.getCellByCoord(coord1,coord2).isRevealed())
				ok = true;
		}
		return new Shooting(coord1,coord2);
	}
}
