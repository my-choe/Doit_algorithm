package chap01;

import java.util.Scanner;

public class Digits {
	// 2�ڸ� ����� �Է°� ����
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		
		System.out.println("2�ڸ��� ������ �Է��ϼ���.");
		
		do{
			System.out.print("�Է� : ");
			no = sc.nextInt();
		}while(no < 10 || no >= 100);
		
		System.out.println("���� no�� ���� " + no + "(��)�� �Ǿ����ϴ�.");
	}

}
