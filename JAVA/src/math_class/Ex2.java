package math_class;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * Math.radom()
		 * - 난수(임의의 수) 발생을 위한 메서드
		 * - 0.0 <= x < 1.0 범위의 double 타입 난수 발생
		 * 
		 * < 난수 발생 기본 공식 >
		 * 1. (정수화)(Math.random() * 상한값) : 0 ~ 상한값 - 1 (0 <= x < 상한값)
		 * 2. (정수화)(Math.random() * 상한값) + 1 : 1 ~ 상한값 (1 <= x <= 상한값)
		 */

		for(int i = 1; i <= 10; i++) {
//			System.out.println(Math.random()); // 0.0 <= x < 1.0
			
			// 정수 1자리 범위(0 ~ 9) 난수 발생시키기 위해서는
			// 소수점 첫째자리 숫자를 정수 위치로 이동시키고
			// 남은 소수점 이하 숫자들은 제거를 위해 정수화
//			System.out.println((int)(Math.random() * 10)); // 0 <= x < 10
			
			// 만약, 0을 제외하고 1부터 특정 상한값까지의 난수 발생을 위해서는
			// 난수 발생 결과에 +1 수행
			System.out.println((int)(Math.random() * 10) + 1);
			// 1<= x < 11 또는 1 <= x <= 10 (즉, 1~10 사이의 난수)
			
				
			
		}
		
		
		// 연습) 1 ~ 20 사이의 난수 발생
		for(int i=1; i<=20; i++) {
			System.out.println((int)(Math.random() * 20)+1);
		}
		
	}

}




