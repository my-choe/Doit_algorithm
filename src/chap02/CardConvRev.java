package chap02;

public class CardConvRev {
	// �Է¹��� 10������ 2����~36������ ��� ��ȯ�Ͽ� ��Ÿ����
	
		static int cardConvR(int x, int r, char[] d) {
		// ������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ�մϴ�.
			int digits = 0;
			String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			
			do {
				d[digits++] = dchar.charAt(x % r); //r��  ���� �������� ����
				x /= r;
			}while(x != 0);
			
			return digits;
		}
		

}
