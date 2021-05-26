package sub6;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 날짜 : 2021/05/18
 * 이름 : 김진우
 * 내용 : 자바 Date 클래스 실습하기
 */
public class DateTest {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date : "+date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:nmm:ss");
		String now = sdf.format(date);
		
		System.out.println("now : "+now);
	}
}
