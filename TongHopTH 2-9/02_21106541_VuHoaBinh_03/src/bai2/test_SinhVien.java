package bai2;

import java.util.Scanner;

public class test_SinhVien {

	private static Scanner sc;

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("11111", "Nguyen Thanh An", 6.50, 8.50);
		SinhVien sv2 = new SinhVien("22222", "Le Thi Bong", 7.50, 8.00);
		sc = new Scanner(System.in);
		System.out.println("nhap ma so cua sinh vien sv3:");
		String maSV =sc.nextLine();
		System.out.println("nhap ho ten cua sinh vien sv3:");
		String hoTen =sc.nextLine();
		System.out.println("nhap diem ly thuyet cua sinh vien sv3:");
		double diemLT =sc.nextDouble();
		System.out.println("nhap diem thuc hanh cua sinh vien sv3:");
		double diemTH =sc.nextDouble();
		SinhVien sv3 = new SinhVien(maSV, hoTen, diemLT, diemTH);
		
		System.out.println(SinhVien.getTieuDe());
		System.out.println(sv1.toString());
		System.out.println(sv2.toString());
		System.out.println(sv3.toString());
	}

}
