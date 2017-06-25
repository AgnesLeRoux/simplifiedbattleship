package fr.ibformation.simplifiedbattleship.models;

public class Boat {
	private  Orientation orientation;
	private int size;
	private int coord1;
	private int coord2;
	
	private Grid grid;

	public boolean overlap(Boat boat) {
		switch(this.getOrientation())
		{
		case vertical:
			switch(boat.orientation)
			{
			case vertical:
				if(this.coord2 != boat.coord2 ||
				(this.coord2 == boat.coord2 && !intersect(this.coord1,this.coord1+this.size-1,boat.coord1,boat.coord1+boat.size-1)))
					return false;
				else 
					return true;
			case horizontal:
				if(intersect(this.coord1,this.coord1+this.size-1,boat.coord1,boat.coord1)&&
						intersect(this.coord2,this.coord2,boat.coord2,boat.coord2+boat.size-1))
					return true;
				else
					return false;
			}
			break;
		case horizontal:
			switch(boat.orientation)
			{
			case vertical:
				if(intersect(this.coord1,this.coord1,boat.coord1,boat.coord1+boat.size-1)&&
						intersect(this.coord2,this.coord2+this.size-1,boat.coord2,boat.coord2))
					return true;
				else
					return false;
			case horizontal:
				if(this.coord1 != boat.coord1 ||
				(this.coord1 == boat.coord1 && !intersect(this.coord2,this.coord2+this.size-1,boat.coord2,boat.coord2+boat.size-1)))
					return false;
				else 
					return true;
			}
		}
		return false;
	}
	
	 // return true if interval [a,b] intesects interval [c,d]
		public static boolean intersect(int a, int b, int c, int d) 
		{
			if(b<c || d<a)
				return false;
			else
				return true;
		}
	
		
	//////////////////////////////////////////////////////////
	
	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCoord1() {
		return coord1;
	}

	public void setCoord1(int coord1) {
		this.coord1 = coord1;
	}

	public int getCoord2() {
		return coord2;
	}

	public void setCoord2(int coord2) {
		this.coord2 = coord2;
	}

	public Grid getGrid() {
		return grid;
	}

	public void setGrid(Grid grid) {
		this.grid = grid;
	}


	
	
	
}
