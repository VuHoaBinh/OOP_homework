package bai3;

import java.util.Objects;

public class giaoDich {
	protected String maGD;
    protected String ngayGD;
    protected double donGia;
    protected int soLuong;
    public double tinhThanhTien() {
		return 0;
	}
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}
	public String getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(String ngayGD) {
		this.ngayGD = ngayGD;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public giaoDich() {
		super();
		// TODO Auto-generated constructor stub
	}
	public giaoDich(String maGD, String ngayGD, double donGia, int soLuong) {
		super();
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.soLuong = soLuong;
	}
	@Override
	public int hashCode() {
		return Objects.hash(donGia, maGD, ngayGD, soLuong);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		giaoDich other = (giaoDich) obj;
		return Double.doubleToLongBits(donGia) == Double.doubleToLongBits(other.donGia)
				&& Objects.equals(maGD, other.maGD) && Objects.equals(ngayGD, other.ngayGD) && soLuong == other.soLuong;
	}
    
	@Override
	public String toString() {
		String s="";
		s+=String.format("|%10s|%10s|%10f|%10d|", getMaGD(), getNgayGD(), getDonGia(), getSoLuong());
		return s;
	}
    
}
