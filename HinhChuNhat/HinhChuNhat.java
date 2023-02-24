// 02_21106541_VuHoaBinh
package HinhChuNhat;

import java.util.Scanner;

public class HinhChuNhat {
		public double chieuDai;
		public double chieuRong;
		
		// package
		public void setChieuDai(double cd) throws Exception {
			if (cd>0) {
				this.chieuDai = cd;
			} else throw new Exception("chieu dai lon hon khong!");
			
		}
		public double getChieuDai() {
			return this.chieuDai;
		}
		public void setChieuRong(double cd) throws Exception {
			if (cd>0 && cd<this.chieuDai) {
				this.chieuRong = cd;
			} else throw new Exception("chieu rong lon hon 0 vs nho hon chieu dai!");
			
		}
		public double getChieuRong() {
			return this.chieuRong;
		}
		
		// create contructor
		public HinhChuNhat() {
			
		}
		public HinhChuNhat(double cd, double cr) {
			this.chieuDai = cd;
			this.chieuRong = cr;
			
		}
		
		// Chu vi
		public double getChuVi() {
			return (getChieuDai()+getChieuRong())*2;
		}
		
		// Dien tich
			public double getDienTich() {
				return (getChieuDai()*getChieuRong());
			}
		public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			HinhChuNhat hcn = new HinhChuNhat();
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap chieu dai: ");
			int cd = sc.nextInt();
			System.out.println("nhap chieu rong: ");
			int cr = sc.nextInt();
			
			hcn.setChieuDai(cd);
			hcn.setChieuRong(cr);
			
			System.out.println("Chu Vi: " + hcn.getChuVi());
			System.out.println("Dien Tich: " + hcn.getDienTich());
		}
}

