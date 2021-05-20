package ch06;

/*
 * 날짜 : 2021/05/20
 * 이름 : 김진우
 * 내용 : ArrEx13
 */
public class P124 {
	public static void main(String[] args) {
		// 원본 배열
		int[] arrInt = {1,2,3};
		
		// 복사할 배열
		int[] arrInt2 = new int[5];
		
		//복사할 배열에 값 대입
		for(int i=0; i<arrInt.length; i++) {
			arrInt2[i] = arrInt[i];
		}
		// 배열 값 출력
		for (int i=0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}
}
