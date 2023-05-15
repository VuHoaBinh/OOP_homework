package PhongHoc;

public class PhongLyThuyet extends PhongHocLop {
	private int mayChieu;

	public int getMayChieu() {
		return mayChieu;
	}

	public void setMayChieu(int mayChieu) {
		this.mayChieu = mayChieu;
	}

	public PhongLyThuyet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhongLyThuyet(String maPhong, int dayNha, double dienTich, int bongDen) {
		super(maPhong, dayNha, dienTich, bongDen);
		// TODO Auto-generated constructor stub
	}

	public PhongLyThuyet(String maPhong, int dayNha, double dienTich, int bongDen, int mayChieu) {
		super(maPhong, dayNha, dienTich, bongDen);
		this.mayChieu = mayChieu;
	}
	public String tieuChuan() {
		if(getDienTich()/10>=getBongDen() && getMayChieu()>0) {
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
		s+=String.format("|%10d|%10s|", getMayChieu(), tieuChuan());
		return super.toString()+s;
	}
}
