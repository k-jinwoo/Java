package ch05;

/*
 * 날짜 : 2021/05/18
 * 이름 : 김진우
 * 내용 : Gugu2
 */
public class P98 {
	public static void main(String[] args) {
		for(int j=2; j<10; j++) {
			System.out.println("["+j+"단]");
			for(int i=1; i<10; i++) {
				System.out.println(j + " * " + i + " = " + j*i);
			}
		}
	}
}
