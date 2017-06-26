package fr.ibformation.simplifiedbattleship;

import fr.ibformation.simplifiedbattleship.factories.BoatFactory;
import fr.ibformation.simplifiedbattleship.models.Grid;
import fr.ibformation.simplifiedbattleship.models.PlayerType;

public class LauncherForTest {

	public static void main(String[] args) {
		
		BoatFactory bf = BoatFactory.getInstance();
		
		bf.computeNewBoat(2, new Grid(PlayerType.ai, 5, 5));
	}
}
