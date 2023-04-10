package vuHoaBinh_21106541;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class test_GD {
	
	static Calendar convertStringToCalendar(String time, String formatTime)  {
		//todo check cac tham so truyen vao
		SimpleDateFormat format = new SimpleDateFormat(formatTime);
		Date date = null;
		try {
			date = format.parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		return calendar;
	}

	public static void main(String[] args) {
		ListGD<GiaoDich> ls = new ListGD<>();
		
		GiaoDichDat giaodichdat = new GiaoDichDat("GD001", convertStringToCalendar("01/01/2022", "dd/MM/yyyy"), 1000000, 200, "A");
		System.out.println(ls.size());
		ls.themGD(giaodichdat);
		System.out.println(ls.size());
//		ls.add(new GiaoDichDat("GD002", "02/01/2022", 2000000, "B", 150));
//		ls.add(new GiaoDichDat("GD003", "03/01/2022", 3000000, "C", 100));
//		ls.add(new GiaoDichNha("GD004", "04/01/2022", 5000000, "cao cấp", "123 Đường ABC", 300));
		System.out.println(ls.get(0));
	}

}
