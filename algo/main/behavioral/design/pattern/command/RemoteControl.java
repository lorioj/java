package main.behavioral.design.pattern.command;

/**
 * This is the example of invoker
 * @author John
 *
 */

public class RemoteControl {

	private Command on;
	
	private Command off;
	
	//declare other commands
	
	
	public RemoteControl(Command on, Command off) {
		this.on = on;
		this.off = off;
	}

	
	public void pressOn() {
		this.on.execute();
	}
	
	public void pressOff() {
		this.off.execute();
	}
	
	
}
