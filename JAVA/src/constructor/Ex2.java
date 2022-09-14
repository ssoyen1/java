package constructor;

public class Ex2 {

	public static void main(String[] args) {
		// 매개변수가 들어가는 생성자
		/*
		 * 파라미터 생성자
		 * 
		 * - 생성자 호출 시점에서 전달해야할 데이터가 있을 경우
		 * 	 생성자 파라미터(매개변수)를 선언할 수 있음(= 메서드와 동일)
		 * - 전달받은 데이터는 인스턴스 변수를 초기화하는 용도로 사용
		 * - 즉, 객체(인스턴스)마다 다른 데이터를 가진 채로 인스턴스를 생성하기 위해 사용
		 * 
		 *  < 파라미터 생성자 정의 기본 문법 >
		 *  [접근제한자] 클래스명(매개변수선언..) { 매개변수를 선언하는 파라미터
		 *  		// 생성자 호출 시점에 파라미터에 데이터를 전달하여
		 *  		// 인스턴스 내의 인스턴스 변수(멤버변수)를 초기화함
		 *  		// 인스턴스변수명(멤버변수명) = 매개변수명(데이터)
		 *  }
		 * 
		 *  => 파라미터 생성자 자동 생성 단축기 : Alt + Shift + S -> O
		 *     (단, 멤버변수가 하나도 없을 경우 자동 생성차이 실행되지 않음)
		 *     
		 * 
		 */
		
		

		
//		Person2 p = new Person2(); // 오류발생! 
								   //  => The constructor Person2() is undefined
								   //  <= 밑에 Person2(String, int) 만든거에 맞춰서 만들어줘야함
								   //     컴파일러에 의해 기본 생성자가 자동으로 생성되지 않기 때문에
								   //     기본 생성자를 호출할 수 없게 된다!
		Person2 p = new Person2("홍길동",20); // O
											//Person2(String, int) 생성자 호출됨!
		p.showPersonInfo();
											//이름 : 홍길동
											//나이 : 20
											//국가 : 대한민국

		Person2 p2 = new Person2("이순신",44);
		p2.showPersonInfo();
											//이름 : 이순신
											//나이 : 44
											//국가 : 대한민국
	}

}

	class Person2 {
		// 멤버변수 선언(= 인스턴스 변수, 필드)
		String nation;
		String name;
		int age;
		
		
		// (1-1) 나라, 이름, 나이를 전달받아 초기화하는 파라미터 생성자 정의
		// 생성자를 정의하지 않으면 기본 생성자가 자동으로 생성됨
//		public Person2() {} // 기본 생성자
		public Person2(String newName, int newAge) { // 변수명은 별로 중요하지 않고, 데이터타입이 중요함
													 // 순서가 다르면 다른 생성자가 됨
			System.out.println("Person2(String, int) 생성자 호출됨!"); 
			
			// 전달받은 파라미터값을 인스턴스 변수에 저장
			name = newName; // 위에서 전달받은 정보가 String newName에 들어가고 그게 name=newName; 으로 들어옴
			age = newAge;
			
			// 만약, 국가명(nation)은 무조건 "대한민국"으로 고정하고 싶을 경우
			// 별도로 파라미터값을 전달받지 않고 생성자 내에서 "대한민국"으로 초기화
			nation = "대한민국";
			
		}
		
		// (1-2) 파라미터 생성자 자동 단축키 : Alt + Shift + S -> O
		public Person2(String nation, String name, int age) {
			this.nation = nation; // 단축기 이용하면 this붙음
			this.name = name;	  // 멤버변수(왼, this붙은것), 매개변수(오) 이름 구별가능
			this.age = age;
		}
		
		
		// (2) 사람를 출력하는 showPersonInfo() 메서드 정의
		public void showPersonInfo() {
			System.out.println("이름 : " + name );
			System.out.println("나이 : " + age );
			System.out.println("국가 : " + nation );
		}


		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	