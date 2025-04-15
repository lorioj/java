package main.structural.design.pattern.adapter;

public class SquareHole {
	
	private double sideLength;
	
	public SquareHole(double sideLength) {
		this.sideLength = sideLength;
	}
	
	public boolean canFit(Square square) {
		if(this.sideLength >= square.getSideLength()) {
			return true;
		}
		return false;
	}

}
