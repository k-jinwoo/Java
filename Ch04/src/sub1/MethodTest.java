package sub1;

/*
 * ��¥ : 2021/05/20
 * �̸� : ������
 * ���� : �ڹ� �޼���(�Լ�) �ǽ��ϱ�
 */
public class MethodTest {
	// main method : �ڹ� ���α׷��� ������
	public static void main(String[] args) {
		// �޼��� ȣ��
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 : "+y1);
		System.out.println("y2 : "+y2);
		System.out.println("y3 : "+y3);
		
		//sum �޼��� ȣ��
		System.out.println("1���� 10���� �� : "+sum(1, 10));
		System.out.println("1���� 100���� �� : "+sum(1, 100));
		System.out.println("1���� 1000���� �� : "+sum(1, 1000));
		System.out.println("1���� 10000���� �� : "+sum(1, 10000));
		
	}// main method end
	
	// �޼��� ���� : �Ϸ��� �ڵ������ ���ȭ ��Ų ��
	public static int f(int x) {
		int y = 2 * x + 3;
		return y;
	}
	
	public static int sum(int start, int end) {
		int sum = 0;
		for(int k=start; k<=end; k++) {
			sum += k;
		}
		return sum;
	}
}