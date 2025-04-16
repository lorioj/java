package main.structural.design.pattern.decorator;

/**
 * This is the sample of Component
 * 
 * @author John
 *
 */

public class Espresso extends Beverage {

	@Override
	public int cost() {
		return 10;
	}

	@Override
	public String desc() {
		return "Espresso";
	}

}
