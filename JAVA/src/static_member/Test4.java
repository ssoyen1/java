package static_member;

public class Test4 {

	public static void main(String[] args) {
//		Account acc = new Account();
				// 생성된 인스턴스를 리턴받기
				
				// Setter 호출하여 계좌번호 저장, showAccountInfo() 메서드로 출력
		
			Account acc = Account.getInstance();
			acc.accountNo = "111-1111-111";
			acc.showAccountInfo();

	}

}

			class Account {
					//==================Account 클래스에 대한 싱글톤 패턴 구현 =====================
					// ======================================================================
				

			
					// accountNo 멤버변수 선언(Stiring, Private)
					// Getter/Setter 메서드 정의
					// showAccountInfo()메서드 정의
					String accountNo;
				
			
					// 1. 외부에서 생성자 호출이 불가능하도록 생성자에 private 접근제한자 선언
					private Account() {
						accountNo = "111-1111-111";
					}
					
					
					
					// 2. 자신의 클래스 내에서 인스턴스를 직접 생성한 후 참조변수에 저장
					//	  => 인스턴스 생성없이 접근해야하므로 static 키워드 사용
					//    => 외부에서 함부로 접근하지 못하도록 private 접근제한자 선언
					private static Account instance = new Account();
					
					
					
					// 3. 생성된 인스턴스를 외부로 리턴하는 Getter 메서드 정의
					// => 인스턴스를 저장하는 변수 instance가 private 접근제한자이므로
					//	  접근이 불가능한 대신 인스턴스를 리턴하는 목적으로 정의
					// => 인스턴스 생성없이 접근해야하므로 static 키워드 사용
					public static Account getInstance() {
						return instance;
					}
					
					
					public static void setInstance(Account instance) {
						Account.instance = instance;
					}
					
					
					
					public void showAccountInfo() {
						System.out.println("계좌번호: "+accountNo);
					}
			}