package bai5;

import java.util.ArrayList;
import java.util.Calendar;
public class testKhachHang {

	public static void main(String[] args) {
		 ArrayList<khachHang> danhSachKH = new ArrayList<khachHang>();
		 
		 
        Calendar ngayLapHoaDon1 = Calendar.getInstance();
        ngayLapHoaDon1.set(2018, Calendar.SEPTEMBER, 10);
        khachHangVN khachHang1 = new khachHangVN("KH001", "Nguyễn Văn A", ngayLapHoaDon1, 200, 2000, "sinh hoạt",100);
        danhSachKH.add(khachHang1);

        Calendar ngayLapHoaDon2 = Calendar.getInstance();
        ngayLapHoaDon2.set(2018, Calendar.SEPTEMBER, 15);
        khachHangNuocNgoai khachHang2 = new khachHangNuocNgoai("KH002", "John Smith", ngayLapHoaDon2, 300, 2500, "USA");
        danhSachKH.add(khachHang2);

        Calendar ngayLapHoaDon3 = Calendar.getInstance();
        ngayLapHoaDon3.set(2018, Calendar.SEPTEMBER, 20);
        khachHangVN khachHang3 = new khachHangVN("KH003", "Trần Thị B", ngayLapHoaDon3, 1000, 1800, "kinh doanh",500 );
        danhSachKH.add(khachHang3);
        
        
        
        double sum = 0;
        int dem = 0;
        for (khachHang customer : danhSachKH) {
            if (customer instanceof khachHangNuocNgoai) {
                sum += customer.tinhThanhTien();
                dem++;
            }
        }
        System.out.println(dem > 0 ? sum / dem : 0);
        
     // Xuất các hoá đơn trong tháng 9 năm 2018

        System.out.println("Danh sách hoá đơn trong tháng 9 năm 2018:");
        for (khachHang customer : danhSachKH) {
            Calendar date = customer.getNgayLapHD();
            if (date.get(Calendar.YEAR) == 2018 && date.get(Calendar.MONTH) == 9) {
                System.out.println(customer);
            }
        }
        
	}

}
