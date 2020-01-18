package study01.demo;

import java.util.Date;

public class Demo3 {

	public static void main(String[] args) {
		// 时间戳
		Date date = new Date();
		// 1970年1月1号0时0分0秒到现在总共过了多少毫秒
		long time = date.getTime();
		System.out.println(time);
		// 通过时间戳newDate
		Date date2 = new Date(1573698043448l);
		System.out.println(date2);
	}

}
