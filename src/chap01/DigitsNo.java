package chap01;

import java.util.Scanner;

public class DigitsNo {
	// ���� �������� �ڸ����� ���Ͽ� ��Ÿ��
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n ;
		
		do {
			System.out.print("n�� ������  : ");
			n = sc.nextInt();
		}while(n < 0);
		
		int no = 0;				// �ڸ���
		
		while(n > 0) {
			n /= 10;			// n�� 10���� ����
			no++;
		}
		
		System.out.println("�ش� ���ڴ� " + no + "�ڸ� �� �Դϴ�.");

	}

}
