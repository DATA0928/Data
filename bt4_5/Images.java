package bt4_5;

public class Images extends AGallery {
	private double height;
	private double width;
	private String quality;

	public Images(String namesForSourceFile, int size, double height, double width, String quality) {
		super(namesForSourceFile, size);
		this.height = height;
		this.width = width;
		this.quality = quality;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Images))
			return false;
		else {
			Images that = (Images) obj;
			return this.height == that.height && this.width == that.width && this.quality.equals(that.quality);

		}
	}
}
