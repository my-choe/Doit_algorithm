package chap01;

public class Multi99Table {
	// °ö¼ÀÇ¥ Ãâ·Â
	
	public static void main(String[] args) {
		System.out.println(" --------- °ö¼ÀÇ¥ Ãâ·Â ---------");
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j<=9; j++) 
				System.out.printf("%3d", i*j);
			System.out.println();
		}
	}

}
