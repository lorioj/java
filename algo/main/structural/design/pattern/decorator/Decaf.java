package main.structural.design.pattern.decorator;

/**
 * This is the sample of Component
 * @author John
 *
 */

public class Decaf extends Beverage{

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public String desc() {
		return "Decaf";
	}

}
