package bt4_2;

public class Texts extends AGallery {
	private int numbersOfLines;

	public Texts(String namesForSourceFiles, byte size, int numbersOfLines) {
		super(namesForSourceFiles, size);
		this.numbersOfLines = numbersOfLines;
	}

	public int getNumbersOfLines() {
		return numbersOfLines;
	}

	public void setNumbersOfLines(int numbersOfLines) {
		this.numbersOfLines = numbersOfLines;
	}

	
	
	
}
