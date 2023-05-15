package GiaoDichDat;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class GiaoDichNhaDat extends GiaoDich {
	private String loaiDat;

	public String getLoaiDat() {
		return loaiDat;
	}

	public void setLoaiDat(String loaiDat) {
		this.loaiDat = loaiDat;
	}

	public GiaoDichNhaDat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichNhaDat(String iD, Calendar date, double price, double area) {
		super(iD, date, price, area);
		// TODO Auto-generated constructor stub
	}

	public GiaoDichNhaDat(String iD, Calendar date, double price, double area, String loaiDat) {
		super(iD, date, price, area);
		this.loaiDat = loaiDat;
	}
	
	public double tinhThanhTien() {
		if (getLoaiDat().equalsIgnoreCase("A")) {
			return getArea() * getPrice() *1.5;
		}else
			return getArea()* getPrice();
	}
	Locale lc = new Locale("vi","VN");
	NumberFormat ds = NumberFormat.getInstance(lc);
	NumberFormat dt = NumberFormat.getCurrencyInstance(lc);
	DateFormat nf = DateFormat.getDateInstance(1, lc);
	@Override
	public String toString() {
		String s = "";
		s+=String.format("|%10s|%10s|", getLoaiDat(), dt.format(tinhThanhTien()));
		return super.toString() +s;
	}	
	
}
