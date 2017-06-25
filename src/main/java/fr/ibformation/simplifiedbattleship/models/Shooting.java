package fr.ibformation.simplifiedbattleship.models;

public class Shooting {

	private int coord1;
	private int coord2;
	
	public Shooting(int coord1, int coord2) {
		super();
		this.coord1 = coord1;
		this.coord2 = coord2;
	}
	
	public int getCoord1() {
		return coord1;
	}
	public int getCoord2() {
		return coord2;
	}
	
	@Override
	public String toString() {
		return "Shooting [coord1=" + coord1 + ", coord2=" + coord2 + "]";
	}
	
	
}
