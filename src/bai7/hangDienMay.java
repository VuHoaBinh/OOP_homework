package bai7;

public class hangDienMay extends hangHoa {
	private int thoiGianBaoHanh; // thời gian bảo hành (tháng)
    private int congSuat; // công suất (KW)
	public int getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}
	public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	public int getCongSuat() {
		return congSuat;
	}
	public void setCongSuat(int congSuat) {
		this.congSuat = congSuat;
	}
	public hangDienMay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public hangDienMay(String maHang, String tenHang, double donGia, int soLuongTon) {
		super(maHang, tenHang, donGia, soLuongTon);
		// TODO Auto-generated constructor stub
	}
	public hangDienMay(String maHang, String tenHang, double donGia, int soLuongTon, int thoiGianBaoHanh,
			int congSuat) {
		super(maHang, tenHang, donGia, soLuongTon);
		this.thoiGianBaoHanh = thoiGianBaoHanh;
		this.congSuat = congSuat;
	}

    public double tinhTienVAT() {
        return getDonGia() * 0.1;
    }
    
    @Override
    public String toString() {
    	String s= "";
    	s+=String.format("|%10d|%10d|%10f|", getThoiGianBaoHanh(), getCongSuat(), tinhTienVAT());
    	return super.toString()+s;
    }
}
