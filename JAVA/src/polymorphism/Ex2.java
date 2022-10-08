package polymorphism;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 0929
		 * 
		 * instanceof 연산자
		 * 
		 * - 좌변의 객체(참조변수)가 우변 클래스의 타입인지 판별하는 연산자
		 * - 참조변수가 부모 객체를 참조하는지 자식객체를 참조하는지를 판별할 수 있음.
		 * - 판별결과가 true이면 형변환이 가능한 관계(업캐스팅or 다운캐스팅)
		 * 	 판별결과가 false이면 절대로 형변환 불가
		 * - 우변의 클래스 타입과 같거나 우변 클래스 타입의 자식 타입 모두 가능
		 * - A is a B = A instanceof B
		 * - 판별결과를 boolean타입 변수에 저장하거나 
		 * 	 if문에 판별하는 문장을 직접 사용가능
		 * 
		 * < 기본 문법 >
		 * if(A instanceof B) { // A는 참조변수(객체), B는 클래스명(타입)
		 * 			// true : 형변환이 가능한 관계이므로 변환 수행
		 * } else {
		 * 			// false : 절대로 형변환이 불가능한 관계이므로 변환 수행X
		 * }
		 * 
		 * 
		 */
		
			SmartPhone sp = new SmartPhone("갤럭스 z플립4", "010-1234-5678", "안드로이드");
			
			// 호출가능한 메서드 : 3개
			sp.call();
			sp.sms();
			sp.kakaoTalk();
			
			// sp는 SmartPhone 입니까? YES
			// sp is a SmartPhone?
			if(sp instanceof SmartPhone) {
				System.out.println("sp는 SmartPhone이다.");
				// sp를 smartPhone 타입 변수에 저장이 가능하다!
				SmartPhone phone = sp; // SmartPhone으로 되어있는 어떠한 변수에 sp를 넣을 수 있는가? YES
			} else {
				System.out.println("sp는 SmartPhone이 아니다.");
			}
			
			
			System.out.println("----------------------------------");
			
			
			
			// 업캐스팅 가능 대상 확인
			// sp는 HandPhone 입니까? YES (SmartPhone(ps) is a HandPhone)
			if(sp instanceof HandPhone) {
				System.out.println("sp는 HandPhone이다!");
				System.out.println("그러므로 sp를 HandPhone으로 형변환 가능하다!");
				
				HandPhone hp = sp; //HandPhone의 어떤 변수에 sp를 대입할 수 있다.
								   // sp -> HandPhone탕비(hp)으로 벼환
								   // 업캐스팅 = 묵시적(자동) 형변환
				System.out.println("sp는 HandPhone이 가진 모든 기능을 포함한다.");
				System.out.println("따라서, 업캐스팅 이후에도 HandPhone의 기능 사용가능");
				
				hp.call(); // HandPhone의 기능인 전화기능과
				hp.sms();  // 문자기능을 사용할 수 있으나
//				hp.kakaoTalk(); // SmartPhone의 기능은 사용을 포기해야한다.
				
				
			} else {
				System.out.println("sp는 HandPhone이 아니다!");
			}
			
			
			System.out.println("---------------------------------------");
			
			
			
			// 다운캐스팅 가능 대상 확인
			// 슈퍼클래스 타입 인스턴스 생성
			HandPhone hp = new HandPhone("애니콜", "011-2222-2222");
			
			
			//hp는 SmartPhone 입니까? No (hp는 SmartPhone이 아니다!)
			if(hp instanceof SmartPhone) {
				System.out.println("hp는 SmartPhone이다!");
			} else {
				System.out.println("hp는 SmartPhone이 아니다!");
				System.out.println("그러므로 SmartPhone으로 변환 불가능!");
				System.out.println("hp는 SmartPhone이 가진 기능을 모두 포함하지 못함!");
				
			}
			
			System.out.println("-----------------------------------------");
			
			
			
			// 다운캐스팅 가능 대상 확인(가능한 경우)
			// SmartPhone -> HandPhone 타입(hp2)으로 업캐스팅
			HandPhone hp2 = new SmartPhone("갤럭시노트20","010-1234-5678", "안드로이드");
			
			
			// 업캐스팅 후에는 참조 영역 축소로 접근 점위가 줄어들게 됨
			hp2.call();
			hp2.sms();
//			hp2.kakaoTalk(); // 접근 불가
			
			
			// hp2는 SmartPhone 입니까?
			if(hp2 instanceof SmartPhone) {
				
			} else {
				
			}

	}

}



			class HandPhone {
				String modelName;
				String phoneNumber;
				
				
				// 파라미터 생성자 만들기 (alt shift s + o)
				public HandPhone(String modelName, String phoneNumber) {
					super();
					this.modelName = modelName;
					this.phoneNumber = phoneNumber;
				}
				
				
				public void call() {
					System.out.println("전화 기능!");
				}
				
				
				public void sms() {
					System.out.println("문자 기능!");
				}
				
			}
			
			
			
			class SmartPhone extends HandPhone {
				String osName;
				
				
				// 모델명, 전화번호, 운영체제명을 전달받아 초기화를 하는 생성자 정의
				// => 모델명과 전화번호는 슈퍼클래스의 생성자를 통해 대신 초기화 수행
				public SmartPhone(String modelName, String phoneNumber, String osName) {
					super(modelName, phoneNumber);
					this.osName = osName;
				}
				
				
				public void kakaoTalk() {
					System.out.println("카톡 기능!");
				}
			}
			
			
			
			
			
			
			
			
			