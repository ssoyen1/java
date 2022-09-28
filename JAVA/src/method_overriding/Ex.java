package method_overriding;

public class Ex {

	public static void main(String[] args) {
		 // 0927
			 
			// 상속기본개념 복습
			Student s1 = new Student(); // 자식 불러도 먼저 부모불러옴
			s1.name = "홍길동";
			
													//Person() 생성자 호출됨!
													//Student() 생성자 호출됨!
			
			System.out.println("--------------------------------");
			
			Student s2 = new Student("이순신", 44, false, true);
			s2.eat(); // Person 클래스로부터 상속받은 메서드
			s2.sleep(); // Person클래스로부터 상속받은 메서드
			s2.study(); // Student클래스
			
			
													//Person() 생성자 호출됨!
													//Student(String, int ,boolean, boolean) 생성자 호출됨!
													//밥먹기!
													//잠자기!
													//공부하기!

	}

}


			class Person {
				String name;
				int age;
				boolean isHungry;
				
				public Person() {
					System.out.println("Person() 생성자 호출됨!");
				}
				
				
				public void eat() {
					System.out.println("밥먹기!");
				}
				
				
				public void sleep() {
					System.out.println("잠자기!");
				}
			}
			
			
			
			class Student extends Person {
				boolean isStudyMode;
				
				public Student() {
//					super(); // Student()생성자가 호출되면 가장 먼저 슈퍼클래스인 Person 클래스의 기본 생성자가 자동으로 호출됨
					System.out.println("Student() 생성자 호출됨!");
				}
				
				
				// 이름, 나이 배고픔,공부모드를 전달받아 초기화하는 생성자
				public Student(String name, int age, boolean isHungry, boolean isStudyMode) {
//					super(); // Student(String, int ,boolean, boolean) 생성자가 호출되면
							 // 가장먼저 슈퍼클래스인 Person 클래스의 기본 생성자가 자동으로 호출됨.
					System.out.println(" Student(String, int ,boolean, boolean) 생성자 호출됨!");
					this.name = name; // 매개변수 작성칸 안에 newName을 적었을 경우, this를 적을 필요는 없음.
					this.age = age;
					this.isHungry = isHungry;
					this.isStudyMode = isStudyMode;
				}
				
				
				public void study() {
					System.out.println("공부하기!");
				}
				
				
			}
			
			
			
			
			
			
			
			
			
			
			