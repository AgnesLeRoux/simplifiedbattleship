package fr.ibformation.simplifiedbattleship.models;

import java.util.ArrayList;
import java.util.List;

public class Grid {

	private PlayerType playerType;
	private int nbRows;
	private int nbCols;
	List<Cell> cells = new ArrayList<Cell>();
	List<Boat> boats = new ArrayList<Boat> ();
	
	public Grid(PlayerType playerType, int nbRows, int nbCols, List<Cell> cells, List<Boat> boats) 
	{
		super();
		this.playerType = playerType;
		this.nbRows = nbRows;
		this.nbCols = nbCols;
		this.cells = cells;
		this.boats = boats;
	}
	
	public PlayerType getPlayerType() {
		return playerType;
	}
	public void setPlayerType(PlayerType playerType) {
		this.playerType = playerType;
	}
	public int getNbRows() {
		return nbRows;
	}
	public void setNbRows(int nbRows) {
		this.nbRows = nbRows;
	}
	public int getNbCols() {
		return nbCols;
	}
	public void setNbCols(int nbCols) {
		this.nbCols = nbCols;
	}
	public List<Cell> getCells() {
		return cells;
	}
	public void setCells(List<Cell> cells) {
		this.cells = cells;
	}
	public List<Boat> getBoats() {
		return boats;
	}
	public void setBoats(List<Boat> boats) {
		this.boats = boats;
	}

	public Cell getCellByCoord(int coord1, int coord2) {
		return cells.get(coord2Id(coord1,coord2));
	}

	private int coord2Id(int coord1, int coord2) {
		return nbRows * coord1 + coord2;
	}
	
	
	
	
}
