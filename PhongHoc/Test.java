package PhongHoc;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ListPhongHoc ls = new ListPhongHoc();
		boolean flag = false;
		menu();
		while (true) {
			System.out.println("Chon Menu:");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					PhongHocLop p1 = new PhongLyThuyet("LAB1",2,123,70,79);
					PhongHocLop p2 = new PhongMayTinh("LAB2",4,345,74,76);
					PhongHocLop p3 = new PhongThiNghiem("LAB3",12,43,14,"Binh",23,4);
					ls.add(p1);
					ls.add(p2);
					ls.add(p3);
					System.out.println("Nhap thanh cong!!");
					break;
				case 2:
					System.out.print("Nhap so luong Giao Dich: ");
			        int n = sc.nextInt();
			        for (int i = 0; i < n; i++) {
			        	System.out.println("Phong hoc thu " + (i + 1) + " la:");
						System.out.println("Ban nhan\n so 1: Phong ly thuyet \n so 2: Phong may tinh \n so 3: Phong thuc hanh");
						int a = sc.nextInt();
						if(a == 1) {
							try {
								System.out.println("Nhap ID:");
								sc.nextLine();
							    String ID = sc.nextLine();// string
						        System.out.print("Nhập day nha: ");
						        int price = sc.nextInt();
						        System.out.print("Nhập dien tich: ");
						        double area = sc.nextDouble();
						        System.out.print("Nhập so bong den: ");
						        int den = sc.nextInt();
						        System.out.print("Nhập so may chieu: ");
						        int mayChieu = sc.nextInt();
							    ls.add(new PhongLyThuyet(ID, price,area, den,mayChieu));
							}catch (Exception e) {
								System.out.println(e.getMessage());
							}
							System.out.println("Nhap thanh cong!!");
						}else if(a==2) {
							try {
								System.out.println("Nhap ID:");
								sc.nextLine();
							    String ID = sc.nextLine();// string
						        System.out.print("Nhập day nha: ");
						        int price = sc.nextInt();
						        System.out.print("Nhập dien tich: ");
						        double area = sc.nextDouble();
						        System.out.print("Nhập so bong den: ");
						        int den = sc.nextInt();
						        System.out.print("Nhập so may tinh: ");
						        int mayTinh = sc.nextInt();
							    ls.add(new PhongMayTinh(ID, price,area, den,mayTinh));
							}catch (Exception e) {
								System.out.println(e.getMessage());
							}
							System.out.println("Nhap thanh cong!!");
						}else {
							try {
								System.out.println("Nhap ID:");
								sc.nextLine();
							    String ID = sc.nextLine();// string
						        System.out.print("Nhập day nha: ");
						        int price = sc.nextInt();
						        System.out.print("Nhập dien tich: ");
						        double area = sc.nextDouble();
						        System.out.print("Nhập so bong den: ");
						        int den = sc.nextInt();

						        System.out.println("Nhap chuyen nganh:");
								sc.nextLine();
							    String chuyenNganh = sc.nextLine();
							    System.out.print("Nhập so suc chua: ");
						        int sucChua = sc.nextInt();
						        System.out.print("Nhập so bon rua: ");
						        int bonRua = sc.nextInt();
							    ls.add(new PhongThiNghiem(ID, price,area, den ,chuyenNganh,sucChua,bonRua));
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
				    ls.timKiemTheoMaPhong(ID_find);
					break;
				case 5:
					System.out.println("Ban nhan\n so 1: Phong ly thuyet \n so 2: Phong may tinh \n so 3: Phong thuc hanh");
					int a = sc.nextInt();
					if(a == 1) {
						try {
							System.out.println("Nhap ID:");
							sc.nextLine();
						    String ID = sc.nextLine();// string
					        System.out.print("Nhập day nha: ");
					        int price = sc.nextInt();
					        System.out.print("Nhập dien tich: ");
					        double area = sc.nextDouble();
					        System.out.print("Nhập so bong den: ");
					        int den = sc.nextInt();
					        System.out.print("Nhập so may chieu: ");
					        int mayChieu = sc.nextInt();
						    ls.add(new PhongLyThuyet(ID, price,area, den,mayChieu));
						}catch (Exception e) {
							System.out.println(e.getMessage());
						}
						System.out.println("Nhap thanh cong!!");
					}else if(a==2) {
						try {
							System.out.println("Nhap ID:");
							sc.nextLine();
						    String ID = sc.nextLine();// string
					        System.out.print("Nhập day nha: ");
					        int price = sc.nextInt();
					        System.out.print("Nhập dien tich: ");
					        double area = sc.nextDouble();
					        System.out.print("Nhập so bong den: ");
					        int den = sc.nextInt();
					        System.out.print("Nhập so may tinh: ");
					        int mayTinh = sc.nextInt();
						    ls.add(new PhongMayTinh(ID, price,area, den,mayTinh));
						}catch (Exception e) {
							System.out.println(e.getMessage());
						}
						System.out.println("Nhap thanh cong!!");
					}else {
						try {
							System.out.println("Nhap ID:");
							sc.nextLine();
						    String ID = sc.nextLine();// string
					        System.out.print("Nhập day nha: ");
					        int price = sc.nextInt();
					        System.out.print("Nhập dien tich: ");
					        double area = sc.nextDouble();
					        System.out.print("Nhập so bong den: ");
					        int den = sc.nextInt();

					        System.out.println("Nhap chuyen nganh:");
							sc.nextLine();
						    String chuyenNganh = sc.nextLine();
						    System.out.print("Nhập so suc chua: ");
					        int sucChua = sc.nextInt();
					        System.out.print("Nhập so bon rua: ");
					        int bonRua = sc.nextInt();
						    ls.add(new PhongThiNghiem(ID, price,area, den ,chuyenNganh,sucChua,bonRua));
						}catch (Exception e) {
							System.out.println(e.getMessage());
						}
						System.out.println("Nhap thanh cong!!");
					}
					break;
				case 6:
					ls.timKiemThongTinDatChuan();
					break;
				case 7:
					System.out.println("Nhap ID Phong:");
					sc.nextLine();
				    String ID_delete = sc.nextLine();
				    boolean check = ls.xoaGD(ID_delete);
				    if(check) {
				    	System.out.println("Xoa thanh cong");
				    }else {
				    	System.out.println("Xoa that bai");
				    }
					break;
					
				case 8:
					ls.sapXepTheoMaPhong();
					break;
					
				case 9:
					ls.sapXepTheoDienTich();
					break;
				case 10:
					ls.sapXepTheoBongDen();
					break;
				case 11:
					System.out.println("Nhap ID can cap nhat:");
					sc.nextLine();
				    String ID_update = sc.nextLine();
				    System.out.println("Nhap ma phong:");
				    sc.nextLine();
				    String loai = sc.nextLine();
				    boolean test = ls.capNhat(ID_update,loai);
				    if(test) {
				    	System.out.println("Cap nhat thanh cong");
				    }else {
				    	System.out.println("Cap nhat that bai");
				    }
					break;
				case 12:
					ls.tongTungLoai();
					break;
				case 13:
					ls.xuatThongTin60May();
					break;
				case 14:
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
		System.out.println("6. Xuat thong tin dat chuan");
		System.out.println("7. Xoa thong tin");
		System.out.println("8. Sap xep tang dan theo day nha");
		System.out.println("9. Sap xep giam dan dien tich");
		System.out.println("10. Sap xep tang dan so bong den");
		System.out.println("11. Cap nhat thong tin theo ma phong.");
		System.out.println("12. Tong so phong hoc.");
		System.out.println("13. Xuat danh sach phong hoc co 60 may.");
		System.out.println("14. Thoat.");
	}

}
