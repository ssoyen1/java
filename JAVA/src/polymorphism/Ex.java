package polymorphism;

public class Ex {

	public static void main(String[] args) {
		
		/*
		 * 0929
		 * 
		 * 레퍼런스 형변환
		 * 
		 * - 어떤 객체(인스턴스)를 다른 타입으로 변환하는 것
		 * - 참조형 데이터타입간의 변환 (8개의 기본데이터타입 이외 클래스..(애니멀,차일드,패런트등)
		 * - 반드시 상속 관계가 전제가되어야 함
		 * 	 (= 상속관계가 아닌 타입끼리의 형변환은 허용되지 않음 = 오류발생)
		 * - 슈퍼클래스타입 <-> 서브클래스타입 간의 변환
		 * - 묵시적 형변환 (업캐스팅, Up Casting) 과 
		 * - 명시적 형변환 (다운캐스팅, Down Casting) 으로 구분
		 *
		 * 1. 업캐스팅 (Up Casting, 묵시적형변환)
		 * - 슈퍼클래스 타입 레퍼런스로 서브클래스 인스턴스를 참조하는 것
		 * 	 = 서브클래스의 인스턴스를 슈퍼클래스 타입으로 변환하는 것
		 * - 컴파일러에 의해 자동형변환이 일어남
		 * 	 = 별도의 형변환 연산자를 사용하지 않아도 변환 가능함(생략가능)
		 * - 참조가능한 영역이 축소됨(Child 전체를 다 사용하지못하고 부모클래스가 가지고있는 만큼만 사용가능)
		 * 						(슈퍼클래스로부터 상속된 멤버만 접근이 가능해짐)
		 * - 서브클래스 인스턴스 멤버 중 공통 항목(상속된 부모클래스멤버)을 제외한 나머지에 대한 포기 선언하는 것과 같다
		 * 	 => 대신, 하나의 슈퍼클래스 타입으로 여러 클래스의 인스턴스를 참조할 수 있다!
		 * 	
		 * 
		 */
		
			
			
				// Parent 클래스의 인스턴스(p) 생성
	//			Parent p = new Parent(); // 참조변수.parent로부터 만들어지는 인스턴스에대한 접근가능케하는 p
				
				
				// Parent 타입의 p 참조변수로 접근 가능한 메서드 : 1개
	//			p.parentPrn();
	//			p.childPrn(); // 서브클래스에서 직접 정의한 메서드는 호출 불가
																//슈퍼클래스의 parentPrn()
			
				
				System.out.println("------------------------------------------");
				
				// 서브클래스 Child 인스턴스(c) 생성
				// Child 타입의 c 참조변수로 접근가능한 메서드 : 2개
				Child c = new Child();
				c.parentPrn(); // 슈퍼클래스에서 상속받은 메서드 상속 가능
				c.childPrn();  // 서브클래스에서 직접 정의한 메서드 
																//슈퍼클래스의 parentPrn()
																//서브클래스의 childPrn()
				
				System.out.println("=======================================");
				// ----------------업캐스팅(서브클래스타입 -> 슈퍼클래스타입) ---------------------
				
				// 슈퍼클래스타입 Parent의 레퍼런스 변수(p)선언
				Parent p;
				// 슈퍼클래스타입 변수 p에 서브클래스 타입 Child의 인스턴스 주소를 전달(대입)
				p = c; //묵시적 형변환(업캐스팅)
					   // => Parent p = c = new Child();
					   // => Parent p = (Parent)Child c;
					   // 서브클래스 Child 타입 인스턴스 -> 슈퍼클래스 Parent 타입으로 형변환
					   // => 슈퍼클래스 타입 변수(p)가 서브클래스 인스턴스(c)를 참조함(가리킴)
				
				System.out.println("p와 c의 인스턴스가 동일한가?" + (p==c));
				
				// Parent 타입 레퍼런스 변수 p로 접근 가능한 메서드 : 1개
				p.parentPrn(); // 상속된 메서드(접근가능)
//				p.childPrn(); // 서브클래스에서 직접정의한 메서드(접근불가) => 오류발생
							  // => 슈퍼클래스 타입으로 업캐스팅 후에는 상속된(공통) 메서드만 호출 가능
							  // 	즉, 슈퍼클래스 타입으로 서브클래스 인스턴스를 참조하게 되면
							  //	참조 영역에 대한 축소로 인해 서브클래스 메서드가 보이지 않게 됨
				
				
				System.out.println("=========================================");
				
				
				
				
		/*
		 * 2. 다운캐스팅 (Down Casting, 명시적 형변환 ) 
		 * 
		 * - 서브클래스의 레퍼런스가 슈퍼클래스의 인스턴스를 참조하는 것
		 * 	 = 슈퍼클래스의 인스턴스를 서브클래스 타입으로 형변환하는 것
		 * - 참조 가능한 영역이 확대됨
		 * - 자동 형변환이 일어나지 않음 = 명시적(강제) 형변환 필요
		 * - 업캐스팅 한 번 한 후 사용할 수 있음 (한번 영역이 작아졌다가 다시 커지는 개념)
		 * - 강제형변환을 통해 구문오류가 해결되더라도
		 * 	 실제 실행 시점에서 오류(실행 오류)가 발생하게 됨
		 * 	 => 존재하지 않는 영역의 참조위험성 때문
		 * ==================================================================
		 * - 다운캐스팅 후에도 실행 시 오류가 발생할 수 있으므로
		 * 	 인스턴스의 클래스 타입과 참조하는 레퍼런스 변수의 상속관계를 고려하여 다운캐스팅을 수행해야한다.
		 * 
		 * 
		 * => (결론)
		 * 	  이전에 이미 업캐스팅 된 인스턴스(레퍼런스)를 다시 다운캐스팅하는 경우에만 안전하다!
		 * 	  (그 이외의 다운캐스팅은 인정되지 않는다!)
		 * 
		 */
				
				
				
				
				// 슈퍼클래스 Parent 타입 인스턴스(p2) 생성
				Parent0 p2 = new Parent0();
				
				
				// 슈퍼클래스 Parent 타입 변수 p2로 접근 가능한 메서드 : 1개
				p2.parentPrn();
				
				
				// 서브클래스 Child 타입 변수 c2 선언
				Child0 c2;
				
				
				// 서브클래스 타입 변수 c2에 슈퍼클래스 타입 인스턴스 전달
//				c2 = p2; // => Child c2 = Parent p2; => 컴파일러 에러발생!
						 // 슈퍼클래스 타입은 서브클래스 타입으로 자동형변환이 	불가능하다!
						 // => 반드시 형변환 연산자를 통해 명시적(강제) 형변환 필수!
//				c2 = (Child)p2; // Parent -> Child 타입으로 강제 형변환 = 다운캐스팅
								// BUT 이대로만 실행하면 에러발생..! 여기서부터 에러발생.
								// =>(이유)문법적 오류가 해결되더라도 실행시점에서 논리적 오류가 발생
								//   java.lang.ClassCastException:Parent cannot cast to Child
								//	 Child 타입 변수 c2는 접근 가능한 메서드 : 2개
//				c2.parentPrn(); //   실제 Parent 인스턴스에 존재하는 메서드
//				c2.childPrn();  //   실제 Parent 인스턴스에 존재하지 않는 메서드 
//								//   => 즉 존재하지 않는 영역에 대한 참조 위험성 때문에
								// 	    다운캐스팅이 기본적으로 불가능함
								// 	    메서드 호출시점이 아닌 다운캐스팅 시점에서 오류가 발생함
				
								// ==> 기본적으로 자바에서 다운캐스팅은 허용하지 않음!!!
				
				
				System.out.println("========================================");
				
				// 다운캐스팅이 가능한 경우
				// Child 타입 인스턴스를 Parent 타입 변수 p3에 전달 = 업캐스팅
				Parent p3 = new Child(); // 자동(묵시적)형변환 일어남
				
				
				// 업캐스팅에 의해서 참조영역이 축소되므로 접근 가능한 메서드 : 1개
				p3.parentPrn(); // 상속된(공통) 메서드
//				p3.childPrn(); // 상속되지 않은 (서브클래스에서 직접 정의한) 메서드 호출 불가!
				
				
				// 업캐스팅 된 Parent 타입 p3의 인스턴스(주소값)을 child 타입 변수 c3에 전달
//				Child c3 = p3; // 컴파일러 에러 발생! 명시적(강제) 형변환 필수!
				Child c3 = (Child)p3; // 다운캐스팅 수행
									  // 다운캐스팅에 의해 참조영역이 확대되므로 접근가능한 메서드 : 2개
				c3.parentPrn(); // 상속된 메서드
				c3.childPrn(); // 상속되지않은(서브클래스에서 직접정의한)메서드	
							   // => 다운캐스팅 후에도 아무런 문제없이 인스턴스 사용이 가능하다.
				
				
				
				
				
		}
	}
	
	
				class Parent0 {
					// Parent 클래스의 멤버 : 1개
					public void parentPrn() {
						System.out.println("슈퍼클래스의 parentPrn()");
					}
				}
				
				
				
				class Child0 extends Parent0 {
					// Child 클래스의 멤버 : 2개 (자신의 멤버 & 상속받은 멤버)
					public void childPrn() {
						System.out.println("서브클래스의 childPrn()");
					}
				}
			
			
			
			
			
			
			
			
			
			
			
