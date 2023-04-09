package bai1;

import java.util.Objects;

public class chuyenXe {
	protected String maSoChuyen;
	protected String hoTen;
	protected int soXe;
	protected int doanhThu;
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(maSoChuyen);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		chuyenXe other = (chuyenXe) obj;
		return Objects.equals(maSoChuyen, other.maSoChuyen);
	}



	public chuyenXe(String maSoChuyen, String hoTen, int soXe) {
		super();
		this.maSoChuyen = maSoChuyen;
		this.hoTen = hoTen;
		this.soXe = soXe;
	}



	public chuyenXe() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getMaSoChuyen() {
		return maSoChuyen;
	}



	public void setMaSoChuyen(String maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}



	public String getHoTen() {
		return hoTen;
	}



	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}



	public int getSoXe() {
		return soXe;
	}



	public void setSoXe(int soXe) {
		this.soXe = soXe;
	}


	 public double tinhDoanhThu() {
		return this.doanhThu;
	 }
	@Override
	public String toString() {
		String s = "";
		s+=String.format("|%10s|%10s|%10d|%10f|", getMaSoChuyen(), getHoTen(),getSoXe(),tinhDoanhThu());
		return s;
	}
}
