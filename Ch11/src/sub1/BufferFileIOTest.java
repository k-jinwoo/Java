package sub1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * ��¥ : 2021/05/27
 * �̸� : ������
 * ���� : �ڹ� ���� ����� ��Ʈ�� �ǽ�
 */
public class BufferFileIOTest {
	public static void main(String[] args) {
		String path1 = "C:\\Users\\bigdate\\Desktop\\sample.jpg";
		String path2 = "C:\\Users\\bigdate\\Desktop\\sample2.jpg";
		
		// ���ϰ� �Է½�Ʈ�� ����
		try {
			FileInputStream fis = new FileInputStream(path1);
			FileOutputStream fos = new FileOutputStream(path2);
			
			// ���۽�Ʈ�� ����
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path1));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path2));
			
			int value = 0;
			
			while(true) {
				//��Ʈ������ ���� ������ �б�
				value = bis.read();
				
				if(value == -1) {
					// �� �̻� ���� �����Ͱ� ���� �� ����
					break;
				}
				//char ch = (char)value; - FileInputStream
				//System.out.print(ch);
				bos.write(value);		// FileOutputStream
			} // while end
			//��Ʈ�� ����
			bis.close();
			bos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("\n���α׷� ����...");
	} // main end
}
