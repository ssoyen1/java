package access_modifier;

public class Test {

	public static void main(String[] args) {
		// 은행계좌(Account) 클래스의 인스턴스(acc) 생성
		Account acc = new Account();
		
		// Setter() 메서드로 111-1111-111, 홍길동, 10000원 입력
//		acc.accountNo = "111-1111-111";
//		acc.ownerName = "홍길동";
//		acc.balance = 10000;
		// => Setter() 메서드로 대체
		acc.setAccountNo("111-1111-111");
		acc.setOwnerName("홍길동");
		acc.setBalance(10000);
		
//		System.out.println("계좌번호 : " + acc.accountNo());
//		System.out.println("예금주명 : " + acc.ownerName());
//		System.out.println("현재잔고 : " + acc.balance());
		// => Getter() 메서드로 대체
		// Getter() 메서드를 활용하여 계좌번호, 예금주명, 현재잔고를 출력
		System.out.println("계좌번호 : " + acc.getAccountNo());
		System.out.println("예금주명 : " + acc.getOwnerName());
		System.out.println("현재잔고 : " + acc.getBalance() + "원");

	}

}

class Account {
	// Account 클래스의 멤버변수를 private 접근제한자로 선언
	private String accountNo;
	private String ownerName;
	private int balance;
	
	
	// Getter/Setter 메서드를 정의하여 멤버변수에 간접적으로 접근하도록 수행
	// 1. String accountNo 변수에 대한 Getter/Setter 
//	public String getAccountNo() {
//		return accountNo;
//	}
//	
//	public void setAccountNo(String newAccountNo) {
//		accountNo = newAccountNo;
//	}
//	
//	// 2. String ownerName 변수에 대한 Getter/Setter
//	public String getOwnerName() {
//		return ownerName;
//	}
//	
//	public void setOwnerName(String newOwnerName) {
//		ownerName = newOwnerName;
//	}
//	
//	// 3. int balance 변수에 대한 Getter/Setter
//	public int getBalance() {
//		return balance;
//	}
//	
//	public void setBalance(int newBalance) {
//		balance = newBalance;
//	}
 
	
	//==========================================
	// 2. 단축키를 통해 정의
	// - 클래스 내에서 멤버변수 선언 후 Alt + Shift + S -> R
	// => 단, 적어도 하나의 멤버변수가 존재해야지 단축키를 사용할 수 있음!
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}







