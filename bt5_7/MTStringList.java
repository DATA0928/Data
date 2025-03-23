package bt5_7;

public class MTStringList implements IStringList {

	@Override
	public String toString() {
		return "";
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof MTStringList))
			return false;
		return true;
	}
}
