package study01.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo4 {

	public static void main(String[] args) {
		//Date date = new Date();
		// ��������Ĭ���ǵ�ǰʱ��
		Calendar calendar = Calendar.getInstance();
		// ��date���õ�������
		//calendar.setTime(date);
		// ��ȡ��ǰʱ��7����Date���͵�����
		int day = calendar.get(Calendar.DATE);
		calendar.set(Calendar.DATE, day+7);
		// ����������ת��ΪDate����
		Date date2 = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s = sdf.format(date2);
		System.out.println(s);
		
	}

}
