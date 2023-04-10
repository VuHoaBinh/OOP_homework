package bai5;

import java.util.Calendar;

public class khachHangNuocNgoai extends khachHang{
	 private String quocTich;

	public String getQuocTich() {
		return quocTich;
	}

	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}

	public khachHangNuocNgoai() {
		super();
		// TODO Auto-generated constructor stub
	}

	public khachHangNuocNgoai(String maKH, String hoTen, Calendar ngayLapHD, int soKW, double donGia) {
		super(maKH, hoTen, ngayLapHD, soKW, donGia);
		// TODO Auto-generated constructor stub
	}

	public khachHangNuocNgoai(String maKH, String hoTen, Calendar ngayLapHD, int soKW, double donGia, String quocTich) {
		super(maKH, hoTen, ngayLapHD, soKW, donGia);
		this.quocTich = quocTich;
	}
	
	public double tinhThanhTien() {
        return getSoKW() * getDonGia();
    }
	
	@Override
	public String toString() {
		String s= "";
		s+=String.format("|%10s|%10f|", 
				getQuocTich() ,tinhThanhTien());
		return super.toString()+s;
		
	}
}
