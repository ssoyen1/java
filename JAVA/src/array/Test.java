package array;

public class Test {

	public static void main(String[] args) {
		// int형 배열 공간 5개를 생성(arr)하고 임의의 정수 5개로 초기화 후 출력
		
//		int[] arr;
//		arr = new int[5];
		int[] arr = new int[5];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
//		arr[4] = 50; // 초기화 하지 않을 경우 4번 인덱스는 0으로 자동 초기화됨
														// 4번 인덱스 데이터 : 0

		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i + "번 인덱스 데이터 : "+ arr[i]);
		}
														//		0번 인덱스 데이터 : 10
														//		1번 인덱스 데이터 : 20
														//		2번 인덱스 데이터 : 30
														//		3번 인덱스 데이터 : 40
														//		4번 인덱스 데이터 : 50
		
		System.out.println("====================================");		
		
		// boolean 타입 배열 3개 생성하고
		// 임의의 boolean 타입 데이터 초기화 후 출력
		// 2번 인덱스만 true값을 초기화
		
		boolean[] arr2 = new boolean[3];
		arr2[2] = true;
		// 0번, 1번 인덱스를 초기화 하지 않을 경우 기본값 false로 자동으로 초기화
		
		for(int i=0; i < arr2.length; i++) {
			System.out.println(i+"번 인덱스 데이터 : "+ arr2[i]);
		}
		
															//		0번 인덱스 데이터 : false
															//		1번 인덱스 데이터 : false
															//		2번 인덱스 데이터 : true

		// String 타입 배열 3개를 생성하고
		// 0번 "홍길동", 1번 "이순신" 문자열로 초기화 후 출력
		
		System.out.println("====================================");		
		
		String[] arr3 = new String[3];
		arr3[0] = "홍길동";
		arr3[1] = "이순신";
															//		0번 인덱스 데이터 : 홍길동
															//		1번 인덱스 데이터 : 이순신
															//		2번 인덱스 데이터 : null
		for(int i = 0; i< arr3.length; i++) {
			System.out.println(i+"번 인덱스 데이터 : "+ arr3[i]);
		}
		
		System.out.println("====================================");		
		
		// double 타입 데이터 5개를 저장하는 배열 arr4 생성 후 
		// 임의의 4개의 실수로 초기화 후 전체 데이터 차례대로 출력
		double[] arr4 = new double[5];
		arr4[0] = 1.1;
		arr4[1] = 2.2;
		arr4[2] = 3.3;
		arr4[3] = 4.4;
															//		4번 인덱스 데이터 : 0.0		
		
		for(int i = 0; i< arr4.length; i++) {
			System.out.println(i+"번 인덱스 데이터 : "+ arr4[i]);
		}
		
		
	}

}
