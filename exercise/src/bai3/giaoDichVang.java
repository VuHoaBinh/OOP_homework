package bai3;

public class giaoDichVang extends giaoDich{
	private String loaiVang;

	public String getLoaiVang() {
		return loaiVang;
	}

	public void setLoaiVang(String loaiVang) {
		this.loaiVang = loaiVang;
	}

	public giaoDichVang() {
		super();
		// TODO Auto-generated constructor stub
	}

	public giaoDichVang(String maGD, String ngayGD, double donGia, int soLuong) {
		super(maGD, ngayGD, donGia, soLuong);
		// TODO Auto-generated constructor stub
	}

	public giaoDichVang(String maGD, String ngayGD, double donGia, int soLuong, String loaiVang) {
		super(maGD, ngayGD, donGia, soLuong);
		this.loaiVang = loaiVang;
	}
	@Override
    public double tinhThanhTien() {
        return getSoLuong() * getDonGia();
    }
	@Override
	public String toString() {
		String s= "";
		s+=String.format("|%10s|%10f|", getLoaiVang(), tinhThanhTien());
		return super.toString()+s;
	}
}
