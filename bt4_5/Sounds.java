package bt4_5;

public class Sounds extends AGallery {
	private Time playTimes;

	public Sounds(String namesForSourceFile, int size, Time playTimes) {
		super(namesForSourceFile, size);
		this.playTimes = playTimes;
	}

	public Time getPlayTimes() {
		return playTimes;
	}

	public void setPlayTimes(Time playTimes) {
		this.playTimes = playTimes;
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof Sounds))
			return false;
		else {
			Sounds that = (Sounds) obj;
			return this.playTimes == that.playTimes;

		}
	}
}
