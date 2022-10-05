package method_overloading;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 메서드 오버로딩 (Method Overloading) = 메서드 다중 정의
		 * 
		 * - 동일한 이름의 파라미터가 다른 메서드를 여러번 정의하는 것
		 * - 비슷한 기능을 수행하지만, 전달받은 데이터의 타입이 다른 경우
		 * 	 메서드 이름을 각각 따로 정의하지 않고, 동일한 이름으로 
		 *   파라미터만으로 구분되는 메서드를 여러개 정의하는 것
		 * - 주의사항 ! 메서드 시그니처(이름, 리턴타입, 파라미터, 접근제한자) 중 
		 *   파라미터를 제외한 나머지는 동일하게 정의함
		 *   => 외부에서 메서드를 호출하는 시점에 이름이 동일한 메서드 간에 
		 *      전달되는 데이터(파라미터값)만으로 각 메서드가 구분되어야 함
		 *      
		 *      
		 * < 메서드 오버로딩 규칙(1,2중 택 1) >
		 * 1. 메서드 파라미터의 데이터타입이 달라야 함
		 * 2. 메서드 파라미터의 개수가 달라야 함
		 * 3. 메서드 이름이 같아아 한다.
		 * 4. 반환타입은 영향 없다.
		 * 
		 */
		
		NormalMethod nm = new NormalMethod(); // 기본생성자는 class이름과 같음
		nm.addInt(10, 20); // 각각 int num1, num2에 들어감 -> 30
//		nm.addInt(1.5, 3.14); // 오류발생! 
							  //  => The method addInt(int, int) in the type NormalMethod is not applicable for the arguments (double, double)
		nm.addDouble(1.5, 3.14); // -> 4.640000000000001
		
//
//		System.out.println(); // 정수, 실수, 문자열 다 넣을 수 O 
//							  // => println로 다 받을 수 있음. (X:printInt, printString)
//		
		System.out.println("===========================================");
		// 오버로딩이 적용된 메서드를 정의한 OverloadingMethod 인스턴스 생성
		OverloadingMethod om = new OverloadingMethod();
		// 오버로딩 된 메서드 호출 시 파라미터를 전달하면 
		// 오버로딩 메서드 중에서 파라미터가 일치하는 메서드가 자동 호출됨
		// => 단, 메서드 호출 시점에서 각 메서드가 구분되어야 오버로딩 성립됨.
		om.add(10, 20); // 컨트롤+스페이스 해서 더블값이 들어가는 것을 선택한 후 정수값을 넣어도 에러 생기지 않음
						// 자바가 알아서 선택해주기때문!
		om.add(1.5, 3.14);
		// 이름은 같은 파라메터안에 
		om.add(1, 2, 3); 
		
		om.add(1.5, 1.5);
	}

} // Ex 클래스 끝

	class OverloadingMethod {
		// 오버로딩 기능을 활용하여 두 수를 전달받아 덧셈 결과를 출력하는 메서드
		// => 동일한 이름의 파라미터 타입만 서로 다른 메서드를 여러번 정의
		// 1. 정수 2개를 전달받아 덧셈 수행
		public void add(int num1, int num2) {
			System.out.println("add(int, int) 호출됨!");
			System.out.println(num1 + num2);
		}
		
		
		// 2. 실수 2개를 전달받아 덧셈 수행
		public void add(double num1, double num2) {
			System.out.println("add(double, double) 호출됨!");
			System.out.println(num1 + num2);
		}
		
		
		// 3. 정수 3개를 전달받아 덧셈 수행
		public void add(int num1, int num2, int num3) {
			System.out.println("add(int,int,int) 호출됨! ");
			System.out.println(num1 + num2 + num3);
		}
		
		
		
		// 주의 ! 파라미터의 변수명만 다를 경우 오버로딩 성립되지 않음 ! => 오류발생
//		public void add(int a, int b);
		 // 다른곳에도 add(int, int) 데이터타입이 있으면 중복
		
		// 주의 ! 리턴타입만 다를 경우 오버로딩 성립되지 않음!=> 오류발생
//		public int add(int num1, int num2) {
//			System.out.println("add(int,int) 호출됨!");
//			return num1 + num2;
//		}
		
		
	}

	class NormalMethod {
		// 두 수를 전달받아 덧셈 결과를 출력하는 메서드 정의
		// 1. int형 정수 2개를 전달받을 경우
		public void addInt (int num1, int num2) {
			System.out.println(num1 + num2);
		}

		// 2. double형 실수 2개를 전달받을 경우
		public void addDouble(double num1, double num2) {
			System.out.println(num1 + num2);	
		}
	
		
		// 일반적으로 메서드명도 식별자에 해당되므로 중복이 불가능함
		// 따라서, addInt() 와 addDouble()메서드는 하는 일은 같지만
		// 서로 다른 파라미터를 전달받으므로 다른 이름으로 정의했음
		// => 메서드 정의 시 메서드 명을 달리해야하므로 호출 시 구분이 불편할 수 있음
		public void println(int num) {
			System.out.println(num);
		}
		
		public void printString(String str) {
			System.out.println(str);
		}
	
	}
	

