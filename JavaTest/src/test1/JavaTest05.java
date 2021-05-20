package test1;

/*
 * 날짜 : 2021/05/20
 * 이름 : 김진우
 * 내용 : 자바 Test5 실습하기
 */
public class JavaTest05 {
	public static void main(String[] args) {
		int num = 0;
		int result;
		
		result = num++;
		System.out.println("result : "+result);
		result = ++num;
		System.out.println("result : "+result);
		result = num--;
		System.out.println("result : "+result);
		result = --num;
		System.out.println("result : "+result);
	}
}
