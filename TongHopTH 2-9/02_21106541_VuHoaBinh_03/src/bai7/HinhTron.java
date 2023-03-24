package bai7;

public class HinhTron {
	public ToaDo tam;
	private double bankinh;
	
	// package
	public ToaDo getTam() {
		return tam;
	}
	public void setTam(ToaDo tam) {
		this.tam = tam;
	}
	public double getBankinh() {
		return bankinh;
	}
	public void setBankinh(double bankinh) throws Exception {
		if (bankinh>0) {
			this.bankinh = bankinh;
		} else {
			throw new Exception("ban kinh lon hon 0");
		}
	}
	
	// contructor
	public HinhTron() {
	}
	public HinhTron(String ten, float x, float y, ToaDo tam, double bankinh) throws Exception {
		super();
		this.tam = tam;
		if (bankinh >0) {
			this.bankinh = bankinh;
		} else {
			throw new Exception("ban kinh lon hon 0");
		}
		
	}
	
	// Chu Vi
	public double tinhChuVi() {
		return (getBankinh()*2*3.14);
	}
	
	// Dien Tich
	public double tinhDienTich() {
		return (getBankinh()*getBankinh()*3.14);
	}
	
	//tieu de
	public static String getTieuDe() {
		return String.format("%-15s        %-10s     %-15s %-15s","tam", "Ban Kinh", "Chu Vi", "Dien Tich");
	}
	
	//toString
	@Override
	public String toString() {
		return String.format("%-15s  %-15f%-15f%-15f", tam ,bankinh, tinhChuVi(), tinhDienTich());
	}
}
