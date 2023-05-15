package PhongHoc;

import java.util.ArrayList;
import java.util.List;

public class ListPhongHoc {
	List<PhongHocLop>ls;
	public ListPhongHoc() {
		ls =new ArrayList<PhongHocLop>(10);
	}
	public List<PhongHocLop> getAllKH(){
		return ls;
	}
	// add 
	public boolean add(PhongHocLop ph) {
		if (!ls.contains(ph)) {
			return ls.add(ph);
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
			for(PhongHocLop ph : ls){
				System.out.println(ph.toString() + "\n");
			}			
		}
    }
	// find id
	public void timKiemTheoMaPhong(String ID){
        for(PhongHocLop gd : ls){
            if(gd.getMaPhong().equalsIgnoreCase(ID)){
                System.out.println(gd.toString() + "\n");
            }
        }
    }
	// find dat chuan
	public void timKiemThongTinDatChuan(){
		String ID =  "Dat tieu chuan";
        for(PhongHocLop gd : ls){
            if(gd.tieuChuan().equalsIgnoreCase(ID)){
                System.out.println(gd.toString() + "\n");
            }
        }
    }
	//delete
	public boolean xoaGD(String ID_delete) {
		for (PhongHocLop gd : ls) {
			if (gd.getMaPhong().equalsIgnoreCase(ID_delete)) {
				ls.remove(gd);
				return true;
			}
		}
		return false;
	}
	// Tang id
	 public void sapXepTheoMaPhong() {
        int n = ls.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ls.get(i).getMaPhong().compareTo(ls.get(j).getMaPhong()) > 0) {
                	PhongHocLop temp = ls.get(i);
                    ls.set(i, ls.get(j));
                    ls.set(j, temp);
                }
            }
         }
      }
	 // Giam dien tich
	 public void sapXepTheoDienTich() {
        int n = ls.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ls.get(i).getDienTich() > ls.get(j).getDienTich()) {
                	PhongHocLop temp = ls.get(i);
                    ls.set(i, ls.get(j));
                    ls.set(j, temp);
                }
            }
         }
      }
	// tang bong den
	 public void sapXepTheoBongDen() {
        int n = ls.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ls.get(i).getBongDen() < ls.get(j).getBongDen()) {
                	PhongHocLop temp = ls.get(i);
                    ls.set(i, ls.get(j));
                    ls.set(j, temp);
                }
            }
         }
      }
	// update
	public boolean capNhat(String maGD ,String maPhong) {
		for (PhongHocLop gd : ls) {
			if (gd.getMaPhong().equalsIgnoreCase(maGD)) {
				int vt=ls.indexOf(gd);
				((PhongHocLop) gd).setMaPhong(maPhong);
				ls.set(vt, gd);
				return true;
			}
		}
		return false;
	}
	// Tính tổng số lượng 
	 public void tongTungLoai() {
		int n = ls.size();
		System.out.printf("\nTong so luong phong: \n");
		System.out.println(n);
	 }
	// xuat thong tin 60 may
	public void xuatThongTin60May() {
        for(PhongHocLop gd : ls){
    		if(gd instanceof PhongMayTinh && ((PhongMayTinh)(gd)).getMayTinh()>60) {
    			System.out.println(gd.toString() + "\n");        			
    		}
    		if(gd instanceof PhongLyThuyet && ((PhongLyThuyet)(gd)).getMayChieu()>60) {
    			System.out.println(gd.toString() + "\n");        			
    		}
    		System.out.println("loi");   
        }
	}
}
