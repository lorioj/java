package main.structural.design.pattern.adapter;

public class CircleToSquareAdapter extends Square{

	private Circle circle;

	
	public CircleToSquareAdapter(Circle circle) {
		super(circle.getRadius());
		this.circle = circle;
		
	}

	
	@Override
	public double getSideLength() {
		return 2 * this.circle.getRadius();
	}
	
}
