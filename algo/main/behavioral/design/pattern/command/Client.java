package main.behavioral.design.pattern.command;

/**
 * Encapsulates a request as an object.
 * Use when: implementing undo/redo, queues, or task scheduling.
 */
public class Client {

	public static void main(String[] args) {

		Light l = new Light();
		Command lOn = new LightOnCommand(l);
		Command lOff = new LightOffCommand(l);

		RemoteControl remote = new RemoteControl(lOn, lOff);
		remote.pressOn();
		remote.pressOff();

	}

}
