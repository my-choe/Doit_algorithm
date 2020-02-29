package chap02;

public class IntArrayInit {
	// 구성 요소의 자료형이 int형인 배열(구성요솟수는 5 : 배열 초기자에 의해 생성)
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		
		for(int i = 0 ; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
		
	}

}
