package fr.ibformation.simplifiedbattleship.models;

public class Cell {

	private int coord1;
	private int coord2;
	private boolean containsBoat;
	private boolean revealed;
	
	public Cell(int coord1, int coord2) {
		super();
		this.coord1 = coord1;
		this.coord2 = coord2;
		this.containsBoat = false;
		this.revealed = false;
	}
	
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

	public void setContainsBoat(boolean containsBoat) {
		this.containsBoat = containsBoat;
	}

	public void setRevealed(boolean revealed) {
		this.revealed = revealed;
	}

	@Override
	public String toString() {
		return "Cell [coord1=" + coord1 + ", coord2=" + coord2 + ", containsBoat=" + containsBoat + ", revealed="
				+ revealed + "]";
	}
}
