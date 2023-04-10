package bai4;

import java.util.Calendar;

public class giaoDichNha extends giaoDich {
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
	
	

	public giaoDichNha(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiNha, String diaChi) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	public giaoDichNha() {
		super();
		// TODO Auto-generated constructor stub
	}
	public giaoDichNha(String maGD, Calendar ngayGD, double donGia, double dienTich) {
		super(maGD, ngayGD, donGia, dienTich);
		// TODO Auto-generated constructor stub
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
