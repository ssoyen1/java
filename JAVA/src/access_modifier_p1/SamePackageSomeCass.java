package access_modifier_p1;

public class SamePackageSomeCass {
		
		public void useMember() {
			// 0928
			
			// 같은 패키지 내의 다른 클래스(ParentClass)의 멤버에 접근
			// => 인스턴스 생성 후 참조변수를 통해 접근해야함 = has - a관계 (x상속관계)
			// => 같은 패키지이므로 import문이 불필요!
			
			
//			publicVar = 10; // 에러발생! 정의하지않은 변수이므로 => 참조변수 만들어 주면 됨! =>
			ParentClass p = new ParentClass(); 
			p.publicVar = 10; 	 // public(O)
			p.protectedVar = 20; // protected(O)
			p.defaulVar = 30;	 // default(O)
//			p.privateVar = 40;   // private(X) 에러발생! private이므로 다른곳에서 접근할 수 없음
			
		}


}
