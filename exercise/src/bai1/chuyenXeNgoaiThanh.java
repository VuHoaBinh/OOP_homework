package bai1;

public class chuyenXeNgoaiThanh extends chuyenXe{
	private String noiDen;
	private int ngay;
	private double doanhThu;
	public chuyenXeNgoaiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	public chuyenXeNgoaiThanh(String maSoChuyen, String hoTen, int soXe) {
		super(maSoChuyen, hoTen, soXe);
		// TODO Auto-generated constructor stub
	}
	public chuyenXeNgoaiThanh(String maSoChuyen, String hoTen, int soXe, String noiDen, int ngay, double doanhThu) {
		super(maSoChuyen, hoTen, soXe);
		this.noiDen = noiDen;
		this.ngay = ngay;
		this.doanhThu = doanhThu;
	}
	public String getNoiDen() {
		return noiDen;
	}
	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}
	public int getNgay() {
		return ngay;
	}
	public void setNgay(int ngay) {
		this.ngay = ngay;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	@Override
	public double tinhDoanhThu() {
        return getNgay() * 500000;
    }
	@Override
	public String toString() {
		String s="";
		s+=String.format("%10s|%10d|", getNoiDen(), getNgay());
		return super.toString()+s;
	}
	
	
	
}
