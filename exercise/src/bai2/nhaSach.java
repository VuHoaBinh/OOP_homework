package bai2;

import java.util.Objects;

public class nhaSach {
	protected String maSach;
	protected String ngay;
	protected double donGia;
	protected int soLuong;
	protected String nhaSanXuat;
	
	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getNgay() {
		return ngay;
	}

	public void setNgay(String ngay) {
		this.ngay = ngay;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public double thanhTien() {
		return 0;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public nhaSach(String maSach, String ngay, double donGia, int soLuong, String nhaSanXuat) {
		super();
		this.maSach = maSach;
		this.ngay = ngay;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.nhaSanXuat = nhaSanXuat;
	}

	public nhaSach() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(donGia, maSach, ngay, nhaSanXuat, soLuong);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		nhaSach other = (nhaSach) obj;
		return Double.doubleToLongBits(donGia) == Double.doubleToLongBits(other.donGia)
				&& Objects.equals(maSach, other.maSach) && Objects.equals(ngay, other.ngay)
				&& Objects.equals(nhaSanXuat, other.nhaSanXuat) && soLuong == other.soLuong;
	}

	@Override
	public String toString() {
		String s="";
		s+=String.format("|%10s|%10s|%10d|%10f|%10s|", getMaSach(), getNgay(),getDonGia(), getSoLuong(), getNhaSanXuat());
		return s;
	}
	
}
