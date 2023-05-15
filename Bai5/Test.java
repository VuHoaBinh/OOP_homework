package Bai5;

import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {
		KhachHang k1 = new KhachHangVN("1125689","Tran Anh",new GregorianCalendar(2012, 11, 10), 30 , 40,"Kinh Doanh",20);
		KhachHang k2 = new KhachHangVN("0123124","Nguyen Van A",new GregorianCalendar(2015, 5, 23), 40 ,20,"Lap Trinh Vien",50);
		KhachHang k3 = new KhachHangVN("9123993","Vu Binh",new GregorianCalendar(2018, 9, 10), 50 , 90,"Giao Vien",30);
		KhachHang k4 = new KhachHangNuocNgoai("1234567","John",new GregorianCalendar(2020, 11, 20), 60 , 100,"USA");
		KhachHang k5 = new KhachHangNuocNgoai("2345678","Nick",new GregorianCalendar(2018, 5, 22), 70 ,50,"UK");
		KhachHang k6 = new KhachHangNuocNgoai("3456789","Tom",new GregorianCalendar(2018, 9, 16), 80 , 200,"UAE");
		ListKhachHang ls= new ListKhachHang();
		ls.themKH(k1);
		ls.themKH(k2);
		ls.themKH(k3);
		ls.themKH(k4);
		ls.themKH(k5);
		ls.themKH(k6);
		// xuat
		ls.print();
		
		// tinh tong tung loai khach
		ls.tinhTongKhach();
		
		// Xuất các hoá đơn trong tháng 9 năm 2018
		ls.xuatHoaDon();
        
     
	}

}
