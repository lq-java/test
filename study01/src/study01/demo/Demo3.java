package study01.demo;

import java.util.Date;

public class Demo3 {

	public static void main(String[] args) {
		// ʱ���
		Date date = new Date();
		// 1970��1��1��0ʱ0��0�뵽�����ܹ����˶��ٺ���
		long time = date.getTime();
		System.out.println(time);
		// ͨ��ʱ���newDate
		Date date2 = new Date(1573698043448l);
		System.out.println(date2);
	}

}
