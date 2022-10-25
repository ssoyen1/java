package java_util_package;

import java.util.Random;

public class Ex {

	public static void main(String[] args) {
		/*
		 * java.util 패키지
		 * - 다양한 기능을 제공하는 유틸리티 클래스들의 모음
		 * - 난수 생성, 날짜 및 시각 관리, 자료구조 등
		 * 
		 * Random 클래스
		 * - 난수 발생 기능 전용 클래스
		 * - static 메서드가 아닌 메서드 형태로 제공하므로 인스턴스 생성 필수
		 * => 문자 인증 (랜덤숫자) 등에 사용할 수 있음
		 * 
		 */
		
		
		// Random 클래스의 인스턴스 생성
		Random r = new Random();
		
		for(int i = 1; i <= 10; i++) {
			// nextInt() 메서드 : int형 범위(-21억 ~ +21억) 난수 발생
//			System.out.println("int형 범위의 난수 : " + r.nextInt());
														//int형 범위의 난수 : -1029816087
														//int형 범위의 난수 : -1861530991
														//int형 범위의 난수 : -1510614087
														//int형 범위의 난수 : 1116393302
														//int형 범위의 난수 : -1137221156
														//int형 범위의 난수 : 517319892
			
			
			
			// nextDouble() 메서드 : double 형 범위 난수 발생
			// => Math.random() 메서드와 동일한 결과
//			System.out.println("double형 범위의 난수 : " + r.nextDouble());
														//double형 범위의 난수 : 0.35690205541482445
														//double형 범위의 난수 : 0.6232318542491064
														//double형 범위의 난수 : 0.20640940425249266
			
			
			// nextBoolean() 메서드 : true 또는 false 난수 발생
			System.out.println("boolean형 범위의 난수 : " + r.nextBoolean());
														//boolean형 범위의 난수 : false
														//boolean형 범위의 난수 : true
														//boolean형 범위의 난수 : true
			
			
			// nextInt(int) 메서드를 활용하여 원하는 범위의 난수 발생
			// => 파라미터로 최대값(x) 전달 시 : 0 ~ x-1 범위의 난수 발생
//			System.out.println("0~9 사이의 난수 : " + r.nextInt(10));
														//0~9 사이의 난수 : 8
														//0~9 사이의 난수 : 7
														//0~9 사이의 난수 : 1
														//0~9 사이의 난수 : 9
			
			// 1 ~ 최대값(x) 사이의 난수 발생을 위해서는 nextInt(x) + 1 필요
			System.out.println("1 ~ 10 사이의 난수 : " +  (r.nextInt(10)+1));
			
			
		}

	}

}
