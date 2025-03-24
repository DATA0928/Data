package bai4_2;

import junit.framework.TestCase;

public class IZooAnimalTest extends TestCase {
	public void testConstructor() {
		// test for class Lion
		IZooAnimal leo = new Lion("Leo", 300, 5);
		IZooAnimal samba = new Lion("Samba", 200, 3);
		IZooAnimal Cleopon = new Lion("Cleopon", 250, 5);
		// test for class Snake
		IZooAnimal boa = new Snake("Boa", 50, 5);
		IZooAnimal mic = new Snake("Mic", 45, 4);
		IZooAnimal bu = new Snake("Bu", 55, 6);
		// test for class Monkey
		IZooAnimal george = new Monkey("George", 150, "banana");
		IZooAnimal mina = new Monkey("Mina", 120, "Kiwi");
		IZooAnimal slan = new Monkey("Slan", 100, "Kiwi");
		}
}
