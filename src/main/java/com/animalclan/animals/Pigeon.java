package com.animalclan.animals;

public class Pigeon extends Animal {
	public String speak() {
		// this is another way of creating thing without setting it to a
		// variable.
		// we will just instantiate and then return! no String speak = new
		// String("askdfds"); needed
		return new String("Some pigeon noise");
	}
}
