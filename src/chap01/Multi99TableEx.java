package chap01;

public class Multi99TableEx {
	// ���ʰ� ���ʿ� ���ϴ� ���� �ִ� ����ǥ ���
	public static void main(String[] args) {
		
		System.out.print("    |");
		for(int i = 1; i <= 9;i++) {
			System.out.printf("%5d", i);
		}
		System.out.println();
		System.out.println("----+---------------------------------------------");
		
		for(int j = 1; j<= 9; j++) {
			System.out.print("  " + j + " |");
			for(int k = 1; k <= 9; k++) {
				System.out.printf("%5d", j*k);
			}
			System.out.println();
		}
	}

}
