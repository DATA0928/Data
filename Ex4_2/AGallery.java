package Ex4_2;

public abstract class AGallery {
	protected String fileName;
	protected int fileSize; // in bytes

	public AGallery(String fileName, int fileSize) {
		this.fileName = fileName;
		this.fileSize = fileSize;
	}
}
