package chap01;

import java.util.Scanner;

public class SumFor {
	// 1,2...n�� ���� ���մϴ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = sc.nextInt();
		
		int sum = 0;	// ��
		
		for(int i = 1; i <= n; i++) {
			sum += i;		// sum�� i�� ����.
		}
		
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}

}
