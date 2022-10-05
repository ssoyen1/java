package polymorphism;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 *  다형성 (polymorphism)
		 *  
		 *  - 하나의 데이터타입(참조변수)으로 여러 인스턴스를 참조하는 특성
		 *  - 어떤 인스턴스를 업캐스팅하여 슈퍼클래스 타입 변수로 다루면
		 *    하나의 슈퍼클래스 타입으로 여러 서브클래스 타입 인스턴스를 다룰 수 있음
		 *    
		 * 
		 */
			
		
			// Circle(c) 인스턴스 생성
			Circle c = new Circle();
			c.circlePaint(); //원 그리기!

			
			// Rectangle(r) 인스턴스 생성
			Rectangle r = new Rectangle();
			r.rdraw(); //사각형 그리기!
			
			
			// Triangle(t) 인스턴스 생성 
			Triangle t = new Triangle();
			t.design(); //삼각형 그리기!
			
			System.out.println("---------------------");
			
			
			// 슈퍼클래스의 메서드를 상속받아 오버라이딩 하는 경우
			// 코드의 통일성이 향상될 수 있다!
			c.draw(); //원 그리기!
			r.draw(); //사각형 그리기!
			t.draw(); //삼각형 그리기!

			
			System.out.println("---------------------");
			
			
			// 코드의 통일성을 더 향상시키기 위한 방법 : 업캐스팅 활용
			// => Circle, Rectangle, Triangle 의 공통 슈퍼클래스인 
			//	  Shape타입(s)으로 세 인스턴스를 컨트롤 가능
			//	  Circle -> Shape 업캐스팅
			Shape s = new Circle();
			s.draw(); // 동적바인딩에 의해 Circle 인스턴스의 draw() 메서드 호출
			
			
			// Rectangle -> Shape 업캐스팅
			s = new Rectangle();
			s.draw(); // Rectangle 인스턴스의 draw() 메서드 호출
			
			
			// Triangle -> Shape 업캐스팅
			s = new Triangle();
			s.draw();
			
			System.out.println("============================");
			
			
			// 다형성을 배열에 적용시키는 경우
			// => 슈퍼클래스 타입으로 배열을 생성하여
			//	  배열의 각 인덱스에 각각의 서브클래스 인스턴스를 저장 가능
			
			//(1)
//			int[] nums = new int[3]; // 정수타입의 무언가를 넣겠다
//			Shape[] sArr = new Shape[3]; // 셰입타입의 무언가를 넣겠다.
//										 // 안에 Circle,Shape,Rectangle,Triangle을 넣겠다.
//										 // Shape타입 배열을 생성(크기가 3)
//			
//			
//			// 0번 인덱스에 Circle 인스턴스를 생성하여 저장 
//			sArr[0] = new Circle(); // 참조변수개념. Circle -> Shape에 업캐스팅
//			
//			
//			// 1번 인덱스에 Rectangle 인스턴스를 생성하여 저장 
//			sArr[1] = new Rectangle(); // Rectangle -> Shape 업캐스팅
//			
//			
//			// 2번 인덱스에 Triangle 인스턴스를 생성하여 저장
//			sArr[2] = new Triangle();
			
			
			
			
			//(2) 위보다 더 쉬운 방법
			
			Shape[] sArr = {new Circle(), new Rectangle(), new Triangle()};
			// 배열의 각 인덱스에는 인스턴스 주소가 저장되므로
			// 참조변수와 마찬가지로 배열명[인덱스].메서드명() 형태로 호출 가능
//			sArr[0].draw();
//			sArr[1].draw();
//			sArr[2].draw();
			
			for(int i=0; i<sArr.length; i++) {
				sArr[i].draw(); //원 그리기!
								//사각형 그리기!
								//사각형 그리기!
			}
			
			System.out.println("==================================");
			
			// 메서드에 다형성 활용
			// 1. 이미 다형성이 적용된 배열을 메서드 파라미터로 전달
			
//			Ex2 ex = new Ex2(); // 밑의 public void polymorphismDraw()에 접근하기 위해서
								// 해당 인스턴스에 접근할 수 있는 참조변수 명으로..
								// Ex2 클래스 안에 있는 것임에도 접근하려면 인스턴스? 만들어줘야하는것.
								// 만약 이게 shape 클래스 안에 있었다면 shape 인스턴스를 만들어줘야함
								// ex) Shape s2 = new Shape();
								// static메서드로 정이 된 것이라면  [클래스명.메서드]
//			ex.polymorphismDraw(); // static 이 설정되지 않은 '인스턴스 메서드'를 호출하는 경우 
								   // 먼저 인스턴스를 생성하고 호출할 수 있다!
								   // 반면, static이 설정되어 있는 '클래스(정적)메서드'를 호출하는 경우
								   // 인스턴스를 생성하지 않아도 클래스.메서드 형태로 호출 가능!
								   // 이 때, 자신의 클래스 내부에서 정의한 클래스(정적)메서드 라면
								   // 클래스명은 생략도 가능하다.
			polymorphismDraw(sArr);
			
			
			// 2. 메서드 파라미터로 인스턴스를 전달
			polymorphismDraw2(new Circle());
			polymorphismDraw2(new Rectangle());
			polymorphismDraw2(new Triangle());
			
	} // main() 메서드 끝

	
	
	public static void polymorphismDraw(Shape[] sArr) {
		// 반복문을 사용하여 배열 내의 모든 인스턴스의 draw() 메서드를 호출
		for(int i=0; i<sArr.length; i++) {
			sArr[i].draw(); //원 그리기!
							//사각형 그리기!
							//사각형 그리기!
		}
	}
	
	public static void polymorphismDraw2(Shape s) {
		// 어떤 인스턴스가 전달되더라도 draw() 메서드는 공통이므로 호출 가능!
		s.draw();
	}
	
	
	
	
} // Ex2 클래스 끝

			// 여러 도형의 특징을 공통적으로 포함하는 슈퍼클래스 Shape 정의
			class Shape {
				// 여러 도형의 공통점인 '그리다'기능을 수행하는 draw() 메서드 정의
				public void draw() {
					System.out.println("도형 그리기!");
					
				}
			}
			
			
			
			// Shape 클래스를 상속받는 Circle 클래스 정의
			class Circle extends Shape {
				
				public void circlePaint() {
					System.out.println("원 그리기!");
				}

				@Override
				public void draw() {
					System.out.println("원 그리기!");
				}
			}
			
			
			
			// Shape 클래스를 상속받는 Rectangle 클래스 정의
			class Rectangle extends Shape {
				
				public void rdraw() {
					System.out.println("사각형 그리기!");
				}

				@Override
				public void draw() {
					System.out.println("사각형 그리기!");
				}
				
				
			}
			
			
			
			// Shape 클래스를 상속받는 Triangle 클래스 정의
			class Triangle extends Shape {
				
				public void design() {
					System.out.println("삼각형 그리기!");
				}

				@Override
				public void draw() {
					System.out.println("사각형 그리기!");
				}
				
				
			}
			
			
			
			
			
			
			
			
			