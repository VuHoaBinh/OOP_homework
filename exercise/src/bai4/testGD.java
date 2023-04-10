package bai4;

import java.util.ArrayList;
import java.util.Calendar;

public class testGD {

	public static void main(String[] args) {
		ArrayList<giaoDich> ls = new ArrayList<giaoDich>();
		
		Calendar ngayLapHoaDon1 = Calendar.getInstance();
        ngayLapHoaDon1.set(2022, Calendar.JANUARY, 2);
        Calendar ngayLapHoaDon2 = Calendar.getInstance();
        ngayLapHoaDon1.set(2022, Calendar.JANUARY, 3);
        Calendar ngayLapHoaDon3 = Calendar.getInstance();
        ngayLapHoaDon1.set(2022, Calendar.JANUARY, 4);
        Calendar ngayLapHoaDon4 = Calendar.getInstance();
        ngayLapHoaDon1.set(2022, Calendar.JANUARY, 5);
        
		ls.add(new giaoDichDat("GD001",ngayLapHoaDon1, 1000000, 200, "A"));
		ls.add(new giaoDichDat("GD002", ngayLapHoaDon2, 2000000, 150, "B"));
		ls.add(new giaoDichDat("GD003", ngayLapHoaDon3, 3000000, 100, "C"));
		ls.add(new giaoDichNha("GD004", ngayLapHoaDon4, 5000000,300, "cao cấp", "123 Đường ABC"));
		
		// trung binh
		double tongThanhTien = 0;
	    int soLuongDat = 0;
	    for (giaoDich giaoDich : ls) {
	        if (giaoDich instanceof giaoDichDat) {
	            tongThanhTien += giaoDich.getThanhTien();
	            soLuongDat++;
	        }
	    }
	    System.out.println(tongThanhTien / soLuongDat);
	    
	    // xuat 9/2013
	    System.out.println("Cac giao dich thang 9 nam 2013:");
	    for (giaoDich giaoDich : ls) {
	    	if (giaoDich.getNgayGD().get(Calendar.MONTH) == 9 && giaoDich.getNgayGD().get(Calendar.YEAR) == 2013) {
	            System.out.println(giaoDich);
	        }
	    }
	}

}
