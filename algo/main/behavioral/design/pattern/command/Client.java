package main.behavioral.design.pattern.command;

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
