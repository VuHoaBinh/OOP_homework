package bai8;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class CD {
	private String maCD;
	private String tuaCD;
	private Calendar ngayPH;
	private double donGia;
	private int soBH;

	public String getMaCD() {
		return maCD;
	}

	public void setMaCD(String ma) throws Exception {
		if (ma != null) {
			this.maCD = ma;
		} else
			throw new Exception("loi ma CD!!");
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tua) throws Exception {
		if (tua != null) {
			this.tuaCD = tua;
		} else
			throw new Exception("loi tua CD!!");
	}

	public Calendar getNgayPH() {
		return ngayPH;
	}

	public void setNgayPH(Calendar ngay) throws Exception {
		if (ngay != null) {
			this.ngayPH = ngay;
		} else
			throw new Exception("loi ngay CD!!");
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) throws Exception {
		if (donGia > 0) {
			this.donGia = donGia;
		} else
			throw new Exception("loi don gia CD!!");
	}

	public double getSoBH() {
		return soBH;
	}

	public void setSoBH(int so) throws Exception {
		if (so > 0) {
			this.soBH = so;
		} else
			throw new Exception("loi so CD!!");
	}

	// constructor
	public CD() {
		Calendar ngay = Calendar.getInstance();
		this.maCD = "00000000";
		this.tuaCD = "xxxxxxxx";
		this.ngayPH = ngay;
		this.donGia = 0;
		this.soBH = 10000;
	}

	public CD(String ma, String tua, Calendar ngay, double donGia, int so) throws Exception {
//		if (ma!=null) {
//			this.maCD = ma;			
//		}else throw new Exception("loi ma CD!!");
//		
//		if (tua!=null) {
//			this.tuaCD = tua;			
//		}else throw new Exception("loi tua CD!!");
//		
//		if (ngay!=null) {
//			this.ngayPH = ngay;		
//		}else throw new Exception("loi ngay CD!!");
//		
//		if (donGia>0) {
//			this.donGia = donGia;	
//		}else throw new Exception("loi don gia CD!!");
//		
//		if (so>0) {
//			this.soBH = so;	
//		}else throw new Exception("loi so CD!!");
		setMaCD(ma);
		setTuaCD(tua);
		setNgayPH(ngay);
		setDonGia(donGia);
		setSoBH(so);

	}

	// create getThanhTien()
	public double getThanhTien() {
		return getDonGia() * getSoBH();
	}

	// tieu de
	public void inTieuDe() {
		for (int i = 0; i < 67; i++) {
			System.out.printf("-");
		}
		System.out.println();
		System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|", "MaCD", "TuaCD", "Don Gia", "Ngay", "SoBH",
				"Tong tien");
		System.out.println();
	}


	@Override
	public String toString() {
		String s = "";
		Locale lc = new Locale("vi", "VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
		DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) nf).getDecimalFormatSymbols();
		decimalFormatSymbols.setCurrencySymbol("đ");
		((DecimalFormat) nf).setDecimalFormatSymbols(decimalFormatSymbols);
		
		
		
		
		String formattedDate = new SimpleDateFormat("yyyy-MM-dd").format(ngayPH.getTime());
		for (int i = 0; i < 67; i++) {
			System.out.printf("-");
		}
		s += s.format("\n|%-10s|%-10s|%-10s|%-10s|%-10s|%-10s|", maCD, tuaCD, donGia, formattedDate, soBH, nf.format(getThanhTien()).trim());

//		for (int i = 0; i < 70; i++) {
//			System.out.printf("-");
//		}
		return s;
	}
}
