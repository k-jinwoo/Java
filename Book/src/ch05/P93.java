package ch05;

/*
 * 날짜 : 2021/05/18
 * 이름 : 김진우
 * 내용 : WhileEx
 */
public class P93 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("합계 : "+sum);
	}
}
