package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

/*
 * ��¥ : 2021/05/27
 * �̸� : ������
 * ���� : �ڹ� ������Ƽ ���� ����� �ǽ�
 */
public class PropertyTest {
	public static void main(String[] args) {
		String path = "C:\\Users\\bigdate\\Desktop\\city.properties";
		
		Properties props = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(path);
			
			
			props.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("101�� ���� : "+props.getProperty("101"));
		System.out.println("102�� ���� : "+props.getProperty("102"));
	}
}