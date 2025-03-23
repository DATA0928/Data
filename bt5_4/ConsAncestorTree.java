package bt5_4;

public class ConsAncestorTree implements IAncestorTree {
	private Person person;
	private IAncestorTree father;
	private IAncestorTree mother;

	public ConsAncestorTree(Person person, IAncestorTree father, IAncestorTree mother) {
		super();
		this.person = person;
		this.father = father;
		this.mother = mother;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public IAncestorTree getFather() {
		return father;
	}

	public void setFather(IAncestorTree father) {
		this.father = father;
	}

	public IAncestorTree getMother() {
		return mother;
	}

	public void setMother(IAncestorTree mother) {
		this.mother = mother;
	}

	public String toString() {
		return this.person + ",father:" + this.father + ",mother:" + this.mother;

	}
}
