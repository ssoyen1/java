package access_modifier_p2;

import access_modifier_p1.ParentClass;

		public class OtherPackageChildClass extends ParentClass {
			public void useMember() {
				// 0928 
				
				// 다른 패키지 내의 상속 관계인 부모 클래스(ParentClass)의 멤버에 접근
				// => 슈퍼클래스의 멤버에 접근할 때에는 참조변수 없이 접근해야함
				// 	  ( 또는 레퍼런스 this를 통해 접근)
				this.publicVar = 10; 	// public(O)
				this.protectedVar = 20; // protected(O) - 다른 패키지이지만, 상속 관계이므로 접근가능
//				this.defaulVar = 30;	// default(X)	- 다른 패키지에서는 접근 불가
//				this.privateVar = 40;	// private(X)	- 다른 클래스에서는 접근 불가
				
				
				
				//------------------------------------------------------------------
				// 서브클래스에서 슈퍼클래스의 인스턴스 생성 후 참조변수를 통해 접근시
				// is-a 관계가 아닌 has-a 관계로 취급되므로 protected로 접근 불가능 
				// => 즉, 상속관계가 아닌 별도의 인스턴스로 취급됨 
				//(OtherPackageSomeClass 복사)
				// 다른 패키지내 상속관계가 아닌 다른 클래스에서의 접근
				// => 인스턴스 생성 후 참조변수를 통해 접근해야 함 = has=a
				// => 다른패키지이므로 import문이 필요!
				ParentClass p = new ParentClass(); // 에러발생! 다른패키지에 있으므로 (import전) 
												   // => import문 필요
				p.publicVar = 10;	 // public(O) 
//				p.protectedVar = 20; // protected(X) - 패키지다름, 상속관계가 아니므로 접근 불가
//				p.defaulVar = 30;	 // default(X)	 - 다른 패키지에서 접근 불가
//				p.privateVar = 40;   // private(X) 	 - 다른 클래스에서 접근 불가
			}
}
