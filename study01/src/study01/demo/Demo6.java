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
			// �ӿ�ʼʱ�䵽���ڹ��ĺ�����
			long time3 = time2-time1;
			int day = (int)(time3/(1000*60*60*24));
			System.out.println("�ܹ�����"+day+"��");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
