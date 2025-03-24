package bt4_5;

public abstract class AGallery implements IGallery {
	private String namesForSourceFile;
	private int size;

	public AGallery(String namesForSourceFile, int size) {
		super();
		this.namesForSourceFile = namesForSourceFile;
		this.size = size;
	}

	public String getNamesForSourceFile() {
		return namesForSourceFile;
	}

	public void setNamesForSourceFile(String namesForSourceFile) {
		this.namesForSourceFile = namesForSourceFile;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double timeToDownLoad(double networkSpeed) {
		return this.size / networkSpeed;
	}

	public boolean smallerThan(int maximumSize) {
		return this.size < maximumSize;
	}

	public boolean sameName(String givenName) {
		return this.namesForSourceFile.equals(givenName);
	}
}
