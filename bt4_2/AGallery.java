package bt4_2;

public abstract class AGallery implements IGallery {
	private String namesForSourceFiles;
	private byte size;
	public AGallery(String namesForSourceFiles, Byte size) {
		
		this.namesForSourceFiles = namesForSourceFiles;
		this.size = size;
	}
	public String getNamesForSourceFiles() {
		return namesForSourceFiles;
	}
	public void setNamesForSourceFiles(String namesForSourceFiles) {
		this.namesForSourceFiles = namesForSourceFiles;
	}
	public byte getSize() {
		return size;
	}
	public void setSize(byte size) {
		this.size = size;
	}
	
	
	
	
}
