package Bai5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ListKhachHang {
	List<KhachHang> ls;
	public ListKhachHang() {
		ls= new ArrayList<KhachHang>(1);
	}
	// add 
	public boolean themKH(KhachHang kh) {
		if (!ls.contains(kh)) {
			return ls.add(kh);
		} else {
			return false;
		}
	}
	//delete
	public boolean xoaKH(String maKH) {
		for (KhachHang kh : ls) {
			if (kh.getMaKH().equalsIgnoreCase(maKH)) {
				ls.remove(kh);
			}
		}
		return false;
	}
	public List<KhachHang> getAllKH(){
		return ls;
	}
	// find id
	public void timKiemTheoMaKhachHang(String khachHang){
        for(KhachHang kh : ls){
            if(kh.maKH.equalsIgnoreCase(khachHang)){
                System.out.println(kh.toString() + "\n");
            }
        }
    }
	// print
	 public void print(){
        for(KhachHang kh : ls){
            System.out.println(kh.toString() + "\n");
        }
    }
	// sort id
	 public void sapXepTheoMaKhachHang() {
        int n = ls.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ls.get(i).getMaKH().compareTo(ls.get(j).getMaKH()) > 0) {
                	KhachHang temp = ls.get(i);
                    ls.set(i, ls.get(j));
                    ls.set(j, temp);
                }
            }
         }
      }
	 
	// update
	public boolean capNhatTen(String maKH, String ten) {
		for (KhachHang kh : ls) {
			if (kh.getMaKH().equalsIgnoreCase(maKH)) {
				((KhachHang) kh).setHoTen(ten);
				int vt=ls.indexOf(kh);
				ls.set(vt, kh);
				return true;
			}
			
		}
		return false;
	}
	// tinh tong tung loai khach
	public void tinhTongKhach() {
		int dem = 0;
		for (KhachHang customer : ls) {
		    if (customer instanceof KhachHangNuocNgoai) {
		        dem++;
		    }
		}
		System.out.println("So khach nuoc ngoai: "+ dem);
		System.out.println("So khach Viet Nam: "+ (ls.size()-dem));
	}
	// Xuất các hoá đơn trong tháng 9 năm 2018
	public void xuatHoaDon() {
        System.out.println("Danh sách hoá đơn trong tháng 9 năm 2018:");
        for (KhachHang customer : ls) {
            Calendar date = customer.getNgayLapHD();
            if (date.get(Calendar.YEAR) == 2018 && date.get(Calendar.MONTH) == 9) {
                System.out.println(customer.toString() +"\n");
            }
        }
        
	}
}
