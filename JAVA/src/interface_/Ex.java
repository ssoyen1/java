package interface_;

import interface_.MyExInterface.MySubClass;

public class Ex {

	public static void main(String[] args) {
		
			// 추상클래스는 인스턴스 생성이 불가능
			// => System.out.println("서브클래스에서 구현한 추상메서드 method1()");
	//		MyClass mc = new MyClass();
			
			// 인터페이스도 인스턴스 생성이 불가능
	//		MyExInterface mi = new MyExInterface();
			
			// 인터페이스를 구현한 서브클래스(구현체클래스) 인스턴스 생성
			MySubClass mi2 = new MySubClass();
			mi2.method();
			mi2.method2();
			mi2.method3();
			
			// 상수도 인터페이스에서 선언했으므로 업캐스팅 후에도 접근 가능
			System.out.println(mi2.NUM1);
			System.out.println(mi2.NUM2);
			
			// 상수는 인스턴스를 통한 접근보다 클래스 또는 인터페이스 명으로 접근
			System.out.println(MyExInterface.NUM1);
			System.out.println(MyExInterface.NUM2);
			
			
			
			
			
			// 인터페이스 내의 모든 변수는 상수이므로 값 변경 불가!
			// => 구현체 클래스도 동일하 ㄴ상수가 상속됨
//			MyExInterface.NUM1 = 99; // 변경불가
//			msc.NUM1 = 99; // 변경불가
			
			System.out.println("===========================");
			
			// 인터페이스는 인스턴스 생성은 불가능하지만 참조변수 타입으로 사용가능
			// => 구현체 클래스의 인스턴스를 인터페이스 타입으로 업캐스팅 가능
			// 	  = 다형성 활용 가능
//			MyExInterface mi2 = new MySubClass(); //업캐스팅
			// 업캐스팅 후에는 참조영역이 축소되므로 상속된 메서드만 호출 가능
			// => 인터페이스의 추상메서드를 모두 오버라이딩 했기때문에 
			// 	  인터페이스 가진 모든 메서드는 참조영역 축소 후에도 호출가능! (동적바인딩때문)
		
	}

}

		// 인터페이스 정의
		// => class 키워드 대신 interface 키워드를 사용하여 정의
		interface MyExInterface {
			// 인터페이스 내의 모든 멤버변수는 상수(public static final) 이다!
			public static final int NUM1 = 10; // 상수
			int NUM2 =20; // 상수(public static fianl 생략되어 있음)
			
			// 인터페이스는 생성자를 가질 수 없다! (is-A 관계가 아니기때문!)
//			public MyExInterface() {} // 컴파일 에러 발생! Interfaces cannot have constructors
									  
			// 인터페이스 내의 모든 메서드는 추상메서드(public abstract) 이다! 
			// 추상클래스는 일반메서드O 추상메서드O 가질 수 있기때문에 앞에 abstract를 따로 붙혀주지만
			// 인터페이스는 일반메서드X 추상메서드O이므로 굳이 따로 적어줄 필요 없음.
			public abstract void method(); // 추상메서드
			
//			public void method2() {} // 일반메서드(컴파일 에러 발생!) Abstract methods do not specify a body
			public void method2();   // 추상메서드(abstract 생략되어 있음)						 
			
			void method3(); // 추상메서드(public abstract 생략되어있음)
			
			
			
			
			
			
			// 인터페이스를 상속받아 구현하는 서브클래스(구현클래스) MySubClass 정의
			// => 서브클래스 정의 시 클래스명 뒤에 implements 키워드를 쓰고 인터페이스명 지정
			class MySubClass implements MyExInterface{

				
				@Override
				public void method() { // 오버라이딩했을때 public 무조건 나와야함.없으면 오류
					System.out.println("서브클래스에서 구현한 추상메서드 method1()");
					
				}

				@Override
				public void method2() {
					System.out.println("서브클래스에서 구현한 추상메서드 method2()");
					
				}

				@Override
				public void method3() { 
					// 인터페이스(MyExInterface)에서 method3 메서드 정의 시 접근제한자를 생략했지만
					// 인터페이스 내의 모든 메서드는 public 접근제한을 가지므로 
					// 오버라이딩을 통한 구현 시 무조건 public 접근제한자만 사용 가능
					System.out.println("서브클래스에서 구현한 추상메서드 method3()");
					
				}
				
			}
			
			
			
			
		abstract class MyClass {
			// 클래스 내의 모든 멤버변수는 상수가 아니며, 선언 방법에 따라 달라짐
			public static final int NUM1 = 10; // 상수
			public int NUM2 = 20; // 인스턴스 멤버변수(상수x),
			
			public MyClass() {}// 생성자 => 생성자를 가질 수 있음
			
			public abstract void method1(); // 추상메서드 
											// => 추상메서드를 갖는 클래스는 반드시 추상클래스로 선언해야 한다!
			public void method2() {} // 일반메서드
									 // => 추상클래스는 일반메서드도 가질 수 있다!
			
		}
		
		
		
		
		
		
		
		
		
		
		}