package method;

public class Practice_test3x1 {

	public static int result;
	public static void main(String[] args) {
		// 5. 파라미터 2개 이상인 메서드 호출 연습
		// => 정수 2개를 전달하면 두 정수의 합을 리턴하는 메서드 호출하고
		// 	  리턴값을 출력 (ex. 10, 20 전달 시 10 + 20 결과인 30 리턴)
		int result = sum(10, 20);
		System.out.println("계산결과 : "+result);
		System.out.println("--------------------------------");
		
		
		
		// => 연산자 문자 1개와 정수 2개를 전달하면
		// 	  두 정수에 대한 어떤 연산을 수행한 후
		// 	  결과값을 리턴하는 메소드를 호출하고 리턴되는 값을 출력
		// 	  ex) '+', 10, 20 전달 시 10 + 20 결과인 30 리턴
		//    ex) '-', 10, 20 전달 시 10 - 20 결과인 -10 리턴
		int result2 = operator('+', 10, 20);
		System.out.println("연산결과 : "+result2);
		
		result2 = operator('-' , 10, 20);
		System.out.println("연산결과 : "+result2);
		
		result2 = operator('x', 10,20);
		System.out.println("연산결과 : "+result2);
	} // main() 메서드 끝

		

	
	// 5. 파라미터가 2개 이상인 메서드 정의 연습
	//  => 연산자 문자 1개와 정수 2개를 전달받아
	// 	   두 정수에 대한 어떤 연산을 수행한 후 결과값을 리턴하는 메서드 정의
	
	public static int sum (int num1, int num2) {
		System.out.println("숫자 1 : "+ num1);
		System.out.println("숫자 2 : "+ num2);
		return num1+num2;
	}

	public static int operator (char opr, int num1, int num2) {
		if(opr == '+') {
			return num1+num2;
		}else if(opr == '-') {
			return num1-num2;
		}else {
			System.out.println("연산자가 올바르지 않습니다.");
		}
		return result;
	}
	
	
	

} // Test3 클래스 끝
