package bai3;

public class giaoDichTienTe extends giaoDich{
	 private double tiGia;
	 private String loaiTienTe;
	public double getTiGia() {
		return tiGia;
	}
	public void setTiGia(double tiGia) {
		this.tiGia = tiGia;
	}
	public String getLoaiTienTe() {
		return loaiTienTe;
	}
	public void setLoaiTienTe(String loaiTienTe) {
		this.loaiTienTe = loaiTienTe;
	}
	public giaoDichTienTe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public giaoDichTienTe(String maGD, String ngayGD, double donGia, int soLuong) {
		super(maGD, ngayGD, donGia, soLuong);
		// TODO Auto-generated constructor stub
	}
	public giaoDichTienTe(String maGD, String ngayGD, double donGia, int soLuong, double tiGia, String loaiTienTe) {
		super(maGD, ngayGD, donGia, soLuong);
		this.tiGia = tiGia;
		this.loaiTienTe = loaiTienTe;
	}

	@Override
    public double tinhThanhTien() {
        if (getLoaiTienTe().equals("VN")) {
            return getSoLuong() * getDonGia();
        } else {
            return getSoLuong() * getDonGia() * getTiGia();
        }
    }
	@Override
	public String toString() {
		String s= "";
		s+=String.format("|%10f|%10s|%10f|", getTiGia(), getLoaiTienTe(),tinhThanhTien());
		return super.toString()+s;
	}
	
	
	
}
