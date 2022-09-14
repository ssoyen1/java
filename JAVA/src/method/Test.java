package method;

public class Test {

	public static void main(String[] args) {
		/*
		 * Account 인스턴스(acc) 생성 후 다음과 같이 초기화 및 출력
		 * ----------------------------------
		 * 계좌번호 : 111-1111-111
		 * 예금주명 : 홍길동
		 * 현재잔고 : 10000원
		 */
		
		Account acc = new Account();
		acc.accountNo = "111-1111-111";
		acc.ownerName = "홍길동";
		acc.balance = 10000;
		
		System.out.println("계좌번호 : "+ acc.accountNo);
		System.out.println("예금주명 : "+ acc.ownerName);
		System.out.println("현재잔고 : "+ acc.balance);
		
		System.out.println("------------------------");
		
		Account acc2 = new Account();
		acc2.accountNo = "555-5555-555";
		acc2.ownerName = "이소연";
		acc2.balance = 9999;
		
		System.out.println("계좌번호 : "+ acc2.accountNo);
		System.out.println("예금주명 : "+ acc2.ownerName);
		System.out.println("현재잔고 : "+ acc2.balance);

	}
	
}



/*
 * 은행계좌(Account) 클래스 정의
 * 멤버변수 - 계좌번호(accountNo, 문자열)
 * 		    예금주명(ownerName, 문자열)
 * 			현재잔고(balance, 정수)
 * 
 * 메서드
 * - showAccontInfo() => 리턴값 없음, 매개변수 없음
 * 	 => 계좌번호, 예금주명, 현재잔고를 출력하는 메서드 정의
 * 		ex) 계좌번호 : 111-1111-111
 * 			예금주명 : 홍길동
 * 			현재잔고 : 10000원
 */
class Account {
		String accountNo;
		String ownerName;
		int balance;
	
}		
	
	