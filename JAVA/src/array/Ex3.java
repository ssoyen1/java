package array;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 배열 내의 데이터에 대한 연산 누적
		 * 
		 * 0. 연산을 누적할 변수 선언 및 초기화 
		 * 1. 배열 생성 및 데이터 저장
		 * 2. for문을 사용하여 배열 내의 모든 인덱스에 차례대로 접근
		 *	  => 배열의 인덱스 번호를 제어변수로 지정하여
		 *		 해당 배열 내의 데이터를 누적변수에 누적
		 * 3. for문 종료 후 누적변수 값을 사용 
		 * 
		 */
		
		// 0. 합계를 누적할 누적 변수(int형 변수 total) 선언 및 초기화
		int total = 0;
		
		// 1. 정수형 데이터 1 ~ 10까지 저장하는 배열 arr생성
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 2. for문을 사용하여 배열 내의 모든 인덱스에 차례대로 접근 
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]); // 1~10까지 출력함.
										// 배열 내의 모든 데이터 출력
			
			// 배열 내의 모든 데이터를 차례대로 total 변수에 누적
			total += arr[i]; // 배열 arr의 i번 인덱스 데이터를 total에 누적
		}

		// 3. 누적 변수 (합계) 출력
		System.out.println(total);
		System.out.println("====================================");
		
		int oddTotal = 0; // 홀수의 합을 누적할 변수 초기화
		int evenTotal = 0;// 짝수의 합을 누적할 변수 초기화
		
		// 배열 내의 모든 인덱스에 차례대로 접근
		// => 이 때, 각 인덱스 데이터가 홀수, 짝수일 때 각각의 변수에 누적
		for(int i=0; i<arr.length; i++) { 
			if(arr[i] % 2 == 1) {// 배열데이터 arr[i]가 홀수 일때 
				oddTotal += arr[i]; 
			}else {// 배열데이터 arr[i]가 짝수 일때 
				evenTotal += arr[i];
			}
		}
		System.out.println("배열 내의 홀수의 합 누적 : "+oddTotal); //홀수의 합 누적 : 25
		System.out.println("배열 내의 짝수의 합 누적 : "+evenTotal); //짝수의 합 누적 : 30
	}

}
