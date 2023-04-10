package quanlisach;

public class test_book {

	public static void main(String[] args) {
		ngay ngay1 = new ngay(12,2,2003);
		ngay ngay2 = new ngay(13,2,2003);
		ngay ngay3 = new ngay(14,2,2003);
		
		tacGia tg1 = new tacGia("binh", ngay1);
		tacGia tg2 = new tacGia("bin", ngay2);
		tacGia tg3 = new tacGia("bi", ngay3);
		
		book b1 = new book("hahaha", 2000, 2, tg1);
		book b2 = new book("hah", 2000, 2, tg2);
		book b3 = new book("hahhasd", 2000, 2, tg3);
		
		b1.inTenSach();
		b2.inTenSach();
		b3.inTenSach();
	}

}
