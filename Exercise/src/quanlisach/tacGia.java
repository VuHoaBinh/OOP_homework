package quanlisach;

public class tacGia {
	private String tenTacGia;
	private ngay ngaySinh;
	public tacGia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public tacGia(String tenTacGia, ngay ngaySinh) {
		super();
		this.tenTacGia = tenTacGia;
		this.ngaySinh = ngaySinh;
	}
	public String getTenTacGia() {
		return tenTacGia;
	}
	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}
	public ngay getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(ngay ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
}
