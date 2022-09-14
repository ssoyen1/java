package operator;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 *   대입연산자(=)
		 * 
		 * - 우변의 데이터를 좌변의 변수에 대입(저장)
		 * 	 => 연산 방향이 우 -> 좌로 진행됨
		 * 	    ex) x = y = 3 의 경우 y에 3을 대입하고, x에 y를 대입
		 * - 모든 연산자 중에서 우선순위가 가장 낮다.
		 * 	 즉, 다른 모든 작업을 수행한 후 대입연산을 수행
		 * 
		 * 
		 * 
		 * 	 확장(복합) 대입연산자(+=, -=, *=, /=, %=)
		 * 
		 * - 대입연산자와 산술연산자를 조합한 연산자
		 * - 좌변과 우변의 데이터끼리 산술연산을 먼저 수행하고 
		 * 	 그 결과값을 다시 좌변의 변수에 대입(저장)
		 * 	 => a = a + b 는 a += b 로 표현 가능
		 * 
		 */
		
		
		int a = 10; // 우변의 데이터 10을 좌변의 변수 a에 대입(저장)
		int b;
		
		b =a; // 우변의 변수 a 의 값을 좌변의 변수 b 에 대입(저장)
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-------------------------------------");
		
		// b 와 a 의 덧셈 결과를 다시 변수 b 에 저장
		// => 마치, b에 a값을 누적하는 것과 동일
//		b = b + a; // 10 + 10 = 20 이 변수 b 에 저장됨 (b 에 a값을 누적)
		b += a; // b = b + a;  동일
		System.out.println(b);
		
		// b 와 a 의 뺄셈 결과를 다시 변수 b 에 저장
//		b = b - a; // 20 - 10 = 10 이 변수 b에 저장됨
		b -= a; // b = b - a;  동일
		System.out.println(b);
		
		// b 와 a 의 곱셈 결과를 다시 변수 b 에 저장
//		b = b * a; // 20 * 10 = 100 이 변수 b에 저장됨
		b *= a; // b = b * a;   동일
		System.out.println(b);
		
		// b 와 a 의 나눗셈 결과(몫)를 다시 변수 b 에 저장
//		b = b / a; // 100 / 10 = 10 이 변수 b에 저장됨
		b /= a; // b = b * a;   동일
		System.out.println(b);
		
		// b 와 a 의 나눗셈 결과(나머지)를 다시 변수 b 에 저장
//		b = b % a; // 10 % 10 = 0 이 변수 b에 저장됨
		b %= a; // b = b % a;   동일
		System.out.println(b);
		
		System.out.println("=====================================");
		
		
		byte b1 = 10;
		// b1 과 정수 10을 더한 값을 다시 b1에 저장
		
//		(1) 
//		b1 = b1 + 10; // 오류발생! byte + int (정수는 기본값 int임) 
					  // 	     int + int = int
		// => Type mismatch: cannot convert from int to byte
		// => 결과값을 다시 byte 타입으로 변환해야 한다!
		b1 = (byte)(b1+10);
		System.out.println(b1);
		
//		(2) 
		// 확장 대입연산자를 사용하여 b1 + 10 의 값을 b1 에 저장
		// 변환 할 필요없이 바로 가능
		b1 += 10;
		System.out.println(b1);
		
		
		System.out.println("==========================");
		
		
		// char 타입 변수 값을 변환시킬 때 확장 대입연산자를 많이 사용함
		char ch = 'A';
//		ch = ch + 3; // 컴파일에러 발생!
		
		// < 해결방법 >
//		(1)형변환을 수행하거나
//		ch = (char)(ch + 3); 
		
//		(2) 확장 대입연산자를 사용
		ch += 3;
		System.out.println(ch);
		
		
		
		
	}

}
