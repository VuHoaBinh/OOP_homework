package bai2;

public class SinhVien {
	public String maSinhVien;
	public String hoTen;
	public double diemLT,diemTH;

	
	//package
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) throws Exception {
		if(maSinhVien!=null) {
			this.maSinhVien = maSinhVien;			
		}else throw new Exception("loi ma sinh vien!!");
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) throws Exception {
		if(hoTen!=null) {
			this.hoTen = hoTen;
		}else throw new Exception("ho ten ko rong!!");
	}
	public double getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(double diemLT) throws Exception {
		if(diemLT>0) {
			this.diemLT = diemLT;
		}else throw new Exception("diem >0");
	}
	public double getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(double diemTH) throws Exception {
		if(diemTH>0) {
			this.diemTH = diemTH;		
		}else throw new Exception("diem >0!!");
		
	}
	
	
	// contructor
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SinhVien(String maSinhVien, String hoTen, double diemLT, double diemTH) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	
	// diem trung binh
	public double avg() {
		return (getDiemLT()+getDiemTH())/2;
	}
	
	
	// tieu de
	public static String getTieuDe() {
		return String.format("|%-15s|%-10s|%-15s|%-15s|%-15s|","MA SV", "HO TEN", "Diem LT", "Diem TH", "DIEM trung binh");
	}
	
	
	// toString
	@Override
	public String toString() {
		String s = "";
		s+=String.format("|%-15s|%-10s|%-15f|%-15f|%-15f|", getMaSinhVien(), getHoTen(), getDiemLT(), getDiemTH(), avg());
		return s;
	}
}
