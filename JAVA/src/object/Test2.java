package object;

import java.util.Objects;

public class Test2 {

	public static void main(String[] args) {
			// acc와 acc2생성 후 두 계좌의 정보 비교 및
			// 참조변수 출력 시 toString() 메서드 활용하여 결과 보기
			
			
			Account acc = new Account("111-111-111","홍길동", 0);
			String accountInfo = acc.toString();
			Account acc2 = new Account("222-222-222", "이순신", 0);
			String accountInfo2 = acc2.toString();

			System.out.println("acc의 계좌정보 : "+ acc.toString()); //계좌정보 : Account [accounNo=111-111-111, ownerName=홍길동, balance=0]
			System.out.println("계좌정보 : "+ acc); //acc.toStirng
//			System.out.println("계좌정보 : "+ accountInfo); //3개 동일
			
			if(acc.equals(acc2)) {
				System.out.println("두 계좌는 동일한 계좌입니다!");
			} else {
				System.out.println("두 계좌는 다른 계좌입니다!");
			} 
			
			
			
			System.out.println("acc2의 계좌정보 : "+ acc2.toString()); //계좌정보 : Account [accounNo=222-222-222, ownerName=이순신, balance=0]
			System.out.println("계좌정보 : "+ acc2);
//			System.out.println("계좌정보 : "+ accountInfo2); //3개 동일
	}
	

}

			
			/*
			 * Account 클래스 정의
			 * - 멤버변수
			 * 	 계좌번호(accountNo, 문자열) 예금주명(ownerName, 문자열)
			 * 	 현재잔고(balace, 정수)
			 * - 생성자 : 계좌번호, 예금주명, 현재잔고를 전달받아 초기화
			 */


			class Account {
				String accounNo;
				String ownerName;
				int balance;
				
				// alt + shift + s -> o
				public Account(String accounNo, String ownerName, int balance) {
					super();
					this.accounNo = accounNo;
					this.ownerName = ownerName;
					this.balance = balance;
				}



				// equals() 메서드 오버라이딩하여 계좌정보를 비교하도록 정의 (Alt + Shift + S -> H )
				@Override
				public boolean equals(Object obj) {
					if (this == obj)
						return true;
					if (obj == null)
						return false;
					if (getClass() != obj.getClass())
						return false;
					Account other = (Account) obj;
					return Objects.equals(accounNo, other.accounNo) && balance == other.balance
							&& Objects.equals(ownerName, other.ownerName);
				}
				
				


				// toString() 메서드 오버라이딩하여 계좌정보를 문자열로 리턴하도록 정의 (Alt + Shift + S -> S)
				@Override
				public String toString() {
					return "Account [accounNo=" + accounNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
				}
				
				
				
				
				
			}