package sub6;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��¥ : 2021/05/18
 * �̸� : ������
 * ���� : �ڹ� Date Ŭ���� �ǽ��ϱ�
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
