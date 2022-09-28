package access_modifier_p1;

public class ParentClass {
		/*  0928
		 * 접근제한자 : 멤버에 대한 접근 범위를 제한하는 키워드
		 * (넓음) pulic > protected > default > private (좁음)
		 * 1. public : 모든 패키지의 모든 클래스에서 접근 가능 (=누구나)
		 * 2. protected : 같은 패키지이거나 다른패키지의 서브클래스에서 접근 가능한 형태
		 * 3. default :  같은 패키지에서만 접근 가능 (=다른 패키지에서 접근 불가)
		 * 4. private : 자신의 클래스에서만 접근 가능 (= 다른 패키지에서 접근 불가)
		 * 
		 * 
		 */
	
	
			// 접근제한자에 따른 접근 범위 차이
			public int publicVar;			// 누구나 다 
			protected int protectedVar;		// (같은패키지) 다 됨  / (다른패키지) 상속관계 일 때
			int defaulVar; // 디폴트 접근제한자는 비워두면 됨
			private int privateVar;
			
			
			
			public void useMember() { // public 생략가능
				// 자신의 클래스 내의 멤버에 접근 시 아무런 제약이 없음
				this.publicVar = 10;		//public(O)
				this.protectedVar = 20;		//protected(O)
				this.defaulVar = 30;		//default(O)
				this.privateVar = 40;		//private(O)
			}

}
