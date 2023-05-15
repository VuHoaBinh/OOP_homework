package GiaoDichDat;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Objects;

public abstract class GiaoDich {
	protected String ID;
	protected Calendar date;
	protected double price;
	protected double area;
	protected abstract double tinhThanhTien();
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public GiaoDich() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiaoDich(String iD, Calendar date, double price, double area) {
		super();
		ID = iD;
		this.date = date;
		this.price = price;
		this.area = area;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ID);
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
		return Objects.equals(ID, other.ID);
	}
	Locale lc = new Locale("vi","VN");
	NumberFormat ds = NumberFormat.getInstance(lc);
	NumberFormat dt = NumberFormat.getCurrencyInstance(lc);
	DateFormat nf = DateFormat.getDateInstance(1, lc);
	
	@Override
	public String toString() {
		String s = "";
		s+=String.format("|%10s|%10s|%10s|%10s|", getID(),nf.format(getDate().getTime()),dt.format(getPrice()),getArea());
		return s;
	}
}
