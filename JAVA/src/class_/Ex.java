package class_;

public class Ex {

	// main() 메서드는 자바 프로그램의 시작점이다 !
	// => main() 메서드에서부터 객체를 생성하고 사용할 수 있다1
	// 단, main() 메서드에서만 가능한 것은 아니고
	// main() 메서드가 호출하는 다른 메서드에서도 사용 가능
	
	public static void main(String[] args) {
		/*
		 * 정의한 클래스는 설계도에 해당하므로 실제 사용을 하기 위해서는
		 * 반드시 실체(= 객체)를 생성해야한다 ! 
		 * => 클래스를 사용하여 메모리에 생성된 객체(실체)를 만들게 되고,
		 * 	  이를 인스턴스(Instance)라고 함
		 * 
		 * < 클래스에 대한 인스턴스 생성 기본 문법 > 
		 * 클래스 변수명 = new 클래스명();
		 */
		
				// < Animal 클래스의 인스턴스 생성 >
				// 1. Animal 클래스 타입 참조변수 선언 (변수 앞에 클래스명 적어줌)
		//		Animal ani;
				
				// 2. Animal 클래스 인스턴스 생성 및 주소값 저장
		//		ani = new Animal();
				
				// 위의 두 문장을 한 문장으로 결합
				Animal ani = new Animal(); //new 사용하여 인스턴스 생성가능
				
				
				
				
				
				// < Animal 인스턴스에 접근하여 멤버변수 사용 및 메서드 호출 >
				// => 인스턴스 접근을 위해서는 반드시 인스턴스 주소가 필요하며,
				// 	  인스턴스 주소를 담고 있는 참조변수(ani)를 통해 접근이 가능함
				
		
				// 1. Animal 인스턴스의 멤버변수 name 과 age 에 값 저장
		//		name = "멍멍이"; // 존재하지 않는 변수이므로 사용 불가! 
				// => 반드시 '참조변수명(인스턴스를 찾아가기위한 용도).멤버변수명' 형태로 접근해야 함 !!
				ani.name = "멍멍이"; // ani 인스턴스의 멤버변수 name 에 "멍멍이" 저장
				System.out.println("이름 : "+ ani.name); //이름 : 멍멍이
				
				ani.age = 3;
				System.out.println("나이 : "+ ani.age); //나이 : 3
				
				
				// 2. Animal 인스턴스의 메서드 cry() 호출
				// => 리턴값이 없는 메서드이므로 메서드만 호출
				// => 매개변수가 없는 메서드이므로 소괄호() 안에 아무것도 명시하지 않음
				ani.cry();
													//		이름 : 멍멍이
													//		나이 : 3
													//		동물 울음 소리
				
				System.out.println("---------------------------------");
				
				// Animal 클래스의 두번째 인스턴스(ani2) 생성
				// => 멤버변수 초기화 - 이름 : 냐옹이, 나이 : 2
				Animal ani2 = new Animal();
				ani2.name = "냐옹이";
				ani2.age = 2;
				System.out.println("이름 : "+ ani2.name);
				System.out.println("나이 : "+ ani2.age);
				ani2.cry();
													//		이름 : 냐옹이
													//		나이 : 2
													//		동물 울음 소리
				
				
				
				//----------------------------------------------------------
				// 위의 두 인스턴스(ani, ani2) 구조
				//----------------------------------------------------------
				// new
				// Animal 클래스 => 인스턴스1(ani)  인스턴스2(ani2)
				// 이름(name)	   "멍멍이"		 "냐옹이"
				// 나이(age)			3			  2
				//----------------------------------------------------------
				
				System.out.println("==================================");
	 			
				
				// Car 클래스의 인스턴스 (car) 생성 및 멤버변수 초기화 후 출력
				// 제조사 : 현대
				// 모델명 : 그랜져
				// 배기량 : 3000
				Car car = new Car(); // 대문자 소문자 잘 구별해서 적기
				// => Heap 공간에 생성된 인스턴스 주소가 참조변수 car 에 저장
				
				car.company = "현대";
				car.modelName = "그랜져";
				car.cc = 3000;
				System.out.println("제조사 : "+ car.company);
				System.out.println("모델명 : "+ car.modelName);
				System.out.println("배기량 : "+ car.cc);
				
				car.speedUP();
				car.speedDown();
				
													//		제조사 : 현대
													//		모델명 : 그랜져
													//		배기량 : 3000
													//		자동차 속력 증가!
													//		자동차 속력 감소!
				
				System.out.println("==================================");
				
				
				
				// Student 클래스 인스턴스 생성
				// - 이름 : "홍길동", 번호 : 1, 과정명 : "핀테크 디지털 금융서비스 자바 개발자"
				Student s1 = new Student();
				s1.name = "홍길동";
				s1.id = 1;
				s1.className = "핀테크 디지털 금융서비스 자바 개발자";
				System.out.println("이름 : "+ s1.name);
				System.out.println("번호 : "+ s1.id);
				System.out.println("과정명 : "+ s1.className);
				
				s1.study("자바");
				s1.rest();
									//				이름 : 홍길동
									//				번호 : 1
									//				과정명 : 핀테크 디지털 금융서비스 자바 개발자
									//				자바과목 공부!
									//				휴식
				// - 이름 : "이소연", 번호 : 2, 과정명 : "핀테크 디지털 금융서비스 자바 개발자"
				Student s2 = new Student();
				s2.name = "이소연";
				s2.id = 2;
				s2.className = "핀테크 디지털 금융서비스 자바 개발자";
				System.out.println("이름 : "+ s2.name);
				System.out.println("번호 : "+ s2.id);
				System.out.println("과정명 : "+ s2.className);
				
				s2.study("JAVA");
				
						
					} // main() 메서드 끝
				
				} // Ex 클래스 끝
				
				// 하나의 java 파일 내에 여러개의 클래스를 정의할 수 있다 ! 
				// => 단! 파일명과 동일한 이름의 클래스 외에는 **public 키워드를 붙일 수 없다 !** 
				// 학생(Strudent) 클래스 정의
				// 속성 : 이름(name, 문자열), 번호(id, 정수), 과정명(className, 문자열)
				// 1) 공부(study()) - 리턴값 없음, 매개변수 - 과목명(className, 문자열)
				// 				   => "XXX 과목 공부!" 출력
				 class Student {
					// 멤버변수 선언
					String name;
					int id;
					String className;  // 만들면 위에서 활용할 수 있음 
					
					// 메서드 정의 
					public void study(String subjectName) {
						// 전달받은 파라미터 값을 사용하여 출력
						System.out.println(subjectName + "과목 공부!");
					}
					
					public void rest() {
						System.out.println("휴식!");
					}
				}