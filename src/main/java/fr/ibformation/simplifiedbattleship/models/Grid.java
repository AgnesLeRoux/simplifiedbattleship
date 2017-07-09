package fr.ibformation.simplifiedbattleship.models;

import java.util.ArrayList;
import java.util.List;

public class Grid {

	private PlayerType playerType;
	private int nbRows;
	private int nbCols;
	List<Cell> cells = new ArrayList<Cell>();
	List<Boat> boats = new ArrayList<Boat> ();

	public Grid(PlayerType playerType, int nbRows, int nbCols) 
	{
		super();
		this.playerType = playerType;
		this.nbRows = nbRows;
		this.nbCols = nbCols;
		for(int i=0; i<nbRows; i++)
			for(int j=0;j<nbCols; j++)
				this.cells.add(new Cell(i,j));
	}

	public void addBoat(Boat boat) {
		boats.add(boat);
		boat.setGrid(this);
		switch(boat.getOrientation())
		{
			case vertical:
			{
				int j=boat.getCoord2();
				for(int i=boat.getCoord1(); i<boat.getCoord1()+boat.getSize(); i++)
				{
					Cell c = cells.get(coord2Id(i,j));
					c.setContainsBoat(true);
				}
				break;
			}
			case horizontal:
			{
				int i=boat.getCoord1();
				for(int j=boat.getCoord2(); j<boat.getCoord2()+boat.getSize(); j++)
				{
					Cell c = cells.get(coord2Id(i,j));
					c.setContainsBoat(true);
				}
			}
		}
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
		return nbCols * coord1 + coord2;
	}
	
	public String toString1()
	{
		String str = "";
		for(int i=0;i<this.nbRows;i++)
		{
			for(int j=0;j<this.nbCols;j++)
			{
				
				Cell c = this.getCellByCoord(i, j);
				if (c.isRevealed() && c.isContainsBoat()) 
				{
					str += "X";
				}
				if(c.isRevealed() && !c.isContainsBoat())
				{
					str += "0";
				}
				if(!c.isRevealed() && c.isContainsBoat())
				{
					str += "B";
				}
				if(!c.isRevealed() && !c.isContainsBoat())
				{
					str += ".";
				}
				
				str+="";
			}
			str +="\n";
		}
		return str;
	}

	@Override
	public String toString() {
		return "Grid [playerType=" + playerType + ", nbRows=" + nbRows + ", nbCols=" + nbCols + ", cells=" + cells
				+ ", boats=" + boats + "]\n" + toString1();
	}
	


}
