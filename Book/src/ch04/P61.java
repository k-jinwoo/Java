package ch04;

/*
 * 날짜 : 2021/05/17
 * 이름 : 김진우
 * 내용 : OpEx5 
 */
public class P61 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		
		// AND 연산
		System.out.println(a > b && a == 10); // true
		System.out.println(a > b && a == b); // false
		
		// OR 연산
		System.out.println(a > b || a == b); // true
		System.out.println(a < b || a == b); // false
		
		// XOR 연산
		System.out.println(a > b ^ a == 10); // false
		System.out.println(a > b ^ a == b); // true
		
		// NOT 연산
		System.out.println(!(a > b)); // false
		System.out.println(!(a < b)); // false
	}
}
