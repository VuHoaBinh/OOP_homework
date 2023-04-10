package bai3;

import java.util.ArrayList;

public class testGiaoDich {

	public static void main(String[] args) {
		ArrayList<giaoDich> danhSachGiaoDich = new ArrayList<giaoDich>();
		
		
        danhSachGiaoDich.add(new giaoDichVang("GD001", "01/01/2023", 5000, 2, "18K"));
        danhSachGiaoDich.add(new giaoDichTienTe("GD002", "02/01/2023", 25000, 1000, 23000, "USD"));
        danhSachGiaoDich.add(new giaoDichVang("GD003", "03/01/2023", 7000, 1, "24K"));
        danhSachGiaoDich.add(new giaoDichTienTe("GD004", "04/01/2023", 30000, 500, 0.000043, "EUR"));
        danhSachGiaoDich.add(new giaoDichTienTe("GD005", "05/01/2023", 800000000, 1, 1, "VND"));
        danhSachGiaoDich.add(new giaoDichTienTe("GD006", "06/01/2023", 15000, 800, 23000, "USD"));
        
        
        // Tính tổng số lượng cho từng loại
        int tongSoLuongVang = 0;
        int tongSoLuongTienTe = 0;
        for (giaoDich gd : danhSachGiaoDich) {
            if (gd instanceof giaoDichVang) {
                tongSoLuongVang += gd.getSoLuong();
            } else if (gd instanceof giaoDichTienTe) {
                tongSoLuongTienTe += gd.getSoLuong();
            }
        }
        System.out.println("Tong so luong giao dich vang: " + tongSoLuongVang);
        System.out.println("Tong so luong giao dich tien te: " + tongSoLuongTienTe);
        
        // Tính trung bình thành tiền của giao dịch tiền tệ
        double tongThanhTienTienTe = 0;
        int soGiaoDichTienTe = 0;
        for (giaoDich gd : danhSachGiaoDich) {
            if (gd instanceof giaoDichTienTe) {
                tongThanhTienTienTe += gd.tinhThanhTien();
                soGiaoDichTienTe++;
            }
        }
        double trungBinhThanhTienTienTe = tongThanhTienTienTe / soGiaoDichTienTe;
        System.out.println("Trung binh thanh tien cua giao dich tien te: " + trungBinhThanhTienTienTe);
        
        // Xuất ra các giao dịch có đơn giá > 1 tỷ
        System.out.println("Cac giao dich co don gia > 1 ty:");
        for (giaoDich gd: danhSachGiaoDich) {
        	if (gd.tinhThanhTien() > 1000000000) {
        		System.out.println(gd.toString());
        	}
        }

	}

}
