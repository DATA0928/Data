package bt4_5;

public class Texts extends AGallery {
	private int numberOfLines;

	public Texts(String namesForSourceFile, int size, int numberOfLines) {
		super(namesForSourceFile, size);
		this.numberOfLines = numberOfLines;
	}

	public int getNumberOfLines() {
		return numberOfLines;
	}

	public void setNumberOfLines(int numberOfLines) {
		this.numberOfLines = numberOfLines;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Texts))
			return false;
		else {
			Texts that = (Texts) obj;
			return this.numberOfLines == that.numberOfLines;
		}
	}
}
