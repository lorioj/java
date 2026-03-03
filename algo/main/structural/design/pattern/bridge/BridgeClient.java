package main.structural.design.pattern.bridge;

public class BridgeClient {
	
	public static void main(String[] args) {
		
		
		Remote r = new BasicRemote(new TV());
		r.power();
		
		
	}

}
