package main.behavioral.design.pattern.observer;

/**
 * Defines a subscription mechanism.
 * Use when: event systems, notifications, UI updates.
 */

public class Client {
	public static void main(String[] args) {
			
		NewsAgency agency = new NewsAgency();
	
		NewsChannel cnn = new NewsChannel("cnn");
		agency.attach(cnn);
		
		NewsChannel abs = new NewsChannel("abs");
		agency.attach(abs);
		
		agency.setNews("latest news");
		
		agency.detach(abs);
		
		agency.setNews("sdfsdfsf");
		
	
		
		
	}
}
