package Ex4_5;

public class Image {
	private int height;
	private int width;
	private String quality;
	public Image(int height, int width, String quality) {
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