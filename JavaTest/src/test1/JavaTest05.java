package test1;

/*
 * ��¥ : 2021/05/20
 * �̸� : ������
 * ���� : �ڹ� Test5 �ǽ��ϱ�
 */
public class JavaTest05 {
	public static void main(String[] args) {
		int num = 0;
		int result;
		
		result = num++;
		System.out.println("result : "+result);
		result = ++num;
		System.out.println("result : "+result);
		result = num--;
		System.out.println("result : "+result);
		result = --num;
		System.out.println("result : "+result);
	}
}
