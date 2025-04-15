package main.design.pattern.strategy;

public class DisplayAsText implements Display{

	@Override
	public void display() {
		System.err.println("display as text");
	}

}
