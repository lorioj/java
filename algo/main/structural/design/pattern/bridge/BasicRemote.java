package main.structural.design.pattern.bridge;

public class BasicRemote extends Remote{
	
	public BasicRemote(Device device) {
		super(device);
		
	}
	public void on() {
		device.on();
	}
	@Override
	public void power() {
		this.device.on();
	}
	
	

}
