package ch05;

/*
 * 날짜 : 2021/05/18
 * 이름 : 김진우
 * 내용 : DoWhileEx
 */
public class P94 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		}while (i<=100);
		System.out.println("합계 : "+sum);
	}
}
