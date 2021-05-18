package ch05;

/*
 * 날짜 : 2021/05/18
 * 이름 : 김진우
 * 내용 : ContinueEx
 */
public class P102 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
