package vuHoaBinh_21106541;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public abstract class GiaoDich {
	protected String maGD;
	protected Calendar ngayGD;
	protected double donGia, dienTich;
	public abstract double getThanhTien();
	
	//package
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String maGD) throws Exception {
		if(maGD != null) {
			this.maGD = maGD;			
		}else throw new Exception("ma giao dich rong!!");
	}
	public Calendar getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(Calendar ngayGD) throws Exception {
		if(ngayGD != null) {
			this.ngayGD = ngayGD;			
		}else throw new Exception("ngay giao dich rong!!");
		
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) throws Exception {
		if(donGia>0) {
			this.donGia = donGia;			
		}else throw new Exception("don gia lon hon 0!!");
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) throws Exception {
		if(dienTich>0) {
			this.dienTich = dienTich;			
		}else throw new Exception("dien tich lon hon 0!!");
		
	}
	
	// contructor
	public GiaoDich() {
		super();
	}
	public GiaoDich(String maGD, Calendar ngayGD, double donGia, double dienTich) {
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	
	
	//hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maGD == null) ? 0 : maGD.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiaoDich other = (GiaoDich) obj;
		if (maGD == null) {
			if (other.maGD != null)
				return false;
		} else if (!maGD.equals(other.maGD))
			return false;
		return true;
	}
	
	Locale lc = new Locale("vi","VN");
	NumberFormat ds = NumberFormat.getInstance(lc);
	NumberFormat dt = NumberFormat.getCurrencyInstance(lc);
	DateFormat nf = DateFormat.getDateInstance(1, lc);
	
	@Override
	public String toString() {
		String s= "";
		s+=String.format("|%10s|%10s|%10s|%10s|", 
				getMaGD(), nf.format(getNgayGD().getTime()) , dt.format(getDonGia()) , getDienTich());
		return s;
		
	}
	
	
	
}
