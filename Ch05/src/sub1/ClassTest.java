package sub1;

/*
 * ��¥ : 2021/05/24
 * �̸� : ������
 * ���� : �ڹ� Class �ǽ��ϱ�
 */
public class ClassTest {
	public static void main(String[] args) {
		// ��ü ����
		Account kb = new Account("��������","123-1213-1234","������",10000);
		Account wr = new Account("�츮����","121-1010-1021","������",30000);
		
		// ��� �ʱ�ȭ
		// ĸ��ȭ �������� �ʱ�ȭ �Ұ���
//		kb.bank = "��������";
//		kb.id = "123-1213-1234";
//		kb.name = "������";
//		kb.money = 10000;
//		
//		wr.bank = "�츮����";
//		wr.id = "121-1010-1021";
//		wr.name = "������";
//		wr.money = 30000;
		
		// ��ü Ȱ��
		kb.deposit(40000);
		kb.withdraw(5000);
		// ĸ��ȭ �������� ��� �ڵ� ����
//		kb.money++; // ��� �ڵ�
		kb.show();
		
		wr.deposit(30000);
		wr.withdraw(7000);
//		wr.money -= 1; // ��� �ڵ�
		wr.show();
	}
}
