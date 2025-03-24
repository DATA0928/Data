package Ex4_5;

public abstract class AGallery {
	protected String fileName;
	protected int fileSize;

	public AGallery(String fileName, int fileSize) {
		this.fileName = fileName;
		this.fileSize = fileSize;
	}

	public double timeToDownLoad(double networkSpeed) {
		return this.fileSize / networkSpeed;
	}

	public boolean smallerThan(int maximumSize) {
		return this.fileSize < maximumSize;
	}

	public boolean sameName(String givenName) {
		return this.fileName.equals(givenName);
	}
}
