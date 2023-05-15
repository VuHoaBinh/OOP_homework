package PhongHoc;

public class PhongMayTinh extends PhongHocLop {
	private int mayTinh;

	public int getMayTinh() {
		return mayTinh;
	}

	public void setMayTinh(int mayTinh) {
		this.mayTinh = mayTinh;
	}

	public PhongMayTinh() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhongMayTinh(String maPhong, int dayNha, double dienTich, int bongDen) {
		super(maPhong, dayNha, dienTich, bongDen);
		// TODO Auto-generated constructor stub
	}

	public PhongMayTinh(String maPhong, int dayNha, double dienTich, int bongDen, int mayTinh) {
		super(maPhong, dayNha, dienTich, bongDen);
		this.mayTinh = mayTinh;
	}
	public String tieuChuan() {
		if(getDienTich()/10<=getBongDen() && getDienTich()/1.5<=getMayTinh()) {
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
		s+=String.format("|%10d|%10s|", getMayTinh(), tieuChuan());
		return super.toString()+s;
	}
	
}
