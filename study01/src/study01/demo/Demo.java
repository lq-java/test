package study01.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		// Date转String
		Date date = new Date();
		// 格式转换
		// 年（year）:yyyy>2019  yy>19
		// 月（month）:MM>09  M>9
		// 日（day）:dd>08  d>8
		// 时（hour）:HH(24小时进制)>早上8点:08，下午3点:15 H:不会补0
		// hh(12小时进制) h:12小时制不补0
		// 分钟（minute）mm:分钟数 m:不补0
		// 秒（second）ss:秒数 s:不补0
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd日MM月yyyy年");
		// 通过format方法将date类型转换成String类型
		String dateStr = sdf.format(date);
		System.out.println(dateStr);
	}

}
