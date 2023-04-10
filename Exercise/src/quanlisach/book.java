package quanlisach;

public class book {
	private String tenSach;
	private double giaBan;
	private int nmaXuatBan;
	private tacGia tacGiaSach;
	public book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public book(String tenSach, double giaBan, int nmaXuatBan, tacGia tacGiaSach) {
		super();
		this.tenSach = tenSach;
		this.giaBan = giaBan;
		this.nmaXuatBan = nmaXuatBan;
		this.tacGiaSach = tacGiaSach;
	}
	public String getTenSach() {
		return tenSach;
	}
	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getNmaXuatBan() {
		return nmaXuatBan;
	}
	public void setNmaXuatBan(int nmaXuatBan) {
		this.nmaXuatBan = nmaXuatBan;
	}
	public tacGia getTacGiaSach() {
		return tacGiaSach;
	}
	public void setTacGiaSach(tacGia tacGiaSach) {
		this.tacGiaSach = tacGiaSach;
	}
	
	public void inTenSach() {
		System.out.println(this.tenSach);
		System.out.println();
	}
	
	public boolean checkTheSameYearPublic(book b) {
		return this.nmaXuatBan == b.nmaXuatBan;
	}
}
