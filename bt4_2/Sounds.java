package bt4_2;

public class Sounds extends AGallery {
	private Time playingTimes;

	public Sounds(String namesForSourceFiles, byte size, Time playingTimes) {
		super(namesForSourceFiles, size);
		this.playingTimes = playingTimes;
	}

	public Time getPlayingTimes() {
		return playingTimes;
	}

	public void setPlayingTimes(Time playingTimes) {
		this.playingTimes = playingTimes;
	}

	
	}

	
	
	
	

