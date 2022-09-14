package operator;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 문자열에 대한 덧셈연산자(+) = 연결(결합) 연산자
		 * - 어떤 데이터를 문자열과 덧셈연산자로 연산할 경우
		 *   산술연산의 덧셈이 아닌 단순 문자열 결합(연결)으로 사용됨
		 *   이 때, 어떤 데이터를 문자열 타입으로 변환하여 두 문자열을 연결
		 *   ex) "문자열" + "문자열" = "문자열문자열"
		 *       int + "문자열" = "int" + "문자열" = "int문자열"
		 */
		
		int a = 10, b = 20;
		System.out.println(a + b); // 일반 산술연산(덧셈 기능)
		
		System.out.println("a = " + a); // "문자열" + 정수 = "문자열정수"
		
		String str = "a = " + a;
		System.out.println(str);
		
		System.out.println("b = " + b); // "b = " + 20 = "b = 20"
		
		int c = a + b;
		System.out.println(a + " + " + b + " = " + c);
		// 1. a + " + " 를 수행하여 "10 + " 문자열 생성
		// 2. "10 + " 문자열과 + b 를 수행하여 "10 + 20" 문자열 생성
		// 3. "10 + 20" 문자열과 + " = " 를 수행하여 "10 + 20 = " 문자열 생성
		// 4. "10 + 20 = " 문자열과 + c를 수행하여 "10 + 20 = 30" 문자열 생성
		
		System.out.println("덧셈결과 : " + c);
		
		System.out.println("===========================");
		
		System.out.println(10 + 20); // 30(일반 산술연산 = 덧셈)
		System.out.println(10 + "20"); // "1020" 문자열 결합
		System.out.println("10" + 20); // "1020" 문자열 결합
		
		System.out.println(10 + "20" + 30); // "102030" 문자열 결합
		System.out.println("10" + 20 + 30); // "102030" 문자열 결합
		
		System.out.println(10 + 20 + "30"); // "3030" 문자열 결합
		// => 10 + 20 뎃셈을 먼저 수행하여 정수 30이 되고,
		//    정수 30과 문자열 "30" 을 결합하여 "3030" 문자열이 됨
		
		System.out.println("===============================");
		
		// String 타입 변수 name 에 자신의 이름을 저장
		// int 타입 변수 age 에 자신의 나이를 저장
		String name = "강진석";
		int age = 20;
		
		// 주민번호 표현시
//		int jumin = 901010-1234567; // 결과값 잘못됨 = 뺄셈으로 취급됨
//		int jumin = 9010101234567; // 오류 발생! int 타입으로 표현 불가능함
//		long jumin = 9010101234567L; // long 타입으로 표현하거나
//		String jumin = "901010-1234567";
		String jumin = "031010-3234567";
		
		// 이름 : 강진석
		// 나이 : 20
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민번호 : " + jumin);
		

	}

}





