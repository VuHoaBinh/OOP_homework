package bai2TH;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class ConstructorCD1 {
	private String maCD;
	private String tuaCD;
	private Calendar ngayPH;
	private double donGia;
	private double soBH;
	
//	package
	public String getMaCD() {
		return maCD;
	}
	public void setMaCD(String ma) throws Exception {
		if (ma!=null) {
			this.maCD = ma;			
		}else throw new Exception("loi ma CD!!");
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tua) throws Exception {
		if (tua!=null) {
			this.tuaCD = tua;			
		}else throw new Exception("loi tua CD!!");
	}
	public Calendar getNgayPH() {
		return ngayPH;
	}
	public void setNgayPH(Calendar ngay) throws Exception {
		if (ngay!=null) {
			this.ngayPH = ngay;		
		}else throw new Exception("loi ngay CD!!");
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) throws Exception {
		if (donGia>0) {
			this.donGia = donGia;	
		}else throw new Exception("loi don gia CD!!");
	}
	public double getSoBH() {
		return soBH;
	}
	public void setSoBH(int so) throws Exception {
		if (so>0) {
			this.soBH = so;	
		}else throw new Exception("loi so CD!!");
	}
	
	// constructor
	public ConstructorCD1() {
		Calendar ngay = Calendar.getInstance();
		this.maCD = "00000000";
		this.tuaCD = "xxxxxxxx";
		this.ngayPH = ngay;
		this.donGia = 0;
		this.soBH = 10000;
	}
	public ConstructorCD1(String ma, String tua, Calendar ngay, double donGia, int so) throws Exception {
		if (ma!=null) {
			this.maCD = ma;			
		}else throw new Exception("loi ma CD!!");
		
		if (tua!=null) {
			this.tuaCD = tua;			
		}else throw new Exception("loi tua CD!!");
		
		if (ngay!=null) {
			this.ngayPH = ngay;		
		}else throw new Exception("loi ngay CD!!");
		
		if (donGia>0) {
			this.donGia = donGia;	
		}else throw new Exception("loi don gia CD!!");
		
		if (so>0) {
			this.soBH = so;	
		}else throw new Exception("loi so CD!!");
	}
	
	//create getThanhTien()
	public double getThanhTien() {
		return getDonGia() *getSoBH();
	}
	
	// tieu de
	public void inTieuDe() {
		for(int i =0;i<70;i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|", "MaCD", "TuaCD", "Don Gia", "Ngay","SoBH","Tong tien");
		System.out.println();
		for(int i =0;i<70;i++) {
			System.out.printf("-");
		}
		System.out.println();
	}
	Locale lc = new Locale("vi","VN");
	DateFormat df = DateFormat.getDateInstance(3,lc);
	NumberFormat  sf = NumberFormat.getCurrencyInstance(lc);
	
	@SuppressWarnings({ "static-access", "resource" })
	@Override
	public String toString() {
		String s="";
		Scanner sc =new Scanner(System.in);
		System.out.println("nhap ngay:");
		String dateNgay = sc.nextLine();

//		s+=s.format("|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|", getMaCD(), getTuaCD(),
//				getDonGia(), df.format(getNgayPH().getTime()),
//				sf.format(getDonGia()), getSoBH(), sf.format(getThanhTien()));
		s+=s.format("\n|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|", getMaCD(), getTuaCD(),
				getDonGia(), dateNgay,sf.format(getDonGia()), getSoBH(), sf.format(getThanhTien()));
		
		for(int i =0;i<70;i++) {
			System.out.printf("-");
		}
		return s;
	}
	
}
