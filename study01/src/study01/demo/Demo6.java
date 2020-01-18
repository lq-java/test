package study01.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo6 {

	public static void main(String[] args) {
		String str = "2019-10-14 11:34:56";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date date = sdf.parse(str);
			Date now = new Date();
			long time1=date.getTime();
			long time2=now.getTime();
			// 从开始时间到现在过的毫秒数
			long time3 = time2-time1;
			int day = (int)(time3/(1000*60*60*24));
			System.out.println("总共过了"+day+"天");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
