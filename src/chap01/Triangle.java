package chap01;

import java.util.Scanner;

public class Triangle {
	// �Է��� ���� �� ������ �ϴ� ���簢���� *��ȣ�� ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�簢���� ����մϴ�.");
		System.out.print("�� �� : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
