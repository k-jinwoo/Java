package ch05;

/*
 * ��¥ : 2021/05/18
 * �̸� : ������
 * ���� : BreakEx3
 */
public class P101 {
	public static void main(String[] args) {
		target:for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if(j==3) {
					break target;
				}
				System.out.println("i="+i+", j="+j);
			}
		}
	}
}
