package main.structural.design.pattern.decorator;


/**
 * this is the sample of Decorator
 * @author John
 *
 */
public class Caramel extends Addon{
	
	private Beverage b;
	
	public Caramel(Beverage b) {
		this.b = b;
	}

	@Override
	public int cost() {
		return this.b.cost() + 2;
	}

	@Override
	public String desc() {
		return "Caramel";
	}
}
