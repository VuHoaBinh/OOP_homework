package PhongHoc;

import java.util.Objects;

public abstract class PhongHocLop {
	protected String maPhong;
	protected int dayNha;
	protected double dienTich;
	protected int bongDen;
	public abstract String tieuChuan();
	public String getMaPhong() {
		return maPhong;
	}
	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}
	public int getDayNha() {
		return dayNha;
	}
	public void setDayNha(int dayNha) {
		this.dayNha = dayNha;
	}
	public double getDienTich() {
		return dienTich;
	}
	public void setDienTich(double dienTich) {
		this.dienTich = dienTich;
	}
	public int getBongDen() {
		return bongDen;
	}
	public void setBongDen(int bongDen) {
		this.bongDen = bongDen;
	}
	public PhongHocLop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhongHocLop(String maPhong, int dayNha, double dienTich, int bongDen) {
		super();
		this.maPhong = maPhong;
		this.dayNha = dayNha;
		this.dienTich = dienTich;
		this.bongDen = bongDen;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maPhong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhongHocLop other = (PhongHocLop) obj;
		return Objects.equals(maPhong, other.maPhong);
	}
	@Override
	public String toString() {
		String s="";
		s+=String.format("|%10s|%10d|%10f|%10d|", getMaPhong(), getDayNha(), getDienTich(), getBongDen());
		return s;
	}
}
