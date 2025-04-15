package main.design.pattern.strategy;

public class Driver {
	
	/**
	 * -this encapsulate each of one and make it interchangeable
	 * -rational lets the algorithm very independently from the client you use it. (decouple it).
	 * -e.g in list
	 * inject sorting strategy to that the sorting strategy can be very independently from the List.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		Duck d = new Duck();
		Display dt = new DisplayAsText(); 
		d.setDisplay(dt);
		d.getDisplay().display();
		
	
		
	}

}
