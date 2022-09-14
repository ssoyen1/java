package constructor;

public class Test {

	public static void main(String[] args) {
		
		// 은행계좌(Account) 클래스의 인스턴스(acc) 생성
		Account acc = new Account(); // 생성자이름 = 클래스이름 / acc에 대한 참조변수 만듦
					//Account acc;     
					//acc = new Account();  - 두개를 합친 것
		System.out.println(acc.accountNo); // Account 클래스가 아닌 다른 클래스에서 접근할 때에는
										   // acc.~ 이렇게 꼭 작성해야함.

		
		// 굳이 이렇게 일일이 하지않아도 될 수 있게끔 설계가 되어있음
//		acc.accountNo = "111-1111-111";
//		acc.ownerName = "홍길동";
//		acc.balance = 0;
//		
//		System.out.println("계좌번호 : " + acc.accountNo);
//		System.out.println("예금주명 : " + acc.ownerName);
//		System.out.println("현재잔고 : " + acc.balance);
		
		acc.showAccountInfo();
	}

}



class Account {
	// 멤버변수 선언(= 필드)
	String accountNo;
	String ownerName;
	int balance;
	
	
//	public Account() {} // 기본생성자 (굳이 안적어도 됨)
	
	// 생성자(리턴타입 X)
	public Account() {
		System.out.println("Account() 생성자 호출됨!"); // 만들면 위의 Account acc = new Account();인스턴스가 기본생성자가 아니라 여기를 찾아옴
		
		// 인스턴스 생성 시 기본값을 가져야할 데이터를 멤버변수에 저장 O 
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
		
	}
	
	
	// 계좌 정보를 출력하는 showAccountInfo()메서드 정의

	// 메서드(리턴타입 O)
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
		
	}
	
	
	
	
	
}