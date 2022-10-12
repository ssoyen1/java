package interface_;

import interface_.MyExInterface.MyClass;
import interface_.MyExInterface.MySubClass;

public interface MyInterface {

	/*
	 * 인터페이스(Interface)
	 * 
	 * - 추상클래스와의 차이점 
	 *   - 추상클래스 : 일반클래스이지만 추상메서드 가지고 있음, 이외에도 생성자 IV 가질 수 있음
	 *   - 인터페이스 : 추상메서드만 가질 수 있음. 이외에는 가질 수 없음
	 * 
	 * - 추상매서드의 집합
	 * - 클래스가 아니므로 선언 시 class 키워드를 사용하지 않고
	 * 	 interface 키워드를 사용하여 정의
	 * - 인터페이스는 상수와 추상메서드만 가질 수 있다.
	 * 	 => 모든 멤버변수는 public static final이 붙은 상수로 취급됨
	 * 	    (public static final 생략 가능)
	 * 		(final로 인해 값 변경 불가, 
	 * 		 static 으로 인해 클래스명만으로 접근 가능,
	 * 		 public 으로 인해 누구나 접근 가능)
	 * 	 => 모든 메서드는 public abstract가 붙은 추상메서드로 취급됨
	 * 	 	(public abstract 생략 가능)
	 * 		(메서드 바디를 가질 수 없으며, public 으로 인해 누구나 접근 가능)
	 * - 추상클래스와 마찬가지로 추상메서드를 포함하므로 객체 생성 불가능
	 * 	 => 단, 참조변수 타입으로는 사용 가능(= 다형성을 활용한 업캐스팅 가능)
	 * - 서브클래스(구현클래스)에서 인터페이스를 상속받아 구현해야하는 경우 
	 * 	 extends 키워드 대신 implement 키워드 사용
	 * 	 => 클래스는 상속받아 확장(extends)의 개념이 강하지만,
	 * 		인터페이스는 상속받아 추상메서드들을 구현(implement)의 개념이 강함
	 * - 클래스는 서브클래스에서 다중 상속이 불가능하지만,
	 * 	 인터페이스는 서브클래스에서 다중 상속(구현)이 가능하다!
	 * 	 => implements 키워드 뒤에 복수개의 인터페이스 지정 가능
	 * - 인터페이스끼리 상속받을 경우 implements가 아닌 extends로 상속
	 * 	 => 추상메서드는 구현(implement) 하지 못하기 때문에!
	 * 
	 * 	< 인터페이스 정의 기본 문법>
	 * [접근제한자] interface 인터페이스명 {
	 * 		// 상수
	 * 		// 추상메서드
	 * }
	 * 
	 * < 인터페이스를 상속받은(=구현하는) 서브클래스(구현클래스) 정의 문법 >
	 * [접근제한자] class 클래스명 implements 인터페이스명 {}
	 * 
	 *
	 * 
	 */
	
			// 추상클래스는 인스턴스 생성이 불가능
			// => System.out.println("서브클래스에서 구현한 추상메서드 method1()");
//			MyClass mc = new MyClass();
			
			// 인터페이스도 인스턴스 생성이 불가능
//			MyExInterface mi = new MyExInterface();
			

			
}
