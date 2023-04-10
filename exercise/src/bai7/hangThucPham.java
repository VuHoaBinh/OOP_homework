package bai7;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class hangThucPham extends hangHoa{
	protected String nhaCungCap;
    protected Calendar ngaySanXuat;
    protected Calendar ngayHetHan;
	public String getNhaCungCap() {
		return nhaCungCap;
	}
	public void setNhaCungCap(String nhaCungCap) {
		this.nhaCungCap = nhaCungCap;
	}
	public Calendar getNgaySanXuat() {
		return ngaySanXuat;
	}
	public void setNgaySanXuat(Calendar ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}
	public Calendar getNgayHetHan() {
		return ngayHetHan;
	}
	public void setNgayHetHan(Calendar ngayHetHan) {
		this.ngayHetHan = ngayHetHan;
	}
	public hangThucPham() {
		super();
		// TODO Auto-generated constructor stub
	}
	public hangThucPham(String maHang, String tenHang, double donGia, int soLuongTon) {
		super(maHang, tenHang, donGia, soLuongTon);
		// TODO Auto-generated constructor stub
	}
	public hangThucPham(String maHang, String tenHang, double donGia, int soLuongTon, String nhaCungCap,
			Calendar ngaySanXuat, Calendar ngayHetHan) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaCungCap = nhaCungCap;
		this.ngaySanXuat = ngaySanXuat;
		this.ngayHetHan = ngayHetHan;
	}
	public double tinhVAT() {
        return getDonGia() * 0.05;
    }
	
    public String danhGia() {
        if (getSoLuongTon() <= 0) {
            return "Hết hàng";
        } else if (Calendar.getInstance().after(ngayHetHan)) {
            return "Khó bán";
        } else {
            return "Bán được";
        }
    }
	Locale lc = new Locale("vi","VN");
	NumberFormat ds = NumberFormat.getInstance(lc);
	NumberFormat dt = NumberFormat.getCurrencyInstance(lc);
	DateFormat nf = DateFormat.getDateInstance(1, lc);
	
    @Override
    public String toString() {
    	String s= "";
    	s+=String.format("|%10s|%10s|%10s|%10d|", getNhaCungCap(), nf.format(getNgaySanXuat().getTime()),nf.format(getNgayHetHan().getTime()),tinhVAT());
    	return super.toString()+s;
    }
	
}
