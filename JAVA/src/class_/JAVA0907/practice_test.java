package class_.JAVA0907; 

public class practice_test{

	public static void main(String[] args) {
		// Person 클래스의 인스턴스(p) 생성
		Person1 p1 = new Person1();
		// 이름 : 홍길동, 나이 : 20, 배고픔 : false 값 저장
		// 외부의 다른 클래스에서 Person 클래스의 인스턴스에 접근하기 우해서는
		// 참조변수 p를 통해서만 접근 할 수 있음! 
		p1.name = "홍길동";
		p1.age = 20;
		p1.isHungry = false;
		
		System.out.println("이름 : "+p1.name);
		System.out.println("나이 : "+p1.age);
		System.out.println("배고픔 : "+p1.isHungry);
		
		p1.showPersonInfo();
		p1.eat("집밥");
		p1.talk();
		
		// 참조변수 p를 통해 멤버변수는 물론 메서드까지 접근 가능
		
	} // main() 메서드 끝

} // Test 클래스 끝 ( 새로운 클래스 만들거면 이 클래스가 끝난 후 작성해야함)

		



			
				/*
				 * Person 클래스 정의
				 * [멤버변수(인스턴스 변수) 선언]
				 * - 이름(name, String)
				 * 	 나이(age, int)
				 *   배고픔(isHungry, boolean)
				 *   
				 * [ 메서드 정의 ]
				 * - 이름, 나이, 배고픔을 출력하는 showPersonInfo() 메서드
				 * 	 (매개변수 없음, 리턴값 없음)
				 * 
				 * - 밥먹는 기능을 수행하는 eat() 메서드
				 * 	 (매개변수 : 음식이름(foodName, 문자열), 리턴값 없음)
				 * 	  => "XXX 먹기!" 출력
				 * 	  => 멤버변수 isHungry의 값을 false 값으로 변경
				 * 
				 * - 말하는 기능을 수행하는 talk() 메서드
				 * 	 (매개변수 없음, 리턴값 없음)
				 * 	 => "말하기!" 출력
				 * 	 => 멤버변수 isHungry 의 값을 true 값으로 변경
				 * 
				 */
			class Person1 {
				 // 멤버변수(인스턴스변수) 선언
				String name;
				int age;
				boolean isHungry;
				
				
				public void showPersonInfo() {
					System.out.println("이름 : "+name);
					System.out.println("나이 : "+age);
					System.out.println("배고픔 : "+isHungry);
				}
				
				
				public void eat(String foodname) {
					System.out.println(foodname+"먹기!");
					isHungry = false;
					System.out.println("식사 후 배고픔 : isHungry");
				}
				
				public void talk() {
					System.out.println("말하기");
					isHungry = true;
					System.out.println("말한 후 배고픔 : isHungry");
				}
				
				
			
				
			}
			
			
			
			
			
			






