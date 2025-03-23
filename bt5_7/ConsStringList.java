package bt5_7;

public class ConsStringList implements IStringList {
	private String first;
	private IStringList rest;

	public ConsStringList(String first, IStringList rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public IStringList getRest() {
		return rest;
	}

	public void setRest(IStringList rest) {
		this.rest = rest;
	}

	@Override
	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();
	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ConsStringList))
			return false;
		else {
			ConsStringList that = (ConsStringList) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);
		}
	}
}
