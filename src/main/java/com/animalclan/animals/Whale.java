package com.animalclan.animals;

public class Whale extends Animal {
	// this specifies it is an override from a class in animal (or some other
	// inherited class). I don't do this
	// in all classes
	// that is bad programming!
	@Override
	public String speak() {
		// "somethingInQuotes" is the same thing as saying String speak =
		// "ajksdjfds";
		return "Whale NOISE!! SO LOUD";
	}
}
