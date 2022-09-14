package method;

public class Ex2 {

	public static void main(String[] args) {
		
		/*  < 메서드 정의 기본 문법 >
		 *  [접근제한자] 리턴타입 메서드명([매개변수선언...]) {        [있어도되고 없어도되는 것] 
		 *  	// 메서드 호출시 수행할 코드들...
		 *  	[return [리턴값];] 
		 *  }
		 */ 
		
		/*	< 메서드 형태 4가지 >
		 *	1. 파라미터도 없고, 리턴값도 없는 메서드 X X 
		 *	2. 파라미터는 없고, 리턴값은 있는 메서드 X O
		 *	3. 파라미터만 있고, 리턴값은 없는 메서드 O X
		 *	4. 파라미터도 있고, 리턴값도 있는 메서드 O O 
		 */
		
		
		
		
		
		// 3. 파라미터만 있고, 리턴값은 없는 메서드 호출 O X

		System.out.println(" 동생아! 돈을 줄테니 과자를 사먹어라! ");
		// => *******메서드 호출 시 전달한 데이터는 메서드명 뒤의 소괄호 내에 기술*******
//		sister_3(2000); // 메서드 파라미터에 리터럴값을 직접 전달하거나 
		// 변수를 사용하여 값을 저장한 뒤 파라미터에 전달 가능
		int myMoney = 2000;
		sister_3(myMoney); //**********
		
		
		System.out.println("=================================");
		
		
		
		
		
		
		// 4. 파라미터도 있고, 리턴값도 있는 메서드 호출 O O
		
		System.out.println("동생아! 1만원을 줄테니 내 새우깡도 사줘라!");
		String snack = sister_4(10000); //******??? 무슨뜻이야 
		System.out.println("동생이 사다준 것 : "+snack);
		
		snack = sister_4(2000);
		System.out.println("동생이 사다준 것 : "+snack);
		
		
	
	}// main() 메서드 끝
	
	
	
	
	// --------------------------------------------------
	
	
	
	
	
	
	
	// 3. 파라미터만 있고, 리턴값은 없는 메서드 정의
	
	
	// => 파라미터가 있으므로 메서드 선언부 소괄호() 안에
	// 	  외부로부터 호출시 전달받는 데이터를 저장할 변수(매개변수) 선언
	// => 리턴값은 없으므로 리턴타입 부분을 void로 설정
	public static void sister_3(int money) { //sister_3의 로컬변수
		// 파라미터(매개변수)로 선언된 int형 변수 money에 메서드 호출 시 전달된 값 저장됨
		// => sister_3(2000) 호출 시 int money = 2000과 동일한 코드로 취급
		System.out.println("동생 : 오빠가 준 돈 = "+money+"원");
		// 현재 메서드 내에서 money 변수를 자유롭게 사용 가능
		// 단, 메서드를 벗어나면 존재하지 않는 변수로 취급됨
		
		money -= 1000;
		System.out.println("동생 : 새우깡 사먹고 "+money+"원이 남았다.");
	}// sister_3() 메서드 끝
	
	
	
	
//	public static void sister_3(int money) {
//		System.out.println("동생 : 오빠가 준 돈 = "+money+"원");
//		money -= 2000;
//		//if문을 사용하여 잔돈이 남았을 때 잔돈을 출력하지 않고 메서드 종료
//		// => 만약, 잔돈이 남지 않았을 경우 "잔돈 0원" 출력
//		
//		if(money > 0) {
//			// 현재 수행중인 메서드를 종료하고 빠져나가기 위해서는
//			// 특정 조건일 때 return 문이 실행되도록 해야한다!
//			return;
//		}
//		
//		System.out.println("동생 : 잔돈"+money+"원");
//	}
//	
		//--------------------------------------------------
	
	
		// 4. 파라미터도 있고, 리턴값도 있는 메서드 정의 O O
	
		public static String sister_4(int money) {
			System.out.println("동생 : 오빠가 준 돈 = "+money+"원");
			money -= 1000;
			System.out.println("동생 : 새우깡 사먹고 "+money+"원이 남았다.");
			
			// 문자열 "새우깡"을 리턴
			//return "새우깡", "물"; // 주의 ! return 문 뒤의 값을 하나만 기술!
			return "새우깡";
		}
	
}// Ex2 클래스 끝
