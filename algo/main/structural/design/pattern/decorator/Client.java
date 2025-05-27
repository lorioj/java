package main.structural.design.pattern.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * You can also refer the sample to the java Stream API
 * 
 * @author John
 *
 */
public class Client {

	public static void main(String[] args) {

		/**
		 * way of on how to construct
		 */
		Beverage b = new Espresso();// amount is 10
		b = new Caramel(b); // amount is 2
		b = new Soy(b); // amount is 1
		System.out.println(b.cost()); // the output is 13

		/**
		 * other sample on how to construct
		 */
		Beverage bb = new Caramel(new Soy(new Espresso()));
		System.out.println(bb.cost());

		/**
		 * You can construct the decorator with the list/collection
		 */

		List<Beverage> l = new ArrayList<>();

		l.add(b);
		l.add(bb);
		l.forEach(o -> System.out.println(o.desc() + ":" + o.cost()));

	}

}
