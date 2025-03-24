package Ex4_2;

public class Text extends AGallery {
	private int numberOfLines;

	public Text(String fileName, int fileSize, int numberOfLines) {
		super(fileName, fileSize);
		this.numberOfLines = numberOfLines;
	}

	public int getNumberOfLines() {
		return numberOfLines;
	}

	public void setNumberOfLines(int numberOfLines) {
		this.numberOfLines = numberOfLines;
	}
	
}
