package study01.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		// DateתString
		Date date = new Date();
		// ��ʽת��
		// �꣨year��:yyyy>2019  yy>19
		// �£�month��:MM>09  M>9
		// �գ�day��:dd>08  d>8
		// ʱ��hour��:HH(24Сʱ����)>����8��:08������3��:15 H:���Ჹ0
		// hh(12Сʱ����) h:12Сʱ�Ʋ���0
		// ���ӣ�minute��mm:������ m:����0
		// �루second��ss:���� s:����0
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd��MM��yyyy��");
		// ͨ��format������date����ת����String����
		String dateStr = sdf.format(date);
		System.out.println(dateStr);
	}

}
