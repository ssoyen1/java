package abstract_;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}




		abstract class AbstractClass2 {
			public abstract void method1();
			public abstract void method2();
			
		}
		
		// 추상클래스 2개를 갖는 추상클래스를 상속받아 서브클래스 정의
		abstract class MiddleClass extends AbstractClass2 {

			
			// 상속받은 추상메서드 2개 중 하나만 구현하는 경우
			// => 추상메서드가 구현되지 않은 채 그대로 존재할 경우 
			//	  오버라이딩되지않는 메서드에대해서 반드시 구현해야한다는 에러가 뜸
			//	  해당 서브클래스도 추상클래스(abstract)로 선언해야 한다!
			@Override
			public void method1() {
				System.out.println("MiddleClass에서 구현한 method1()");
				
			}
		}
		
		// 추상메서드를 모두 구현하지 않은 서브클래스(추상클래스) 
		// MiddleClass를  상속받는 서브클래스 SubClass2 정의
		class SubClass2 extends MiddleClass {

			// method1() 메서드는 MiddleClass 에서 이미 구현되어 있으므로 강제성 X
			// 여전히 강제성이 남아있는 method2()에서는 반드시 구현해야 한다!
			@Override
			public void method2() {
				System.out.println("Subclass2에서 구현한 method2()");
			}
		}
		
		
		
		