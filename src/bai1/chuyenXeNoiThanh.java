package bai1;

public class chuyenXeNoiThanh extends chuyenXe{
	private int soTuyen;
	private int km;
	private double doanhThu;
	public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	public chuyenXeNoiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public chuyenXeNoiThanh(String maSoChuyen, String hoTen, int soXe) {
		super(maSoChuyen, hoTen,soXe);
		// TODO Auto-generated constructor stub
	}
	public chuyenXeNoiThanh(String maSoChuyen, String hoTen, int soXe, int soTuyen, int km, double doanhThu) {
		super(maSoChuyen, hoTen,soXe);
		this.soTuyen = soTuyen;
		this.km = km;
		this.doanhThu = doanhThu;
	}
	
	@Override
	 public double tinhDoanhThu() {
        return getKm() * 500000;
    }
	@Override
	public String toString() {
		String s="";
		s+=String.format("%10d|%10d|", getSoTuyen(), getKm());
		return super.toString()+s;
	}
	
	
}
