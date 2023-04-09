package bai7;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class hangSanhSu extends hangHoa{
	private String nhaSanXuat;
    private Calendar ngayNhapKho;
	public String getNhaSanXuat() {
		return nhaSanXuat;
	}
	public void setNhaSanXuat(String nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}
	public Calendar getNgayNhapKho() {
		return ngayNhapKho;
	}
	public void setNgayNhapKho(Calendar ngayNhapKho) {
		this.ngayNhapKho = ngayNhapKho;
	}
	public hangSanhSu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public hangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon) {
		super(maHang, tenHang, donGia, soLuongTon);
		// TODO Auto-generated constructor stub
	}
	public hangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat,
			Calendar ngayNhapKho) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.nhaSanXuat = nhaSanXuat;
		this.ngayNhapKho = ngayNhapKho;
	}
	 public double tinhTienVAT() {
        return getDonGia() * getSoLuongTon() * 0.1;
    }
	 Locale lc = new Locale("vi","VN");
	 NumberFormat ds = NumberFormat.getInstance(lc);
	 NumberFormat dt = NumberFormat.getCurrencyInstance(lc);
	 DateFormat nf = DateFormat.getDateInstance(1, lc);
	 @Override
     public String toString() {
    	String s= "";
    	s+=String.format("|%10s|%10s|%10d|", getNhaSanXuat(), nf.format(getNgayNhapKho().getTime()),tinhTienVAT());
	    	return super.toString()+s;
	    }
}
