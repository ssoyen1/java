package access_modifier;

public class Person {
		// 외부에서 멤버변수의 접근이 불가능하도록 private 접근제한자 적용
		private String name; // 원래 외부에서 p. 까지 적으면 바로 떴음! 
		private int age;	 // : 누군가에 소속된게 아니라 Person에 저장한 것.
		
		
		// 멤버변수에 대신 접근하도록 Getter/Setter 메서드 정의(public 접근제한자 사용)

		// 1. Getter 메서드 정의
		// 	  => 파라미터는 없고, 리턴값만 있는 메서드
		
		// String 타입 멤버변수 name에 대한 Getter 메서드
		public String getName() {
			// 멤버변수 name 값을 외부로 리턴
			return name;
		}
		
		
		
		// int 타입 벰버변수 age에 대한 Getter 메서드
		public int getAge() {
			// 멤버변수 age 값을 외부로 리턴
			return age;
		}
		
		
		
		// 2. Setter 메서드 정의
		//	  => 파라미터만 있고, 리턴값은 없는 메서드
		// String 타입 멤버변수 name에 대한 Setter 메서드 정의
		public void setName(String newName) { 
			// 외부로부터 전달받은 name 값(로컬변수(자주색) newName)을 멤버변수 name에 저장
			//setName("hong")하면 그 값을 멤버변수 name에 저장?
			name = newName;
		}	
		
		// int 타입 멤버변수 age에 대한 Setter 메서드 정의
		public void setAge(int newAge) { 
			
			age = newAge;
		}
		
//=================================================================	
		// Getter/Setter 단축기를 통한 정의
		// => alt + shift + s -> r
		
		
//		public void setAge(int newAge) { 
//			this.age = age;  // this = 자기자신을 지칭 (person)
							 // 	   매개변수의 이름과 같을 때 사용
//		}
		
		
		
		
}















