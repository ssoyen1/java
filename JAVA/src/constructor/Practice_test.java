package constructor;

public class Practice_test {


	public static void main(String[] args) {
		
//		 은행계좌(Account) 클래스의 인스턴스(acc) 생성

		Account1 acc1 = new Account1();
		
		acc1.showAccountInfo();
		

		
		// 굳이 이렇게 일일이 하지않아도 될 수 있게끔 설계가 되어있음
//		acc.accountNo = "111-1111-111";
//		acc.ownerName = "홍길동";
//		acc.balance = 0;
//		
//		System.out.println("계좌번호 : " + acc.accountNo);
//		System.out.println("예금주명 : " + acc.ownerName);
//		System.out.println("현재잔고 : " + acc.balance);

	}
	
}

class Account1 {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account1() {
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
	}


	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
}

