package bai3;

public class TamGiac {
	public double ma, mb, mc;

	// package
	public double getMa() {
		return ma;
	}

	public void setMa(double ma) throws Exception {
		if (ma > 0) {

		} else
			throw new Exception("phai lon hon 0");
		this.ma = ma;
	}

	public double getMb() {
		return mb;
	}

	public void setMb(double mb) throws Exception {
		if (mb > 0) {
			this.mb = mb;
		} else
			throw new Exception("phai lon hon 0");
	}

	public double getMc() {
		return mc;
	}

	public void setMc(double mc) throws Exception {
		if (mc > 0) {
			this.mc = mc;
		} else
			throw new Exception("phai lon hon 0");
	}

	// contructor
	public TamGiac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TamGiac(double ma, double mb, double mc) {
		super();
		this.ma = ma;
		this.mb = mb;
		this.mc = mc;
	}

	// tinh dien tich
	public double tinhDienTich() {
		double p = (ma + mb + mc) / 2;
		return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));
	}

	// tieu de
	public static String getTieuDe() {
		return String.format("|%-15s|%-15s|%-15s|%-15s|", "a", "b", "c", "dien tich");
	}

	// toString
	@Override
	public String toString() {
		String s = "";
		s += String.format("|%-15f|%-15f|%-15f|%-15f|", getMa(), getMb(), getMc(), tinhDienTich());
		return s;
	}
}
