package com.animalclan.animals;

// abstract classes can not be instantiated
// however, they can contain methods (not just signatures).
// this also creates a contract with all
public abstract class Animal implements AnimalNoise {
	// since this class implements a contract (AniamlNoise) it must contain the
	// method public String speak()
	public String speak() {
		String speak = "I make no noise. Give me a noise!";
		return speak;
	}

}
