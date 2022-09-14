package class_.JAVA0907;

public class test2_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account acc = new Account();
		
		int money = acc.withdraw(5000);
		System.out.println("출금된 금액 : "+money+"원");
		
		acc.accountNo="111-1111-111";
		acc.ownerName="홍길동";
		acc.balance=10000;

		
		System.out.println("계좌번호 : " + acc.accountNo);
		System.out.println("예금주명 : " + acc.ownerName);
		System.out.println("현재잔고 : " + acc.balance+"원");
		

		acc.showAccountInfo();
		System.out.println("-----------------------------");
		acc.deposit(5000);
		
		System.out.println("-----------------------------");
		// 현재잔고보다 적거나 같은 금액을 출력하는 경우(출금가능)
		money = acc.withdraw(5000);
		System.out.println("출금된 금액 : "+money+"원");
		
		//현재잔고보다 많은 금액을 출금하는 경우(출금불가)
		money = acc.withdraw(10000);
		System.out.println("출금불가");
//		acc.withdraw(1000);
		
	} //main 끝

} //test 끝





/*
 * 은행계좌(Account) 클래스 정의
 * [ 멤버변수 선언]
 * - 계좌번호(accountNo, 문자열)
 * 	 예금주명(ownerName, 문자열)
 * 	 현재잔고(balace, 정수)
 * 
 * 
 * 
 * [ 메서드 정의 ]
 * - 계좌번호, 예금주명, 현재잔고를 출력하는 showAccountInof() 메서드
 * 	 ex) 계좌번호 : 111-1111-111
 * 		 예금주명 : 홍길동
 * 		 현재잔고 : 10000원
 * 
 * - 입금 기능을 수행하는 deposit() 메서드
 *   => 입금할 금액(amount, 정수)을 전달받아 현재잔고(balance)에 누적한 후
 *   	입금된 금액과 입금 후 현재잔고를 출력
 *   	ex) "입금하신 금액 : XXXX원"
 *   		"입금 후 현재잔고 : XXXX원"
 *   => 단, 리턴값은 없음 (입금했으니 돈이 다시 돌아오는게 아니므로!)
 *   
 * - 출금 기능을 수행하는 withdraw() 메서드
 *   => 출금될 금액(amount, 정수)를 전달받아 현재잔고(balance)에서 차감 후 
 *   	출금될 금액과 출금 후 현재잔고를 출력
 *   	ex) "출금할 금액     : XXXXX원"
 *   		"출금 후 현재잔고 : XXXXX원"
 *   => 단, 출금 기능을 수행하기 전 현재잔고와 출금할 금액을 비교하여
 *   	현재잔고가 출금할 금액보다 적을 경우 출금을 수행하지 않고 다음과 같이 출력
 *   	ex) "잔고가 부족하여 출금이 불가능합니다."
 *   		"출금할 금액 : XXXXX원, 현재잔고 : XXXXX원"
 * 	 => 리턴값 있음(출금할 금액에 해당하는 금액 리턴)
 * 
 * 
 */



	class Account {
		
		// 멤버변수 선언
		String accountNo;
		String ownerName;
		int balance;
		
		// 메서드 정의
		public void showAccountInfo() {
			System.out.println("계좌번호 : " + accountNo);
			System.out.println("예금주명 : " + ownerName);
			System.out.println("현재잔고 : " + balance+"원");
		}
		
		
		// 입금기능
		public void deposit(int amount) {
			//입금할 금액(amount, 정수)을 전달받아 현재잔고(balance)에 누적한 후 출력
			balance += amount; //balance = balance + amount
			System.out.println("입금하신 금액    : "+amount+"원");
			System.out.println("입금 후 현재잔고 : "+balance+"원");
			System.out.println("-----------------------------");
		}
		
		
		// 출금기능 (1)리턴 :  각각 리턴사용 
		public int withdraw (int amount) {
			
			// 입력받은 출금금액(amount)를 현재잔고(balance)에 차감 후
			// 출금되는 금액(amount)을 리턴
			// 단, 현재잔고가 출금금액보다 적을 경우 출금 불가
			
			if(balance>amount) { // 현재잔고가 출금금액보다 크거나 같은지 판별(출금가능)
				balance -= amount;
				System.out.println("출금할 금액     : "+amount+"원");
				System.out.println("출금 후 현재잔고 : "+balance+"원");
				return 0; // if 와 else 각각의 return값을 명시해줘야함.
				
			}else { // 현재잔고가 출금금액보다 작은지 판별(출금불가능)
				System.out.println("잔고가 부족하여 출금이 불가능합니다.");
				System.out.println(
						"출금할 금액 : "+amount+"원,"+" 현재잔고 : "+balance+"원");
				return amount; // 출금금액 리턴
							   // if 와 else 각각의 return값을 명시해줘야함.

			}
			// if문 내에서 출금 실패 시 return 문에 의해 메서드를 종료하므로
			// 출금이 가능한 경우의 코드는 else 문이 없어도 상관없다!

		}
		
	
		
		
		
//		// 출금기능 (2)리턴 :  if에 출금할 금액을 0으로 명시해줌
//		public int withdraw (int amount) {
//			
//			// 입력받은 출금금액(amount)를 현재잔고(balance)에 차감 후
//			// 출금되는 금액(amount)을 리턴
//			// 단, 현재잔고가 출금금액보다 적을 경우 출금 불가
//			amount = 0;
//			if(balance>amount) { // 현재잔고가 출금금액보다 크거나 같은지 판별(출금가능)
//				balance -= amount;
//				System.out.println("출금할 금액     : "+amount+"원");
//				System.out.println("출금 후 현재잔고 : "+balance+"원");
//				return 0;
//				
//			}else { // 현재잔고가 출금금액보다 작은지 판별(출금불가능)
//				System.out.println("잔고가 부족하여 출금이 불가능합니다.");
//				System.out.println(
//						"출금할 금액 : "+amount+"원,"+" 현재잔고 : "+balance+"원");
//
//			}
//		
//			return amount;
//		
//		}
//		
		
		
		
		// 출금기능 (3)
		
//		public int withdraw (int amount) {
//			if (balance < amount) {
//				System.out.println("잔고가 부족하여 출금이 불가능합니다.");
//				System.out.println(
//						"출금할 금액 : "+amount+"원,"+" 현재잔고 : "+balance+"원");
//				return 0;
//			}
//			
//			balance -= amount;
//			System.out.println("출금할 금액     : "+amount+"원");
//			System.out.println("출금 후 현재잔고 : "+balance+"원");
//			return amount;
//		
//		}
	
	
	
	}	
	

	
	
	
	
	
	