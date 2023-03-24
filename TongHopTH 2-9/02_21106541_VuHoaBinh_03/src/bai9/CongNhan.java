package bai9;

public class CongNhan {
	private String maCN;
	private String mHo;
	private String mTen;
	private double mSoSP;
	
	// package
	public String getMaCN() {
		return maCN;
	}
	public void setMaCN(String maCN) throws Exception {
		if(maCN!=null) {
			this.maCN = maCN;			
		}else throw new Exception("Loi ma cong nhan!");
	}
	public String getmHo() {
		return mHo;
	}
	public void setmHo(String mHo) throws Exception {
		if(mHo!=null) {
			this.mHo = mHo;		
		}else throw new Exception("Loi nhap su lieu ho!");
		
	}
	public String getmTen() {
		return mTen;
	}
	public void setmTen(String mTen) throws Exception {
		if(mTen!=null) {
			this.mTen = mTen;			
		}else throw new Exception("Loinhap su lieu ten!");
		
	}
	public double getmSoSP() {
		return mSoSP;
	}
	public void setmSoSP(double mSoSP) throws Exception {
		if(mSoSP>0) {
			this.mSoSP = mSoSP;		
		}else throw new Exception("Loi ma so pham!");
	}
	
	
	// contructor
	public CongNhan() {
		// TODO Auto-generated constructor stub
	}
	
	public CongNhan(String maCN, String mHo, String mTen, double mSoSP) {
		this.maCN = maCN;
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}
	
	// tinhLuong
	public double tinhLuong() {
		if(this.getmSoSP() > 1 && this.getmSoSP()<=199) {
			return this.getmSoSP()*0.5;
		}else if(this.getmSoSP() >=200 && this.getmSoSP()<=399) {
			return this.getmSoSP()*0.55;
		}else if(this.getmSoSP() >=400 && this.getmSoSP()<=599) {
			return this.getmSoSP()*0.6;
		}else
			return this.getmSoSP()*0.65;
	}
	
	// tieu de
	public static String getTieuDe() {
		return String.format("|%-15s|%-10s|%-15s|%-15s|%-15s|","MA CN", "HO", "TEN", "SO SP", "LUONG");
	}
	// toString
	@Override
	public String toString() {
		return String.format("|%-15s|%-10s|%-15s|%-15s|%-15f|", getMaCN(), getmHo(), getmTen(), getmSoSP(), tinhLuong());
	}
}
