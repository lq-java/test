package study01.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo4 {

	public static void main(String[] args) {
		//Date date = new Date();
		// 日历对象，默认是当前时间
		Calendar calendar = Calendar.getInstance();
		// 将date设置到日历中
		//calendar.setTime(date);
		// 获取当前时间7天后的Date类型的数据
		int day = calendar.get(Calendar.DATE);
		calendar.set(Calendar.DATE, day+7);
		// 将日历对象转换为Date对象
		Date date2 = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(date2);
		System.out.println(s);
		
	}

}
