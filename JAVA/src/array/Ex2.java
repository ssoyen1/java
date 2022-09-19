package array;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * < 배열 선언, 생성, 초기화를 한꺼번에 수행하는 문법 >
		 * 데이터타입[] 변수명 = {데이터1, 데이터2, ...., 데이터n}; // 데이터 리터럴 값을 직접 넣음
		 * => 배열 생성 문법을 별도로 명시하지 않고, 
		 * 	  중괄호를 사용하여 초기화할 데이터를 리터럴 형태로 전달하면 
		 * 	  해당 데이터 개수만큼 배열 공간이 자동으로 생성됨
		 * => n개 만큼의 공간을 생성하면서 인덱스 번호가 0 ~ n-1 부여되고 
		 * 	  자동으로 기본값으로 초기화
		 */
		
//		int[] arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
		
		// 위의 문장들을 하나로 결합하여 리터럴로 즉시 초기화까지 수행
		int[] arr = {1, 2, 3, 4, 5};
		// => 주의! 5개의 리터럴 지정 시 데이터 저장 공간만 생성되므로 
		// 추가적인 데이터 저장은 불가능하게 됨!
		
		// 배열 arr의 모든 요소 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------------------");
		
		// int형 배열 arr2를 먼저 선언한 후 
		// 별도로 정수 리터럴 1,2,3,4,5로 한꺼번에 초기화하는 경우
		int[] arr2;
//		arr2 = new int[4]; // 배열 생성 문장 사용 시 
//		arr2 = {1, 2, 3, 4, 5}; // 오류 발생! 별도로 초기화 시 사용 불가능!
								//-> 그럼 먼저 생성된 것에 값을 어떻게 넣는가 ?
		// => new 키워드를 사용하는 방법과 결합하여 문법을 지정해야함
		arr2 = new int[] {1, 2, 3, 4, 5}; // []에 값을 넣지않고 {}에 넣어주기
										 // => 주의! 배열의 크기는 지정하지 않도록 한다!
		
		System.out.println("------------------------");
		
		// String 타입 문자열 데이터 3개("Java", "JSP", "Android")를 저장하는
		// 배열 strArr을 생성하고 리터럴로 즉시 초기화까지 수행 후 출력
		
		String[] strArr = {"Java", "JSP", "Android"};
		for(int i = 0; i < strArr.length; i++ ) {
			System.out.println(strArr[i]);
		}
	
		System.out.println("==========================");
		
		int[] a = {1, 2, 3};
		int[] b = {4, 5, 6};
		int[] c = {7, 8, 9};
		
		a = b; // b의 주소값을 a에 저장
		// 기존에 a가 가리키던(참조하던) 1,2,3 저장 공간을 버리고
		// b가 가리키는 4, 5 ,6 저장 공간의 주소값ㅇ르 전달받아 참조하게 됨
		// 이 때, 기본 1, 2, 3저장 공간은 더 이상 참조되지 않을므로 
		// 불필요한 메모리 공간이 되어 Garbage Collector에 의한 정리 대상이 됨
		// => 즉, 더 이상 필요없는 메모리 공간은 자동으로 정리됨
		
		b = c; // c의 주소값을 b에 저장
		// 기존에 b가 참조하던 4, 5, 6 저장공간을 버리고
		// c가 가리키는 7, 8, 9 저장 공간의 주소값을 전달받아 참조
		// 이 때, 기존 4, 5, 6 저장 공간은 여전히 a에 의해 참조되고 있으므로
		// Garbage Collector에 의한 정리 대상이 아니다!
	}

}
