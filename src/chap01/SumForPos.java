package chap01;

import java.util.Scanner;

public class SumForPos {
	// 1,2,...,n�� ���� ���մϴ�(����� �Է�)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�(����� �Է�).");

		do {
			System.out.print("n�� �� : ");
			n = sc.nextInt();
		}while(n <= 0);		// n�� 0���� Ŭ ������ �ݺ�
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++)
			sum += i;
		
		System.out.println("1���� " + n + "������ ���� " + sum + " �Դϴ�.");
	}

}
