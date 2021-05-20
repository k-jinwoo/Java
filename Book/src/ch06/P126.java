package ch06;

import java.util.Arrays;

/*
 * 날짜 : 2021/05/20
 * 이름 : 김진우
 * 내용 : ArrEx15
 */
public class P126 {
	public static void main(String[] args) {
		// 원본 배열
		int[] arrInt = {1,2,3};
		
		// 복사할 배열
		int[] arrInt2 = null;
		arrInt2 = Arrays.copyOf(arrInt, 5);
		
		// 배열 값 출력
		for(int i=0; i<arrInt2.length; i++) {
			System.out.println(arrInt2[i]);
		}
	}
}
