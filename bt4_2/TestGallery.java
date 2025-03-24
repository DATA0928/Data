package bt4_2;


import org.junit.Test;

public class TestGallery {

	@Test
	public void testSounds() {
		new Sounds("a music piece,stored in theme.mp3",(byte) 40.960,new Time(0, 3, 20));
		new Image("an image, stored in flower.gif",(byte) 57.234, 100, 50,"medium");
		new Texts("a text, stored in welcome.txt",(byte) 5312,830);
		
		
		
		

	}
}
