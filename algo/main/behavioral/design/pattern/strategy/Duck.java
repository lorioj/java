package main.behavioral.design.pattern.strategy;

public class Duck {
	private Display display;
	private Fly fly;
	
	//you can use also the constructor injection.
	public Duck() { 
		
	}
	
	public Display getDisplay() {
		return display;
	}
	public void setDisplay(Display display) {
		this.display = display;
	}
	public Fly getFly() {
		return fly;
	}
	public void setFly(Fly fly) {
		this.fly = fly;
	}

}
