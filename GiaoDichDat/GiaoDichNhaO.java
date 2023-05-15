package GiaoDichDat;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class GiaoDichNhaO extends GiaoDich{
	private String loaiNha;
	private String diaChi;
	public String getLoaiNha() {
		return loaiNha;
	}
	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public GiaoDichNhaO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiaoDichNhaO(String iD, Calendar date, double price, double area) {
		super(iD, date, price, area);
		// TODO Auto-generated constructor stub
	}
	public GiaoDichNhaO(String iD, Calendar date, double price, double area, String loaiNha, String diaChi) {
		super(iD, date, price, area);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	public double tinhThanhTien() {
		if(getLoaiNha().equalsIgnoreCase("Cao cap")) {
			return getArea() * getPrice();
		}else
			return getArea() * getPrice() * 0.9;
	}
	Locale lc = new Locale("vi","VN");
	NumberFormat ds = NumberFormat.getInstance(lc);
	NumberFormat dt = NumberFormat.getCurrencyInstance(lc);
	DateFormat nf = DateFormat.getDateInstance(1, lc);
	@Override
	public String toString() {
		String s= "";
		s+=String.format("|%10s|%10s|%10s|", getLoaiNha() , getDiaChi(),dt.format(tinhThanhTien()));
		return super.toString()+s;
	}
}
