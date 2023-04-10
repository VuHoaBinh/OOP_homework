package bai5;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class khachHang {
	 protected String maKH, hoTen;
    protected Calendar ngayLapHD;
    protected int soKW;
    protected double donGia;
    
    public double tinhThanhTien() {
		return 0;
	}

	public String getMaKH() {
		return maKH;
	}

	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Calendar getNgayLapHD() {
		return ngayLapHD;
	}

	public void setNgayLapHD(Calendar ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}

	public int getSoKW() {
		return soKW;
	}

	public void setSoKW(int soKW) {
		this.soKW = soKW;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public khachHang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public khachHang(String maKH, String hoTen, Calendar ngayLapHD, int soKW, double donGia) {
		super();
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngayLapHD = ngayLapHD;
		this.soKW = soKW;
		this.donGia = donGia;
	}
    
	Locale lc = new Locale("vi","VN");
	NumberFormat ds = NumberFormat.getInstance(lc);
	NumberFormat dt = NumberFormat.getCurrencyInstance(lc);
	DateFormat nf = DateFormat.getDateInstance(1, lc);
	
	@Override
	public String toString() {
		String s= "";
		s+=String.format("|%10s|%10s|%10s|%10s|%10s|", 
				getMaKH(),getHoTen(), nf.format(getNgayLapHD().getTime()) ,getSoKW(), dt.format(getDonGia()));
		return s;
		
	}
}
