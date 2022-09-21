package variable_arguments;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 가변형 인자 = 비정형 인자(Variable Arguments, VARARGS)
		 * 
		 * - 메서드 파라미터를 하나의 인자만 사용하여 다양하게 전달받는 기능
		 * - 동일한 타입의 파라미터를 0개 ~ 무한대로 전달받아 배열로 관리
		 * 	 => 전달받는 인자(데이터)의 개수에 따라 자동으로 배열 생성됨
		 * - 메서드 파라미터(매개변수) 선언 시 데이터 타입 뒤에 ... 기호를 표시
		 *   ex) public void add(int... nums) {}
		 * - 가변 인자를 사용한 메서드 대표적인 예 : printf() 메서드
		 * 	 => System.out.printf(String str, Object...objS) {}
		 * - 다른 파라미터와 가변 인자를 조합 가능
		 * - 주의! 가변 인자는 마지막 파라미터로 단 한번만 지정 가능
		 * 
		 * 
		 * 
		 */

			// 가변인자를 사용하지 않은 오버로딩 메서드 호출
			NormalArguments na = new NormalArguments(); // 생성자 따로 만들지 않았으므로 기본생성자통해 만들겠다.
			na.print("홍길동"); // (출력) 홍길동
			na.print("홍길동", "이순신"); // (출력) 홍길동, 이순신
			na.print("홍길동", "이순신", "강감찬"); // (출력) 홍길동, 이순신, 강감찬
//			na.print("홍길동", "이순신", "강감찬","유관순"); 
							   // =>4개의 파라미터를 전달받은 메서드가 존재하지 않기때문에 에러발생! 
							   // => 배열사용하여 해결할 수 있음.
			
			// 만약, 배열을 파라미터로 사용하는 경우 
			// 데이터 개수에 제한을 받지 않지만, 배열을 미리 생성해야 한다!
			String[] strArr = {"홍길동", "이순신", "강감찬","유관순"}; // 배열 생성
																 // 스트링 배열이구나 ~! 
			na.print(strArr);  // (출력) 홍길동 이순신 강감찬 유관순 
			
			System.out.println("=============================================");
			
			
			VariableArguments va = new VariableArguments();
			// VarialeArguments 객체의 print()메서드를 호출하면
			// 파라미터로 0개 ~ 무한대의 문자열 데이터 전달이 가능함
			va.print("홍길동");
			va.print("홍길동", "이순신");		
			va.print("홍길동", "이순신", "강감찬");
			va.print(); // 0개도 전달됨 호출가능
			

			System.out.println("----------------------------------------------");
			// 다른 파라미터와 가변 인자를 조합한 메서드호출
			va.print2(2, "홍길동", "이순신");
			
			
			
			
			
	}

}



			class VariableArguments {
				// 가변 인자를 사용한 메서드 오버로딩
				// => 메서드 정의시 파라미터로 사용할 변수 데이터 타입 ... 기호 붙임
				public void print(String...names) {
					// String 타입 데이터를 0 ~ 무한대로 전달받을 수 있으며
					// 전달된 데이터는 자동으로 배열 생성 후 저장됨
					// => 가변인자를 사용한 변수 names 는 String[] 타입으로 사용됨
					// 	  따라서, 배열 접근 방법을 활용하여 배열 내의 모든 요소에 접근
					// for 문을 사용하여 배열 내의 모든 데이터 출력
					for(int i = 0; i < names.length; i++) {
						System.out.print(names[i]+" "); // print
					}
					
					System.out.println();
					
				}
				
				
				
				// 다른 파라미터와 가변인자 조합
				public void print2(int num, String...names) {
				// => int형 데이터 1개와 문자열 데이터 여러개를 전달 가능
				// 	  ex) print2(2, "홍길동", "이순신");
				}
				// (주의) 가변 인자가 다른 파라미터보다 앞에 올 수 없다!
//				public void print3(String...names, int num) { // 에러발생
//															   The variable argument type String of the method print2 must be the last parameter
//				}
				
				
				// (주의) 가변 인자가 2개이상 올 수 없다!
//				public void print4(int...nums, String... names) {} // 오류발생
			
			
			
			}
				
				
				
			
			
			


			
			class NormalArguments {
				// 가변 인자를 사용하지 않은 메서드 오버로딩
				// print() 메서드 오버로딩
				// String 타입 변수(name)를 통해 이름을 1개~3개 전달받아 출력
				
				
				public void print(String name1) {
					System.out.println(name1);
				}
				
				public void print(String name1, String name2) { //오버로딩
					System.out.println(name1+", "+name2);
				}
				
				public void print(String name1, String name2, String name3) { //오버로딩
					System.out.println(name1+", "+name2+", "+name3);
				}
				
				
				
				
				
				// 파라미터로 String 타입 배열을 선언하는 경우
				public void print(String[] names) { // names안에 StrArr={}에서 받은 문자들 받아옴
					// for문을 사용하여 배열 내의 모든 데이터 출력
					for(int i = 0; i < names.length; i++) {
						System.out.print(names[i]+" "); // print
					}
					
					System.out.println();
					
				}
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
			