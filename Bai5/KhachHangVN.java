package Bai5;

import java.util.Calendar;

public class KhachHangVN extends KhachHang{
	private String doiTuongKH;
    private double dinhMuc;
	public String getDoiTuongKH() {
		return doiTuongKH;
	}
	public void setDoiTuongKH(String doiTuongKH) {
		this.doiTuongKH = doiTuongKH;
	}
	public double getDinhMuc() {
		return dinhMuc;
	}
	public void setDinhMuc(double dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	public KhachHangVN() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KhachHangVN(String maKH, String hoTen, Calendar ngayLapHD, int soKW, double donGia) {
		super(maKH, hoTen, ngayLapHD, soKW, donGia);
		// TODO Auto-generated constructor stub
	}
	public KhachHangVN(String maKH, String hoTen, Calendar ngayLapHD, int soKW, double donGia, String doiTuongKH,
			double dinhMuc) {
		super(maKH, hoTen, ngayLapHD, soKW, donGia);
		this.doiTuongKH = doiTuongKH;
		this.dinhMuc = dinhMuc;
	}
	public double tinhThanhTien() {
        double thanhTien;
        if (getSoKW() <= getDinhMuc()) {
            thanhTien = getSoKW() * getDonGia();
        } else {
            thanhTien = getDinhMuc() * getDonGia() + (getSoKW() - getDinhMuc()) * getDonGia() * 2.5;
        }
        return thanhTien;
    }

	@Override
	public String toString() {
		String s= "";
		s+=String.format("|%10s|%10f|%10f|\n", 
				getDoiTuongKH(), getDinhMuc(), tinhThanhTien());
		return super.toString()+s;
		
	}
}
