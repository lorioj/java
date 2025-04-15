package main.structural.design.pattern.adapter;

public class Driver {

	public static void main(String[] args) {
		Circle circle = new Circle(2);
		
		SquareHole sh = new SquareHole(4);
		CircleToSquareAdapter adapter = new CircleToSquareAdapter(circle);
		
		
		System.err.println(sh.canFit(adapter));
		
	}
}
