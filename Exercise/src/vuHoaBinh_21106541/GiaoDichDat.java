package vuHoaBinh_21106541;

import java.util.Calendar;

public class GiaoDichDat extends GiaoDich {
	private String loaiDat;

	//package
	public String getLoaiDat() {
		return loaiDat;
	}
	public void setLoaiDat(String loaiDat) throws Exception {
		if(loaiDat != null) {
			this.loaiDat = loaiDat;			
		}else throw new Exception("loai dat rong!!");
	}
	
	//constructor
	public GiaoDichDat(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiDat) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiDat = loaiDat;
	}

	public GiaoDichDat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDichDat(String maGD, Calendar ngayGD, double donGia, double dienTich) {
		super(maGD, ngayGD, donGia, dienTich);
		// TODO Auto-generated constructor stub
	}


	@Override
	public double getThanhTien() {
		if(getLoaiDat() == "B" || getLoaiDat() == "C") {
			return getDienTich()*getDonGia();
		}else
			return getDienTich() * getDonGia() * 1.5;
	}
	
	@Override
	public String toString() {
		String s = "";
		s+=String.format("%10s|%15s|", getLoaiDat(), getThanhTien());
		return super.toString()+s;
	}
	
	
}
