package main.structural.design.pattern.decorator;


/**
 * this is the sample of Decorator
 * @author John
 *
 */
public class Soy extends Addon{
	private Beverage b;
	public Soy(Beverage b) {
		this.b = b;
	}
	
	@Override
	public int cost() {
		return this.b.cost() + 1;
	}

	@Override
	public String desc() {
		return "Soy";
	}

}
