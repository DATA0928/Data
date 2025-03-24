package Ex4_2;

public class Sound extends AGallery {
	private int playingTime; // in seconds

	public Sound(String fileName, int fileSize, int playingTime) {
		super(fileName, fileSize);
		this.playingTime = playingTime;
	}

	public int getPlayingTime() {
		return playingTime;
	}

	public void setPlayingTime(int playingTime) {
		this.playingTime = playingTime;
	}

}
