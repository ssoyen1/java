package static_member;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 
		 * 	< 자바 프로그램 실행 과정 >
		 * 
		 * 0. 소스 코드 작성 및 컴파일 후 클래스 실행
		 * 1. 클래스 로딩 (클래스가 메모리에 쓰임)
		 * 	  => "static 변수 및 메서드가 메모리에 로딩됨"
		 * 2. main() 메서드 호출(실행)
		 * 3. 인스턴스 생성
		 * 	  => 인스턴스 변수 및 메서드가 메모리에 로딩됨
		 * 4. 인스턴스 메서드 호출(실행)
		 * 	  => 로컬 변수가 메모리에 로딩됨
		 * 5. 결과 출력
		 * 6. 프로그램 종료
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 	< static 키워드 >
		 * - 클래스, 메서드, 변수의 제한자로 사용
		 * - 메서드 또는 변수에 static 키워드를 사용할 경우
		 * 	 인스턴스 생성과 상관없이 클래스가 로딩되는 시점에 메모리에 로딩됨
		 * 	 ( 클래스가 로딩되는 Method Area에 함께 로딩됨 )
		 * 	 => 따라서, 참조변수 없이 클래스명만으로 멤버에 접근 가능함
		 * 		(= 인스턴스 생성 없이도 접근 가능한 멤버)
		 * 
		 * 	 => 기본 문법 : [클래스명.변수명] 또는 [클래스명.메서드명()] 형태로 접근
		 * - 인스턴스 멤버변수가 아닌 클래스(=정적 =static) 멤버로 취급됨
		 * 
		 *  - (언제붙이는가?)iv를 사용하지 않을 때 (객체 : iv의 묶음/ iv : 변수 묶음)
		 *  - (메서드) : 명령문집합
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 	< static 변수 >
		 *  - 멤버변수에 static 키워드를 사용할 경우 클래스(정적) 멤버로 취급됨
		 *  - 인스턴스 생성 전, 클래스가 메모리에 로딩될 때 함께 로딩됨
		 *    => 모든 인스턴스에서 하나의 변수를 공유함 (공통속성 (클래스변수))
		 *    								  (<-> 개별속성(인스턴스 변수)
		 *    => 즉, 클래스당 하나만 생성됨 (클래스영역 = Method Area에 생성됨)
		 *    => 인스턴스 생성 없이도 사용 가능
		 *  - [클래스명.멤버변수명] 형태로 접근
		 *  - 객체 생성없이 호출 가능
		 *  - 작업에 필요한 것들 다 매개변수로 받음.
		 *  - (인스턴스 멤버) iv, im
		 *  - (im 인스턴스 메서드) 작업에 필요한것들 다 iv로 받기때문에 따로 매개변수가 필요X
		 *  - (인스턴스 생성 ) : iv 생성
		 * 
		 *  - (X)static 메서드 안에서 인스턴스메서드(객체를필요로하는)를 호출할 수 없다! <- iv를 사용하지 못하는 이유와 같음(
		 *  - (O) static 메서드 안에서 static 메서드 호출  
		 *  - (O) 인스턴스 메서드 안에서 인스턴스 메서드 호출 
		 */

		
		
//			System.out.println("NormalMember.a : "+ NormalMember.a);
					// => Cannot make a static reference to the non-static field NormalMember.a
					// => Static이 정의되어 있지 않은 인스턴스 멤버변수 a에 접근하려고 하면 에러가 발생함
				
			NormalMember n1 = new NormalMember(); // 인스턴스 생성
			NormalMember n2 = new NormalMember(); // 인스턴스 생성
			// => 두 개의 인스턴스가 생성되며, 인스턴스 멤버변수도 각각 두 개씩 생성됨
			
			System.out.printf("n1.a : %d, n2.a : %d\n", n1.a, n2.a);
			System.out.printf("n1.b : %d, n2.b : %d\n", n1.b, n2.b);
														//n1.a : 10, n2.a : 10
														//n1.b : 20, n2.b : 20
			
			// n1 인스턴스의 인스턴스 멤버변수 a 값을 99로 변경
			// n2 인스턴스의 인스턴스 멤버변수 b 값을 999로 변경
			n1.a = 99;
			n1.b = 999;
			
			System.out.printf("n1.a : %d, n2.a : %d\n", n1.a, n2.a);
			System.out.printf("n1.b : %d, n2.b : %d\n", n1.b, n2.b);
														//n1.a : 99, n2.a : 10
														//n1.b : 999, n2.b : 20
			// 인스턴스 멤버변수인 a와 b는 인스턴스마다 생성되므로
			// 하나의 인스턴스에서 인스턴스 멤버변수 값을 바꾸더라도 
			// 다른 인스턴스 멤버변수에는 아무런 영향이 없다.
			// => 생성된 메모리 공간이 다르기 때문.
			
			System.out.println("========================================");
			
			
			// StaticMember 클래스의 인스턴스 생성 전에 static 멤버 접근
			System.out.println("StaticMember.a : "+ StaticMember.a);
														//StaticMember.a : 10
			// => 인스턴스가 생성되기 전이지만 이미 메모리에 로딩되어 있으므로
			// 	  클래스명만으로 static 변수에 접근할 수 있따!
			
			StaticMember s1 = new StaticMember(); // 인스턴스 생성
			StaticMember s2 = new StaticMember(); // 인스턴스 생성
			// => 두 개의 인스턴스가 생성되며, 인스턴스 멤버변수도 두 개씩 생성됨
			
			System.out.printf("s1.a : %d, s2.a : %d\n", s1.a, s2.a);
			System.out.printf("s1.b : %d, s2.b : %d\n", s1.b, s2.b);
			
			s1.a = 99; // Static(클래스 = 정적) 멤버변수 값을 변겅
			s1.b = 999; // 인스턴스 멤버변수 값을 변경

			System.out.printf("s1.a : %d, s2.a : %d\n", s1.a, s2.a);
			System.out.printf("s1.b : %d, s2.b : %d\n", s1.b, s2.b);
											// (출력) n1.a : 99, n2.a : 10
											//       n1.b : 999, n2.b : 20
											// static 멤버변수 값(a)을 s1 인스턴스에서 변경하게 되면
											// s2 인스턴스도 동일한 변수 값을 공유하므로
											// 변경된 값이 두 인스턴스 모두 적용(공유)됨
											// => 즉, 하나의 인스턴스에서 값을 변경하면 모든 인스턴스가 영향을 받음
			
			System.out.println("------------------------------------");
			s2.a = 1000;

			System.out.printf("s1.a : %d, s2.a : %d\n", s1.a, s2.a);
											//s1.a : 1000, s2.a : 1000
			
			// static 멤버는 참조변수명 대신 클래스명만으로 접근 가능
			StaticMember.a = 500; // static은 클래스명 만으로 접근가능
//			StaticMember.b = 500; // 반드시 static이 없는애들은 인스턴스를 만들고 참조변수통해 접근해야함. 클래스명만으로 접근 불가!
			System.out.printf("s1.a : %d, s2.a : %d\n", s1.a, s2.a);
			
			System.out.println("=====================================");
			
			
			
			// Static 멤버변수의 대표적인 예
			// => java.lang.Math 클래스의 PI 변수
			System.out.println("PI 값 : "+ Math.PI);
			
			
	}		

}

			class NormalMember {
				int a= 10; // 인스턴스 변수(=멤버변수 =필드)
				int b = 20; // 인스턴스 변수
			}
			
			
			class StaticMember {
				static int a = 10; // static 멤버변수(클래스 멤버변수 = 정적 멤버변수) static 붙이면 a가 기울어짐
				int b = 20; // 인스턴스 멤버변수
			}
			
			
			
			
			