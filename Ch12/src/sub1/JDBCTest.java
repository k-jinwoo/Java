package sub1;

import java.sql.Connection; // Connection(java.util)
import java.sql.DriverManager;

/*
 * ��¥ : 2021/05/27
 * �̸� : ������
 * ���� : �ڹ� �����ͺ��̽� ���α׷��� �ǽ�
 */
public class JDBCTest {
	public static void main(String[] args) {
		// DB ����
		String host = "jdbc:mysql://192.168.10.114:3306/kim415272";
		String user = "kim415272";
		String pass = "1234";
		
		try {
		// 1�ܰ� - JDBC ����̹� �ε�
			Class.forName("com.mysql.jdbc.Driver");
			
		// 2�ܰ� - �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(host, user, pass);
			if(conn != null) {
				System.out.println("�����ͺ��̽� ���� ����!!!");
			}
			
		// 3�ܰ� - SQL ���ఴü ����
		// 4�ܰ� - SQL ����
		// 5�ܰ� - SQL ��� ó�� (SELECT�� ���)
		// 6�ܰ� - �����ͺ��̽� ��������
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����...");
	}
}