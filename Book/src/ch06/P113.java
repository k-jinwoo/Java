package ch06;

/*
 * 날짜 : 2021/05/20
 * 이름 : 김진우
 * 내용 : ArrEx8
 */
public class P113 {
	public static void main(String[] args) {
		int[] number = new int[100];
		
		// 배열 변수에 대입
		for(int i=0; i<number.length; i++) {
			number[i] = i+1;
		}
		// 배열 변수 출력
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
	}
}
