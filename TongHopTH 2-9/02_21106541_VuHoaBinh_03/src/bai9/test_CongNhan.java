package bai9;

import java.util.Scanner;

public class test_CongNhan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DanhSachCongNhan ls= new DanhSachCongNhan(10);
//
//		CongNhan cn1 = new CongNhan("123","vu","binh",25);
//		CongNhan cn2 = new CongNhan("456","vu","binh",25);
//		CongNhan cn3 = new CongNhan("789","vu","binh",25);
//		CongNhan cn4 = new CongNhan("145","vu","binh",25);
//
//		ls.themCN(cn1);
//		ls.themCN(cn2);
//		ls.themCN(cn3);
//		ls.themCN(cn4);
		
//		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so luong phan tu: ");
		int n = sc.nextInt();
		DanhSachCongNhan ls= new DanhSachCongNhan(n);
		
		for (int i=0;i<n ;i++) {
			System.out.printf("Nhan vien %d: ", i+1);
			System.out.println("\nnhap ma cong nhan: ");
			String maCN = sc.nextLine();
			sc.next();
			System.out.println(maCN);
			System.out.println("nhap ho: ");
			String ho = sc.nextLine();
			sc.next();
			System.out.println(ho);
			System.out.println("nhap ten: ");
			String ten = sc.nextLine();
			sc.next();
			System.out.println(ten);
			System.out.println("nhap so san pham: ");
			double soSP = sc.nextDouble();
			System.out.println(soSP);
			ls.themCN(new CongNhan(maCN,ho,ten,soSP));
		}
		
		System.out.println(CongNhan.getTieuDe());
		for (int i = 0; i < ls.so_luong(); i++) {
			System.out.println(ls.getDanhSach()[i]);
		}
		
		System.out.println(ls.so_luong());
		
		ls.loc_200_products_of_employees();
		
		ls.sort_aNumberOfTheProducts();
		
		sc.close();
	}

}
