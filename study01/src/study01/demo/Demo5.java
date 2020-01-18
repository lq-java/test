package study01.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo5 {

	public static void main(String[] args) {
		String str = "1992-05-09";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date birthday = sdf.parse(str);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(birthday);
			int year = calendar.get(Calendar.YEAR);
			calendar.set(Calendar.YEAR, year+10);
			birthday = calendar.getTime();
			String newDate = sdf.format(birthday);
			System.out.println(newDate);
			int i = calendar.get(Calendar.DAY_OF_WEEK);
			if(i==1) {
				System.out.println("ÐÇÆÚÈÕ");
			} else {
				System.out.println("ÐÇÆÚ"+(i-1));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
