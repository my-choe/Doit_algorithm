package chap01;

import java.util.Scanner;

public class JudgeSign {
	// �Է��� �������� ������� �������� 0���� �Ǵ��մϴ�.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���. : ");
		int num = sc.nextInt();
		
		if(num > 0)
			System.out.println(num + "��(��) ����Դϴ�.");
		else if(num < 0)
			System.out.println(num + "��(��) �����Դϴ�.");
		else
			System.out.println(num + "�� 0�Դϴ�.");
	}

}
