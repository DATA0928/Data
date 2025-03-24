package Ex5_4;

public class ConsAncesterTree implements IAncestorTree {
	private Person person;
	private IAncestorTree father;
	private IAncestorTree mother;

	public ConsAncesterTree(Person person, IAncestorTree father, IAncestorTree mother) {
		this.person = person;
		this.father = father;
		this.mother = mother;
	}
}
