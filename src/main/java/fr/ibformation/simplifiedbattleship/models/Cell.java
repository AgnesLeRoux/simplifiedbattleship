package fr.ibformation.simplifiedbattleship.models;

public class Cell {

	private int coord1;
	private int coord2;
	private boolean containsBoat;
	private boolean revealed;
	
	public int getCoord1() {
		return coord1;
	}
	public int getCoord2() {
		return coord2;
	}
	public boolean isContainsBoat() {
		return containsBoat;
	}
	public boolean isRevealed() {
		return revealed;
	}
	
	
}
