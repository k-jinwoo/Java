package ch03;

/*
 * 날짜 : 2021/05/17
 * 이름 : 김진우
 * 내용 : CastingEx3 
 */
public class P48 {
	public static void main(String[] args) {
		// 강제형 변환 예시
		double score = 100; // double 자료형
		
		int score2 = (int)score; // 강제형 변환
		
		System.out.println(score2); // 값의 손실 발생하지 않음
	}
}
