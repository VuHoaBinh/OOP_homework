package bai8;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test_CD {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap ngay:");

			CD cd1 = new CD();
			cd1.setMaCD("1234");
			cd1.setTuaCD("ABC");
			cd1.setDonGia(1123);
			cd1.setSoBH(300);
			cd1.inTieuDe();
			
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.DAY_OF_MONTH, 10);
			
			
			
			cd1.setNgayPH(calendar);
			
			

			
			System.out.println(cd1);
			sc.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
