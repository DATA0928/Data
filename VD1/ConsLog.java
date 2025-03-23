package VD1;

public class ConsLog implements ILog {
	private Entry first;
	private ILog rest;

	public ConsLog(Entry first, ILog rest) {
		super();
		this.first = first;
		this.rest = rest;
	}

	public Entry getFirst() {
		return first;
	}

	public void setFirst(Entry first) {
		this.first = first;
	}

	public ILog getRest() {
		return rest;
	}

	public void setRest(ILog rest) {
		this.rest = rest;
	}

	public String toString() {
		return this.first.toString() + "\n" + this.rest.toString();

	}

	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof ILog))
			return false;
		else {
			ConsLog that = (ConsLog) obj;
			return this.first.equals(that.first) && this.rest.equals(that.rest);

		}

	}
}
