package chap01;

import java.util.Scanner;

public class SumWhile {
	// 1,2...n�� ���� ���մϴ�.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = sc.nextInt();
		
		int sum = 0;	// ��
		int i = 1;
		
		while(i <= n) {	// i�� n���ϸ� �ݺ�
			sum += i;	// sum�� i�� ����
			i++;		// i���� 1��ŭ ����
		}
		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
		System.out.println("i�� ���� " + i + "��(��) �Ǿ����ϴ�.");
	}

}
