package ch05;

/*
 * ��¥ : 2021/05/18
 * �̸� : ������
 * ���� : BreakEx2
 */
public class P100 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==3) {
					break;
				}
				System.out.println("i="+i+", j="+j);
			}
		}
	}
}
