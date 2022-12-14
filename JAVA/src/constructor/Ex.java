package constructor;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 생성자 (Constructor)
		 * 
		 * - 클래스를 사용하여 인스턴스를 생성할 때 호출되는 메서드 형태
		 * 	 => new 키워드 뒤에 생성자 호출코드가 기술됨
		 * - 주로 인스턴스 변수를 초기화하는 용도 또는 
		 * 	 인스턴스 생성 시 초기에 수행할 작업을 기술하는 용도
		 * - 메서드 형태와 유사하나 차이점 두 가지 존재
		 *   1) 선언부에 리턴타입이 없음
		 *   	(리턴값이 없는 것이 아니라 리턴타입 자체를 기술하지 않음)
		 *   2) 생성자 이름이 클래스 이름과 동일함
		 * - 개발자가 클래스 정의 시 생성자를 하나도 정의하지 않으면
		 *   컴파일러에 의해 자동으로 기본(Default) 생성자가 생성됨
		 * - 메서드와 유사한 형태이므로 파라미터가 있을 수도 없을 수도 있음  
		 * - 생성자를 별도로 호출할 수 없으며, 반드시 new 키워드 뒤에만 지정할 수 있음
		 * 
		 * 
		 * < 생성자 정의 기본 문법 >
		 * [접근제한자] 클래스명([매개변수선언...]) {
		 * 		// 생성자 호출 시점(인스턴스 생성 시점)에 수행할 작업을 기술
		 *		// => 인스턴스 변수 초기화 등
		 * }
		 * 
		 * 
		 * < 인스턴스 생성 기본 문법 >
		 * 클래스명 참조변수명 = new 생성자명([데이터...]); // 매개변수를 넘겨줌?
		 * 
		 * 
		 * 객체(iv묶음) = 인스턴스 초기화 메서드
		 * 			 = iv 초기화
		 * 
		 * 모든 클래스는 반드시 생성자를 가져야한다.(1개 이상)  
		 * 
		 * 
		 */
		
			System.out.println("Person 인스턴스 생성 전");

			Person p = new Person(); //개발자가 클래스 정의 시 생성자를 하나도 정의하지 않으면
									 //컴파일러에 의해 자동으로 기본(Default) 생성자가 생성됨
			// => new키워드에 의해 인스턴스가 생성될 때
			//	  Person() 형태의 생성자를 자동으로 호출하게 된다!
			
//			p.Person(); // 오류발생! 주의! 생성자를 별도로 호출할 수 없다.
			
			System.out.println("Person 인스턴스 생성 후");
														//Person 인스턴스 생성 전
														//생성자 Person() 호출됨!
														//Person 인스턴스 생성 후
//			p.name="홍길동";
//			p.age = 20;
			System.out.println("이름 : " + p.name);  // public Person() { 내에 값을 이미 넣었으므로 바로 호출하면 됨
			System.out.println("나이 : " + p.age);
			
														//이름 : 홍길동
														//나이 : 20
			
			System.out.println("----------------------------");
			
			
			Person p2 = new Person();
			p2.name = "이순신";  // 이것처럼 이름이나 나이 따로 안적으면 위에 홍길동 똑같이 출력됨
			p2.age = 44;
			System.out.println("이름 : " + p2.name);
			System.out.println("나이 : " + p2.age);
			
			
	}

}

 class Person {
	 String name;
	 int age;
	 
	 // 클래스 정의 시 개발자가 별도의 생성자를 정의하지 않으면
	 // 자바 컴파일러에 의해 기본 생성자가 자동으로 생성됨.
	 // => 기본 생성자는 접근제한자가 클래스와 같고,
	 //	   리턴타입이 없으며, 이름은 클래스와 같다.
	 //	   또한, 매개변수가 없으며 중괄호 블록 {} 내에 수행할 코드가 없다.	   
//	 public Person() {} // 기본 생성자(Default Constructor)
	 
//	 public Person() {
//		 // 기본 생성자 내에서 생성자 호출 확인을 위한 출력문 작성 
//		 System.out.println("생성자 Person() 호출됨!");
		 
//	 }
	 
	 public Person() {
		 System.out.println("생성자 Person() 호출됨!");
		 //인스턴스 변수 name에 "홍길동"을 저장, age에 20 저장 (미리 값을 넣을 수 있음)
		 
		 name = "홍길동";
		 age = 20;
	 }
 }













