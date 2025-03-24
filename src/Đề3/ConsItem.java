package Đề3;

public class ConsItem {
	public int howManyStoryAndJournal() {
		
		if (this.first.howManyStoryAndJournal() ==1)
			return 1+ this.rest.howManyStoryAndJournal();
		return this.rest.howManyStoryAndJournal();
	}
}
