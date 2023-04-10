package bai2;

public class sachGiaoKhoa extends nhaSach {
	protected String tinhTrang;

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public sachGiaoKhoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public sachGiaoKhoa(String maSach, String ngay,double donGia, int soLuong, String nhaSanXuat) {
		super(maSach, ngay,donGia,soLuong, nhaSanXuat);
		// TODO Auto-generated constructor stub
	}

	public sachGiaoKhoa(String maSach, String ngay, int soLuong,double donGia, String nhaSanXuat, String tinhTrang) {
		super(maSach, ngay, donGia,soLuong, nhaSanXuat);
		this.tinhTrang = tinhTrang;
	}
	
	public double tinhThanhTien() {
        if (getTinhTrang().equals("mới")) {
            return getSoLuong() * getDonGia();
        } else if (getTinhTrang().equals("cũ")) {
            return getSoLuong() * getDonGia() * 0.5;
        } else {
            return 0;
        }
    }
	
	@Override
	public String toString() {
		String s= "";
		s+= String.format("%10s|%10f|", getTinhTrang(), tinhThanhTien());
		return super.toString()+s;
	}
}
