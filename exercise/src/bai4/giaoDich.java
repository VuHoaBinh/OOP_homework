package bai4;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;


public class giaoDich {
	protected String maGD;
	protected Calendar ngayGD;
	protected double donGia, dienTich;
	public double getThanhTien() {
		return 0;
	}
	
	public giaoDich() {
		super();
		// TODO Auto-generated constructor stub
	}

	public giaoDich(String maGD, Calendar ngayGD, double donGia, double dienTich) {
		super();
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}


	public String getMaGD() {
		return maGD;
	}


	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}

	public Calendar getNgayGD() {
		return ngayGD;
	}

	public void setNgayGD(Calendar ngayGD) {
		this.ngayGD = ngayGD;
	}


	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public double getDienTich() {
		return dienTich;
	}

	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}


	Locale lc = new Locale("vi","VN");
	NumberFormat ds = NumberFormat.getInstance(lc);
	NumberFormat dt = NumberFormat.getCurrencyInstance(lc);
	DateFormat nf = DateFormat.getDateInstance(1, lc);

	@Override
	public String toString() {
		String s= "";
		s+=String.format("|%10s|%10s|%10s|%10s|", getMaGD(), nf.format(getNgayGD().getTime()), dt.format(getDonGia()), getDienTich());
		return s;
		
	}
}
