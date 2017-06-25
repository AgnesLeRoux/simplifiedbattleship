package fr.ibformation.simplifiedbattleship.models;

import java.util.ArrayList;
import java.util.List;

public class Grid {

	private PlayerType playerType;
	private int nbRows;
	private int nbCols;
	List<Cell> cells = new ArrayList<Cell>();
	List<Boat> boats = new ArrayList<Boat> ();
}
