package chap01;

import java.util.Scanner;

public class SumGauss_01_08 {
	// ���콺 ��Ģ���� 1���� n������ �� ���ϱ�
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = sc.nextInt();
		
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // ��

		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}

}
