package access_modifier_p2;

import access_modifier_p1.ParentClass;

public class OtherPackageSomeClass {

		public void useMember() {
			//  0928
			
			// 다른 패키지의 상속관계가 아닌 다른 클래스에서의 접근
			// => 인스턴스 생성 후 참조변수를 통해 접근해야 함 = has=a
			// => 다른패키지이므로 import문이 필요!
			
//			publicVar = 10; // 바로 접속불가능
			
			ParentClass p = new ParentClass(); // 에러발생! 다른패키지에 있으므로 (import전) 
											   // (남의 것이라는 의미)
											   // => import문 필요
			p.publicVar = 10;	 // public(O) 
//			p.protectedVar = 20; // protected(X) - 패키지다름, 상속관계가 아니므로 접근 불가
//			p.defaulVar = 30;	 // default(X)	 - 다른 패키지에서 접근 불가
//			p.privateVar = 40;   // private(X) 	 - 다른 클래스에서 접근 불가
			
		}
	

}
