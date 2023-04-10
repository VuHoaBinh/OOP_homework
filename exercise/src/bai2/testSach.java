package bai2;

import java.util.ArrayList;

public class testSach {

	public static void main(String[] args) {
		ArrayList<nhaSach> danhSachSach = new ArrayList<nhaSach>();

        // Tao sach giao khoa
		nhaSach sgk1 = new sachGiaoKhoa("SGK1", "1/1/2022", 50000, 20, "NXB A", "mới");
		nhaSach sgk2 = new sachGiaoKhoa("SGK2", "2/2/2022", 30000, 15, "NXB B", "cũ");
       
		nhaSach sgk3 = new sachThamKhao("STK1", "12/1/2022", 50000, 20, "NXB C", 10);
		nhaSach sgk4 = new sachThamKhao("STK2", "22/2/2022", 30000, 15, "NXB D", 20);
		
        danhSachSach.add(sgk1);
        danhSachSach.add(sgk2);
        danhSachSach.add(sgk3);
        danhSachSach.add(sgk4);
        // Tính tổng thành tiền cho từng loại sách
        double tongThanhTienGiaoKhoa = 0;
        double tongThanhTienThamKhao = 0;
        
        for (nhaSach sach : danhSachSach) {
            if (sach instanceof sachGiaoKhoa) {
                sachGiaoKhoa sachGiaoKhoa = (sachGiaoKhoa) sach;
                tongThanhTienGiaoKhoa += sachGiaoKhoa.thanhTien();
            } else if (sach instanceof sachThamKhao) {
                sachThamKhao sachThamKhao = (sachThamKhao) sach;
                tongThanhTienThamKhao += sachThamKhao.thanhTien();
            }
        }
        
        System.out.println("Tong thanh tien sach giao khoa: " + tongThanhTienGiaoKhoa);
        System.out.println("Tong thanh tien sach tham khao: " + tongThanhTienThamKhao);
        
        // Tính trung bình cộng đơn giá của các sách tham khảo
        double tongDonGiaSachThamKhao = 0;
        int soLuongSachThamKhaoCoDonGia = 0;
        
        for (nhaSach sach : danhSachSach) {
            if (sach instanceof sachThamKhao) {
                sachThamKhao sachThamKhao = (sachThamKhao) sach;
                tongDonGiaSachThamKhao += sachThamKhao.getDonGia();
                soLuongSachThamKhaoCoDonGia++;
            }
        }
        
        double trungBinhCongDonGiaSachThamKhao = tongDonGiaSachThamKhao / soLuongSachThamKhaoCoDonGia;
        System.out.println("Trung binh cong don gia sach tham khao: " + trungBinhCongDonGiaSachThamKhao);

	}

}
