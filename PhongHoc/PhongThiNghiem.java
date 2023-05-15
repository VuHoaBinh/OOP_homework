package PhongHoc;

public class PhongThiNghiem extends PhongHocLop{
	private String chuyenGia;
	private int sucChua;
	private int bonRua;
	public String getChuyenGia() {
		return chuyenGia;
	}
	public void setChuyenGia(String chuyenGia) {
		this.chuyenGia = chuyenGia;
	}
	public int getSucChua() {
		return sucChua;
	}
	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}
	public int getBonRua() {
		return bonRua;
	}
	public void setBonRua(int bonRua) {
		this.bonRua = bonRua;
	}
	public PhongThiNghiem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhongThiNghiem(String maPhong, int dayNha, double dienTich, int bongDen) {
		super(maPhong, dayNha, dienTich, bongDen);
		// TODO Auto-generated constructor stub
	}
	public PhongThiNghiem(String maPhong, int dayNha, double dienTich, int bongDen, String chuyenGia, int sucChua,
			int bonRua) {
		super(maPhong, dayNha, dienTich, bongDen);
		this.chuyenGia = chuyenGia;
		this.sucChua = sucChua;
		this.bonRua = bonRua;
	}
	public String tieuChuan() {
		if(getDienTich()/10<=getBongDen() && getBonRua()>0) {
			String a = "Dat tieu chuan";
			return a;
		}else {
			String a = "Khong dat tieu chuan";
			return a;
		}
	}
	@Override
	public String toString() {
		String s="";
		s+=String.format("|%10s|%10d|%10d|%10s|", getChuyenGia(),getSucChua(),getBonRua(), tieuChuan());
		return super.toString()+s;
	}
}
