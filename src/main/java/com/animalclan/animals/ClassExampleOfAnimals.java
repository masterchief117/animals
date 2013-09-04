package com.animalclan.animals;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 * 
 */
public class ClassExampleOfAnimals {
	// private fields
	// if field is not of a primative type (int, long, double, etc. etc.)
	// it is PASSED BY REFERENCE (memory location)
	// List is therefore passed by reference
	/**
	 * This blue text means it is a java doc. It lets people read your comments.
	 * 
	 * 
	 * list of animals
	 */
	private List<Animal> animals;
	private static int animalCount = 0;

	// constructor, no-args (that means no arguements)
	/**
	 * 
	 */
	public ClassExampleOfAnimals() {
		animals = new ArrayList<Animal>();
	}

	// this method signature
	// public static void main(String[] args) is where
	// this is the entry point for ALL java projects start. I mean ALL.
	public static void main(String[] args) {
		// we are instantiating a class.
		ClassExampleOfAnimals classExampleOfAnimals = new ClassExampleOfAnimals();
		// this is an iterator
		// we set the index to 0, then check if it is less then four
		// if TRUE, we do everything in the block. If false we continue passed
		// the block
		// after the block completes on a TRUE, index++ is applied, shortcut for
		// (index = index + 1;)
		for (int index = 0; index < 5; index++) {

			// after instantiation we can call non-static methods!
			// look at the difference between
			// public static void main (String[] args)
			// and createAnimals. With no static
			// it requires an object to be created (see the new above)
			classExampleOfAnimals.addAnimalsToList(classExampleOfAnimals
					.createAnimals());
		}
		// a different kind of loop.
		// this says "for each Animal in the list of animals, do this"
		// We cannot use "this.animals" like down below because we are in a
		// static method
		// static methods do not have an instance associated with them
		// instead they are "Class level" and require no instantiation
		for (Animal animalInList : classExampleOfAnimals.animals) {
			String speak = animalInList.speak();
			System.out.println(animalInList.getClass().toString());
			System.out.println("And then I make some of this noise.... "
					+ speak);
			System.out.println();
		}

	}

	private void addAnimalsToList(Animal incomingAnimal) {
		// this refers to "this instance" It took me forever to figure out.
		// basically don't try to over analyze it. :-)
		this.animals.add(incomingAnimal);
	}

	/**
	 * Create an animal based on the animal count. If count not found, reset to
	 * 0.
	 * 
	 * @return
	 */
	private Animal createAnimals() {
		// set aside a memory address, but do not allocate any memory (null, or
		// empty)
		Animal animal = null;
		// this is a fancy way of doing a if, else if, else if, else if
		// it is called a switch case
		// we check animalCount, if it is 0, we do case 0, if 1 we do case 1..
		// etc.
		// if it is none of those, it does default, which will set animalCount
		// to 0
		switch (animalCount) {
		case 0:
			animal = new Lion();
			break;
		case 1:
			animal = new Walrus();
			break;
		case 2:
			animal = new Pigeon();
			break;
		case 3:
			animal = new Whale();
			break;
		case 4:
			animal = new Slug();
			break;
		default:
			animalCount = 0;
			break;
		}
		animalCount++;
		return animal;
	}
}
