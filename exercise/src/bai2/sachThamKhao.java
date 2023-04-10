package bai2;

public class sachThamKhao extends nhaSach{
	protected double thue;

	public double getThue() {
		return thue;
	}

	public void setThue(double thue) {
		this.thue = thue;
	}

	public sachThamKhao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public sachThamKhao(String maSach, String ngay, double donGia, int soLuong, String nhaSanXuat) {
		super(maSach, ngay, donGia, soLuong, nhaSanXuat);
		// TODO Auto-generated constructor stub
	}

	public sachThamKhao(String maSach, String ngay, double donGia, int soLuong, String nhaSanXuat, double thue) {
		super(maSach, ngay, donGia, soLuong, nhaSanXuat);
		this.thue = thue;
	}
	
	public double tinhThanhTien() {
        return getSoLuong() * getDonGia() + getThue();
    }
	
	@Override
	public String toString() {
		String s= "";
		s+= String.format("%10f|%10f|", getThue(), tinhThanhTien());
		return super.toString()+s;
	}
}
