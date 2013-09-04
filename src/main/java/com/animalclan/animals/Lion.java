package com.animalclan.animals;

public class Lion extends Animal {
	@Override
	public String speak() {
		// you are on your own in figuring this one out! Good luck! :-)
		char[] speak = (new String("ROAR")).toCharArray();
		String noise = "";
		for (char s : speak) {
			noise += s;
		}
		return noise;
	}
}
