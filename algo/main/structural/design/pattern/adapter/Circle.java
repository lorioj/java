package main.structural.design.pattern.adapter;

/**
 * Makes incompatible interfaces work together.
 * Use when: integrating legacy or third-party code.
 */


public class Circle {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}

}
