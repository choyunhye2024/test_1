package Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	// 이것이자바다 p.534
	public static void main(String[] args) {

		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");

		String strNow = sdf.format(now);

		System.out.println(strNow);

		System.out.println(now);

	}
}
