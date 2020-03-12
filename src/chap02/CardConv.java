package chap02;

import java.util.Scanner;

public class CardConv {
	// �Է� ���� 10������ 2���� ~36������ �����ȯ�Ͽ� ��Ÿ��(���ڸ����� �迭�� ����)
	// ���� x�� r������ ��ȯ�Ͽ� �迭 d�� ���ڸ����� �����ϰ� �ڸ����� ��ȯ
		static int cardConv(int x, int r, char[] d) {
			int digits = 0;// ��ȯ ���� �ڸ���
			String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			do {
				d[digits++] = dchar.charAt(x % r); // r�� ���� �������� ����
				x /= r;
			} while (x != 0);

			for (int i = 0; i < digits / 2; i++) { // d[0]~d[digits-1]
				char temp = d[i];
				d[i] = d[digits - i - 1];
				d[digits - i - 1] = temp;
			}
			return digits;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int no; // ��ȯ�ϴ� ����
			int cd; // ���
			int dno; // ��ȯ ���� �ڸ���
			int retry; // �� �� ��?
			char[] cno = new char[32]; // ��ȯ ���� �� �ڸ��� �����ϴ� ������ �迭

			System.out.println("10������ �����ȯ�մϴ�.");
			do {
				do {
					System.out.print("��ȯ�ϴ� ���� �ƴ� ������");
					no = sc.nextInt();
				} while (no < 0);

				do {
					System.out.print("� ������ ��ȯ�ұ��? (2~36)��");
					cd = sc.nextInt();
				} while (cd < 2 || cd > 36);

				dno = cardConv(no, cd, cno); // no�� cd������ ��ȯ

				System.out.print(cd + "�����δ� ");
				for (int i = 0; i < dno; i++) // ���ڸ����� ���ʷ� ��Ÿ��
					System.out.print(cno[i]);
				System.out.println("�Դϴ�.");

				System.out.print("�ѹ� �� �ұ��? (1.��/0.�ƴϿ�)��");
				retry = sc.nextInt();
			} while (retry == 1);
		}
	}