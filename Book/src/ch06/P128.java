package ch06;

/*
 * 날짜 : 2021/05/20
 * 이름 : 김진우
 * 내용 : ArrEx17
 */
public class P128 {
	public static void main(String[] args) {
		// 배열 선언
		String[] names = {"홍길동","이순신","김유신"};
		int[] scores = {90,80,100};
		int i = 0; // 인덱스 변수
		for(String name : names) {
			System.out.println(name + " : " + scores[i]);
			i++;
		}
	}
}
