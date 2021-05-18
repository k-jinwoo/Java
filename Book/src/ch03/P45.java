package ch03;

/*
 * 날짜 : 2021/05/17
 * 이름 : 김진우
 * 내용 : ScopeEx
 */
public class P45 { // 클래스 블럭
	int no; // 클래스 블럭 내에서 사용 가능한 변수
	public static void main(String[] args) { // main 메서드 블럭
		String name;
		
		if(true) {
			name = "홍길동";
			String email = "hong@test.com";
		}
		// if문 블럭 밖에서 email 변수를 사용하면 에러 발생
		// email = "hong@test.com";
	}
}
