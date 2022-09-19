package constructor_overloading;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		acc.showAccountInfo();
		
		System.out.println("-----------------------------------");
		
		//계좌번호를 전달받는 생성자 호출
		Account acc2 = new Account("999-9999-999");
		acc2.showAccountInfo();		
		System.out.println("-----------------------------------");
		
		// 계좌번호, 예금주명을 전달받는 생성자 호출
		Account acc3 = new Account("999-9999-999", "이순신");
		acc3.showAccountInfo();		
		System.out.println("-----------------------------------");
		
		Account acc4 = new Account("999-9999-999", "이순신", 10000);
		acc4.showAccountInfo();	
		
	}

}

class Account{
	String accountNo;
	String ownerName;
	int balance;

	// 기본생성자 (111-111-111, 홍길동, 0)

	public Account() {
		System.out.println("Account() 생성자 호출!");
		this.accountNo = "111-111-111";
		this.ownerName = "홍길동";
		this.balance = 0;
	}
	
	//계좌번호를 파라미터로 전달받고, 홍길동, 현재잔고는 0으로 초기화하는 생서자. // account만 생성자 단축기로 형성학.
	public Account(String accountNo) {
		this.accountNo = accountNo;
		ownerName = "홍길동";
		balance = 0;
	}

	
	// 계좌번호, 예금주명을 파라미터로 전달받고, 현재잔고는 0으로 초기화하는 생성자.
	public Account(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		balance = 0;
	}

	// 계좌번호, 예금주명, 현재잔고를 파라미터로 전달받는 생성자
	public Account (String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	// showAccountInfo() 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}



	}
