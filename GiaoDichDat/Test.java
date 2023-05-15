package GiaoDichDat;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListGiaoDich ls = new ListGiaoDich();
		boolean flag = false;
		menu();
		while (true) {
			System.out.println("Chon Menu:");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					GiaoDich gd1 = new GiaoDichNhaDat("123", new GregorianCalendar(2013, 4, 10), 100,100, "A");
					GiaoDich gd2 = new GiaoDichNhaDat("456", new GregorianCalendar(2013, 9, 10), 234,100, "A");
					GiaoDich gd3 = new GiaoDichNhaDat("789", new GregorianCalendar(2020, 4, 10), 345,100, "A");
					GiaoDich gd4 = new GiaoDichNhaO("ABC", new GregorianCalendar(2013, 9, 10), 3452,100, "Cao cap","Da Nang");
					GiaoDich gd5 = new GiaoDichNhaO("DEF", new GregorianCalendar(2021, 4, 10), 34623,100, "Thuong","Ha Noi");
					GiaoDich gd6 = new GiaoDichNhaO("GHI", new GregorianCalendar(2022, 9, 10), 34623,100, "Cao cap","Ho Chi Minh");
					ls.add(gd1);
					ls.add(gd2);
					ls.add(gd3);
					ls.add(gd4);
					ls.add(gd5);
					ls.add(gd6);
					System.out.println("Nhap thanh cong!!");
					break;
				case 2:
					System.out.print("Nhap so luong Giao Dich: ");
			        int n = sc.nextInt();
			        for (int i = 0; i < n; i++) {
			        	System.out.println("Giao dich thu " + (i + 1) + " la:");
						System.out.println("Ban nhan\n so 1: chon nha dat \n so 2: chon nha o:");
						int a = sc.nextInt();
						if(a == 1) {
							try {
								System.out.println("Nhap ID nha dat:");
								sc.nextLine();
							    String ID = sc.nextLine();// string
							    System.out.print("Nhập ngày: ");
							    sc.nextLine();
						        int day = sc.nextInt();
						        System.out.print("Nhập tháng: ");
						        sc.nextLine();
						        int month = sc.nextInt();
						        System.out.print("Nhập năm: ");
						        sc.nextLine();
						        int year = sc.nextInt();
						        Calendar daytime = Calendar.getInstance();
						        daytime.set(Calendar.YEAR, year);
						        daytime.set(Calendar.MONTH, month - 1);
						        daytime.set(Calendar.DAY_OF_MONTH, day);
						        
						        System.out.print("Nhập Gia Ca: ");
						        double price = sc.nextDouble();
						        System.out.print("Nhập dien tich: ");
						        double area = sc.nextDouble();
						        System.out.println("Nhap loai nha:");
						        sc.nextLine();
							    String name = sc.nextLine();
							    ls.add(new GiaoDichNhaDat(ID, daytime, price, area, name));
							}catch (Exception e) {
								System.out.println(e.getMessage());
							}
							System.out.println("Nhap thanh cong!!");
						}else {
							try {
								System.out.println("Nhap ID nha o:");
								sc.nextLine();
							    String ID = sc.nextLine();// string
							    System.out.print("Nhập ngày: ");
							    sc.nextLine();
						        int day = sc.nextInt();
						        System.out.print("Nhập tháng: ");
						        sc.nextLine();
						        int month = sc.nextInt();
						        System.out.print("Nhập năm: ");
						        sc.nextLine();
						        int year = sc.nextInt();
						        Calendar daytime = Calendar.getInstance();
						        daytime.set(Calendar.YEAR, year);
						        daytime.set(Calendar.MONTH, month - 1);
						        daytime.set(Calendar.DAY_OF_MONTH, day);
						        
						        System.out.print("Nhập Gia Ca: ");
						        double price = sc.nextDouble();
						        System.out.print("Nhập dien tich: ");
						        double area = sc.nextDouble();
						        System.out.println("Nhap loai nha:");
						        sc.nextLine();
							    String name = sc.nextLine();
							    System.out.println("Nhap dia chi:");
							    sc.nextLine();
							    String address = sc.nextLine();
							    ls.add(new GiaoDichNhaO(ID, daytime, price, area, name, address));
							}catch (Exception e) {
								System.out.println(e.getMessage());
							}
							System.out.println("Nhap thanh cong!!");
						}
					}
					break;
				case 3:
					ls.print();
					break;
				case 4:
					System.out.println("Nhap ID can tim:");
					sc.nextLine();
				    String ID_find = sc.nextLine();
				    ls.timKiemTheoMaGiaoDich(ID_find);
					break;
				case 5:
					System.out.println("Ban nhan\n so 1: chon nha dat \n so 2: chon nha o:");
					int a = sc.nextInt();
					if(a == 1) {
						try {
							System.out.println("Nhap ID nha dat:");
							sc.nextLine();
						    String ID = sc.nextLine();// string
						    System.out.print("Nhập ngày: ");
						    sc.nextLine();
					        int day = sc.nextInt();
					        System.out.print("Nhập tháng: ");
					        sc.nextLine();
					        int month = sc.nextInt();
					        System.out.print("Nhập năm: ");
					        sc.nextLine();
					        int year = sc.nextInt();
					        Calendar daytime = Calendar.getInstance();
					        daytime.set(Calendar.YEAR, year);
					        daytime.set(Calendar.MONTH, month - 1);
					        daytime.set(Calendar.DAY_OF_MONTH, day);
					        
					        System.out.print("Nhập Gia Ca: ");
					        double price = sc.nextDouble();
					        System.out.print("Nhập dien tich: ");
					        double area = sc.nextDouble();
					        System.out.println("Nhap loai nha:");
					        sc.nextLine();
						    String name = sc.nextLine();
						    ls.add(new GiaoDichNhaDat(ID, daytime, price, area, name));
						}catch (Exception e) {
							System.out.println(e.getMessage());
						}
						System.out.println("Them thanh cong!!");
					}else {
						try {
							System.out.println("Nhap ID nha o:");
							sc.nextLine();
						    String ID = sc.nextLine();// string
						    System.out.print("Nhập ngày: ");
						    sc.nextLine();
					        int day = sc.nextInt();
					        System.out.print("Nhập tháng: ");
					        sc.nextLine();
					        int month = sc.nextInt();
					        System.out.print("Nhập năm: ");
					        sc.nextLine();
					        int year = sc.nextInt();
					        Calendar daytime = Calendar.getInstance();
					        daytime.set(Calendar.YEAR, year);
					        daytime.set(Calendar.MONTH, month - 1);
					        daytime.set(Calendar.DAY_OF_MONTH, day);
					        
					        System.out.print("Nhập Gia Ca: ");
					        double price = sc.nextDouble();
					        System.out.print("Nhập dien tich: ");
					        double area = sc.nextDouble();
					        String name = sc.nextLine();
					        System.out.println("Nhap loai nha:");
						    sc.nextLine();
						    System.out.println("Nhap dia chi:");
						    sc.nextLine();
						    String address = sc.nextLine();
						    ls.add(new GiaoDichNhaO(ID, daytime, price, area, name, address));
						}catch (Exception e) {
							System.out.println(e.getMessage());
						}
						System.out.println("Them thanh cong!!");
					}
					break;
				case 6:
					System.out.println("Nhap ID can xoa:");
					sc.nextLine();
				    String ID_delete = sc.nextLine();
				    boolean check = ls.xoaGD(ID_delete);
				    if(check) {
				    	System.out.println("Xoa thanh cong");
				    }else {
				    	System.out.println("Xoa that bai");
				    }
					break;
				case 7:
					ls.sapXepTheoMaID();
					break;
				case 8:
					System.out.println("Nhap ID can cap nhat:");
					sc.nextLine();
				    String ID_update = sc.nextLine();
				    System.out.println("Nhap ID can gia:");
				    double loai = sc.nextDouble();
				    boolean test = ls.capNhat(ID_update,loai);
				    if(test) {
				    	System.out.println("Cap nhat thanh cong");
				    }else {
				    	System.out.println("Cap nhat that bai");
				    }
					break;
				case 9:
					ls.tongTungLoai();
					break;
				case 10:
					ls.trungBinhNhaDat();
					break;
				case 11:
					ls.xuatThongTin2013();
					break;
				case 12:
					flag = true;
					break;
				default:
					System.out.println("Lam on nhap lai chuong trinh");
					break;
			}
			if(flag == true) {
				break;
			}else {
				menu();
			}
		}
		sc.close();
	}

	public static void menu() {
		System.out.println("==================== MENU ==================");
		System.out.println("1. Thong tin co san.");
		System.out.println("2. Nhap thong tin tu ban phim.");
		System.out.println("3. Xuat thong tin");
		System.out.println("4. Tim kiem theo ID");
		System.out.println("5. Them thong tin tu ban phim");
		System.out.println("6. Xoa thong tin");
		System.out.println("7. Sap xep thong tin");
		System.out.println("8. Cap nhat thong tin.");
		System.out.println("9. Tong tung loai.");
		System.out.println("10. Trung binh nha dat.");
		System.out.println("11. Xuat thong tin 2013.");
		System.out.println("12. Thoat.");
	}
}
