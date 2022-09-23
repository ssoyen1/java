package this_;

public class Ex {

	public static void main(String[] args) {
		/*각종 변수들
		 * https://doya-life.tistory.com/entry/%EA%B0%9C%EB%85%90%EC%9D%B4%ED%95%B4-%EB%A9%A4%EB%B2%84%EB%B3%80%EC%88%98%EC%9D%B8%EC%8A%A4%ED%84%B4%EC%8A%A4-%EB%B3%80%EC%88%98-%EC%A7%80%EC%97%AD%EB%B3%80%EC%88%98%EB%A1%9C%EC%BB%AC%EB%B3%80%EC%88%98-static%EB%B3%80%EC%88%98%ED%81%B4%EB%9E%98%EC%8A%A4%EB%B3%80%EC%88%98-%EC%B0%B8%EC%A1%B0%EB%B3%80%EC%88%98-%EB%A7%A4%EA%B0%9C%EB%B3%80%EC%88%98
		 * 
		 * 
		 *
		 * this 키워드
		 * - 자신의 인스턴스 주소값을 저장하는 참조 변수
		 * 	 => 개발자가 생성하는 것이 아니라 자바에 의해 자동으로 생성됨
		 * - 모든 인스턴스 내에는 this가 존재하며, 자신의 인스턴스 주소가 저장됨
		 * 	 => 즉, 인스턴스마다 this에 저장된 값이 다름
		 * 
		 * 
		 * 1. 레퍼런스 this (참조this)
		 * - 자신의 인스턴스 내의 멤버에 접근(멤버변수 or 멤버메서드)
		 * - 주로, 로컬변수와 인스턴스 변수(=멤버변수)의 이름이 같을 때
		 * 	 인스턴스변수를 지정하는 용도로 사용
		 * 
		 * 
		 * 
		 * < 레퍼런스 this 사용 기본문법>
		 *  자신의 클래스 내의 생성자 또는 메서드 내에서 
		 *  this.인스턴스변수 또는 this.메서드() 형태로 접근
		 * 
//		 */
//			Person p = new Person();
//			p.
//			
			Person p = new Person("홍길동",20);
			p.showPersonInfo();
											//이름 : 홍길동
											//나이 : 20
			
			p.setName("이순신"); // 다른 이름을 넣고 싶을 때
			p.setAge(44);
			p.showPersonInfo();
											//이름 : 이순신
											//나이 : 44

		

	}

}

			class Person {
				private String name;
				private int age;
				
				
			   // 멤버변수 Getter/Setter 메서드 정의
			   // Alt + Shift + S -> R
			   public String getName() {
				   // 로컬변수와 멤버변수의 이름이 중복되지 않으므로
				   // 러퍼런스 this를 생략 가능
				   return name; // return this.name;과 동일함
			   }
				
				
			   public void setName(String name) {
				      // 메서드 내에서 로컬변수와 클래스 내의 멤버변수의 이름이 동일할 경우
				      // 메서드 내에서 변수 지정 시 로컬변수가 지정
				      this.name = name; // 로컬변수 name 값을 다시 멤버변수 name에 저장하는 코드
				      
				      // 로컬변수와 멤버변수를 구별하기 위해서는 멤버변수명 앞에
				      // 레퍼런스 this를 사용하여 해당 인스턴스에 접근하는 코드로 사용해야함
				      // => 외부에서 멤버변수 name에 접근 시 참조변수명.name 형태로 접근하듯이
				      // 내부에서 멤버변수 name에 접근 시 this.name 형태로 접근
				   }
			   
			   public int getAge() {
				   // 로컬변수와 멤버변수의 이름이 중복되지 않으므로
				   // 러퍼런스 this를 생략 가능
				   return age; // return this.name;과 동일함
			   }
			   
			   
			   public void setAge(int age) {
				      // 메서드 내에서 로컬변수와 클래스 내의 멤버변수의 이름이 동일할 경우
				      // 메서드 내에서 변수 지정 시 로컬변수가 지정
				      this.age = age;
			   }

				// 이름, 나이를 전달받아 초기화하는 생성자 정의
				// Alt + Shift + S -> O
				public Person(String name, int age) {
					this.name = name; //this를 지우면 name을 로컬변수로 간주함(로컬변수 : 제일우선순위가 높음)
									  // 그대로 출력했을때 아무것도 안나옴. 멤버변수로 간주되어야 나옴(파란색)
									  // (this.name = name) = (Person.name)
					this.age = age;
				}
				
				
				// showPersonInfo() 메서드를 정의하여 이름과 나이를 출력
				public void showPersonInfo() {
					// 클래스 내의 메서드에서 멤버변수에 접근하기 위해 멤버변수 이름 지정
					System.out.println("이름 : " + name);
					System.out.println("나이 : " + age);
				}
				
				
			}