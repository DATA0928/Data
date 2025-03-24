package Ex4_2;

public class Image extends AGallery {
	private int height; // in pixels
	private int width; // in pixels
	private String quality;
	public Image(String fileName, int fileSize, int height, int width, String quality) {
		super(fileName, fileSize);
		this.height = height;
		this.width = width;
		this.quality = quality;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	
}
