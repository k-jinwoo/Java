package ch05;

/*
 * 날짜 : 2021/05/18
 * 이름 : 김진우
 * 내용 : IfEx3
 */
public class P85 {
	public static void main(String[] args) {
		int math = 90;
		int eng = 95;
		if (math >= 60) {
			if (eng >= 60) {
				System.out.println("통과");
			}
		}else {
			System.out.println("탈락");
		}
	}
}
