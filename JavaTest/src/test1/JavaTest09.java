package test1;

/*
 * 날짜 : 2021/05/20
 * 이름 : 김진우
 * 내용 : 자바 Test9 실습하기
 */
public class JavaTest09 {
	public static void main(String[] args) {
		int count = 0;
		for(int i=1; i<=9; i++) {
			if(i <= 5) {
				count++;
			}else {
				count--;
			}
			for(int j=1; j<=5-count; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=2*count-1; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
