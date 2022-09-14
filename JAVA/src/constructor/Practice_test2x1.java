package constructor;

public class Practice_test2x1 {



	public static void main(String[] args) {
		
		Account3 acc = new Account3("111-1111-111" ,"홍길동", 0);
		acc.showAccountInfo();
		
	}

}

 class Account3 {
 	String accountNo;
 	String ownerName;
 	int balance;
 	
 	// (1-1)계좌번호, 예금주명, 현재잔고를 전달받아 초기화하는 파라미터 생성자 정의
 	public Account3 (String newAccountNo, String newOwnerName, int newBalance) {
 		
 		System.out.println("Account2(String, String, int) 생성자 호출됨!");
 		
 	 	accountNo = newAccountNo;
 	 	ownerName = newOwnerName;
 	 	balance = newBalance;
 	}
 	
 	
 	// (1-2)단축키 사용
 	// 				에러발생 (이유 : (1-1)과(1-2)가 둘 다 String, String, int 여서 같은 것으로 인식함)
 	//							   만약 int, String, String 으로 되면 에러 X
// 	public Account2(String accountNo, String ownerName, int balance) {
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
//		this.balance = balance;
//	}



	// (2) 계좌정보를 출력하는 showAccountInfo() 메서드 정의
 	public void showAccountInfo() {
 		
 		System.out.println("계좌번호 : " + accountNo);
 		System.out.println("예금주명 : " + ownerName);
 	    System.out.println("현재잔고 : " + balance);
 		
 		
 	}
 	
  	
 	
 	
}
