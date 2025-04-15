package main.design.pattern.creational.factory;

import java.util.ArrayList;

public abstract class Burger {
	
	  String name;
	  String bread;
	  String sauce;
	  ArrayList<String> toppings = new ArrayList<String>();
	  
	  void prepare() {
	    // ...
	  }

	  void cook() {
	    //...
	  }

	  void serve() {
	    // ...
	  }

	  public String getName() {
	    return name;
	  }
}
