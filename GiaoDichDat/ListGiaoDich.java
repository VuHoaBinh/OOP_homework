package GiaoDichDat;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class ListGiaoDich {
	List<GiaoDich>ls;
	public ListGiaoDich() {
		ls =new ArrayList<GiaoDich>(6);
	}
	public List<GiaoDich> getAllKH(){
		return ls;
	}
	// add 
	public boolean add(GiaoDich gd) {
		if (!ls.contains(gd)) {
			return ls.add(gd);
		} else {
			return false;
		}
	}
	// print
	 public void print(){
		int n = ls.size();
		if(n<=0) {
			System.out.println("Du lieu chua co!!");
		}else {
			for(GiaoDich gd : ls){
				System.out.println(gd.toString() + "\n");
			}			
		}
    }
	// find id
	public void timKiemTheoMaGiaoDich(String ID){
        for(GiaoDich gd : ls){
            if(gd.getID().equalsIgnoreCase(ID)){
                System.out.println(gd.toString() + "\n");
            }
        }
    }
	//delete
	public boolean xoaGD(String ID_delete) {
		for (GiaoDich gd : ls) {
			if (gd.getID().equalsIgnoreCase(ID_delete)) {
				ls.remove(gd);
				return true;
			}
		}
		return false;
	}
	// sort id
	 public void sapXepTheoMaID() {
        int n = ls.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ls.get(i).getID().compareTo(ls.get(j).getID()) > 0) {
                	GiaoDich temp = ls.get(i);
                    ls.set(i, ls.get(j));
                    ls.set(j, temp);
                }
            }
         }
      }
		 
	// update
	public boolean capNhat(String maGD ,double Loai) {
		for (GiaoDich gd : ls) {
			if (gd.getID().equalsIgnoreCase(maGD)) {
				int vt=ls.indexOf(gd);
				((GiaoDich) gd).setPrice(Loai);
				ls.set(vt, gd);
				return true;
			}
		}
		return false;
	}
	 // Tính tổng số lượng cho từng loại.
	 public void tongTungLoai() {
		double NhaDat = 0;
		double NhaO = 0;
		for(GiaoDich gd: ls) {
			if(gd instanceof GiaoDichNhaDat) {
				NhaDat++;
			}else {
				NhaO++;
			}
		}
		System.out.printf("\ntien nha dat: ");
		System.out.println(NhaDat);
		System.out.printf("\ntien nha o: \n", NhaO);
		System.out.println(NhaO);
	 }
	//Tính trung bình thành tiền của giao dịch đất.
	 public void trungBinhNhaDat() {
		 int n=0;
		 double tienNhaDat = 0;
		 for(GiaoDich gd:ls) {
			 if(gd instanceof GiaoDichNhaDat) {
				 n++;
				 tienNhaDat+=gd.tinhThanhTien();
			 }
		 }
		 System.out.println(tienNhaDat/n);
	 }
	// Xuất ra các giao dịch của tháng 9 năm 2013.
	 public void xuatThongTin2013() {
		 System.out.println("Danh sách hoá đơn trong tháng 9 năm 2013:");
	        for (GiaoDich customer : ls) {
	            Calendar date = customer.getDate();
	            if (date.get(Calendar.YEAR) == 2013 && date.get(Calendar.MONTH) == 9) {
	                System.out.println(customer.toString() +"\n");
	            }
	        }
	 }
}
