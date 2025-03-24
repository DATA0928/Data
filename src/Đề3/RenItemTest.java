package Đề3;

import junit.framework.TestCase;

public class RenItemTest extends TestCase {
	public void testConstructor() {
		//sach tham khao
		LibraryItem stk1 = new ReferenceBook(101, "Bậc thầy môi giới địa ốc",new Author("Henry Huỳnh Anh Dũng", 1960), "NXB Trẻ", 7, 300000, "Kinh tế");
		LibraryItem stk2 = new ReferenceBook(102, "Nhạc lý căn bản và nâng cao", new Author("Lương Bằng Vinh", 1970),
				"NXB Thị Nghè", 7, 30000, "Nhạc");
		//truyen
		LibraryItem t1= new Story(201, "Doremon", new Author("Fujiko. F. Fujio", 1950), "NXB Kim Đồng", 3, 20000);
		LibraryItem t2= new Story(202, "Tôi thấy hoa vàng trên cỏ xanh", new Author("Nguyễn Nhật Ánh", 1955), "NXB Trẻ",3, 45000);
		//tap chi
		LibraryItem tc1=new Journal(301, "Thế giới Vi Tính số 256",null, "PC World Việt Nam", 1,20000, new Date(14,2,2014));
	LibraryItem tc2 = new Journal(302, "Nhịp cầu đầu tư số 387", null, "MTV Ấn Phẩm", 1,15000, new Date(20,6,2014) );
	RentItem r1 = new RentItem(stk1, 4);
	RentItem r2=new RentItem(tc1, 3);
	MTRentItems empty = new MTRentItems();
	//list an pham
	MTItems mt=new MTItems();
	ListItems it1=new ConsItems(stk1, mt);
	ListItems it2=new ConsItems(stk2, it1);
	ListItems it3=new ConsItems(t1, it2);
	ListItems it4=new ConsItems(t2,it3);
	ListItems it5=new ConsItems(tc1, it4);
	ListItems all=new ConsItems(tc2, it5);
	//list mượn
	RentItems ren1= new ConsRentItems(r1, empty);
	RentItems ren2= new ConsRentItems(r2, ren1);
	// reader
	Reader rr1=new Reader("Nguyen Tuan","Nguyenng@gmail.com", ren2);
	System.out.println(rr1);
	//test getType()
	assertEquals(stk1.getType(), "ReferenceBook");
	assertEquals(tc2.getType(), "Journal");
	//test isAuthor(name)
	assertEquals(stk1.isAuthor("Henry Huỳnh Anh Dũng"), true);
	//test lossFee()
	assertEquals(t1.lossFee(),24000.0);
	assertEquals(all.howManyStoryAndJournal(), 4);
		}
}
