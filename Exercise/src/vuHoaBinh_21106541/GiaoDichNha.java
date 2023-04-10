package vuHoaBinh_21106541;

import java.util.Calendar;

public class GiaoDichNha extends GiaoDich {
	private String loaiNha;
	private String diaChi;
	
	
	
	//package
	public String getLoaiNha() {
		return loaiNha;
	}
	public void setLoaiNha(String loaiNha) throws Exception {
		if(loaiNha != null) {
			this.loaiNha = loaiNha;			
		}else throw new Exception("laoi nha rong!!");
	}
	
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) throws Exception {
		if(diaChi !=null) {
			this.diaChi = diaChi;			
		}else throw new Exception("dia chi rong!!");
	}
	
	//contructor
	public GiaoDichNha() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiaoDichNha(String maGD, Calendar ngayGD, double donGia, double dienTich) {
		super(maGD, ngayGD, donGia, dienTich);
		// TODO Auto-generated constructor stub
	}


	public GiaoDichNha(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiNha, String diaChi) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}


	@Override
	public double getThanhTien() {
		if(getLoaiNha() =="cao cap") {
			return getDienTich()*getDonGia();
		}else
			return getDienTich()*getDonGia()*0.9;
	}
	
	@Override
	public String toString() {
		String s="";
		s+=String.format("%10s|%10s|%10s|", getLoaiNha() , getDiaChi() , getThanhTien());
		return super.toString()+s;
	}
	
	
}
