package baitap;

import java.time.LocalDate;
public class bai7 {
	public static void main(String[] args) {
		try {
			HangThucPham h1 = new HangThucPham("001", "Gạo", 100000f, LocalDate.of(2018, 07, 10),
					LocalDate.of(2018, 07, 10));
			HangThucPham h2 = new HangThucPham("002", "Mì", 5000f, LocalDate.of(2018, 03, 01),
					LocalDate.of(2018, 9, 01));
			HangThucPham h3 = new HangThucPham("003", "Nước", 10000f, LocalDate.of(2017, 03, 01),
					LocalDate.of(2018, 03, 01));
			System.out.println(HangThucPham.getTieuDe());
			System.out.println(h1.toString());
			System.out.println(h2.toString());
			System.out.println(h3.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}


