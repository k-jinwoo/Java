package sub1;

/*
 * 날짜 : 2021/05/24
 * 이름 : 김진우
 * 내용 : 자바 Class 실습하기
 */
public class ClassTest {
	public static void main(String[] args) {
		// 객체 생성
		Account kb = new Account("국민은행","123-1213-1234","김유신",10000);
		Account wr = new Account("우리은행","121-1010-1021","김춘추",30000);
		
		// 멤버 초기화
		// 캡슐화 적용으로 초기화 불가능
//		kb.bank = "국민은행";
//		kb.id = "123-1213-1234";
//		kb.name = "김유신";
//		kb.money = 10000;
//		
//		wr.bank = "우리은행";
//		wr.id = "121-1010-1021";
//		wr.name = "김춘추";
//		wr.money = 30000;
		
		// 객체 활용
		kb.deposit(40000);
		kb.withdraw(5000);
		// 캡슐화 적용으로 취약 코드 예방
//		kb.money++; // 취약 코드
		kb.show();
		
		wr.deposit(30000);
		wr.withdraw(7000);
//		wr.money -= 1; // 취약 코드
		wr.show();
	}
}
