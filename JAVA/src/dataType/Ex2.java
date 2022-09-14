package dataType;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 문자형 데이터 타입 : char
		 * 
		 * - 내부적으로 정수형 데이터로 처리됨
		 * - 2Byte(16bit) 크기의 범위로 사용하며
		 * 	 정수 범위 0 ~ 65535 사이의 값을 갖는다. (양수만 가능O / 음수 사용 X)
		 * 	 (short 정수형 타입은 -32768 ~ +32767)
		 * - 문자 표현시 1개의 문자를 작은따옴표('')로 둘러싸서 표현
		 * 	 => 작은따옴표 내의 문자 1개가 정수형으로 변환되어 처리됨
		 * 		ex) 'A' 는 정수 65로 처리됨
		 * - 유니코드 표현 방법을 사용
		 *  => Unicode(유니코드) : 전 세계의 모든 문자를 표현하기 위한 체계
		 *  => 아스키코드를 기반으로 나머지 문자를 추가하여 만든 코드 체계
		 *     아스키코드(ASCII, 7bit) : 미국 표준 문자 코드
		 *     'A' = 65, 'a'- 97, '0' = 48
		 *  => 10진수로 된 코드값을 사용하지만, 입력 시 16진수 코드 4자리 이용
		 *     '\'기호와 'u'를 쓰고 16진수 xxxx 형태의 유니코드 값 표현 방법 이용
		 *     ex) \uABCD
		 */

		// char 타입 변수 ch 를 선언하고 대문자 A를 저장 후 출력
		char ch = 'A';
		System.out.println(ch);
		
		// char 타입 리터럴을 표기하기 위해서 작은따옴표로 둘러싸며
		// 작은따옴표 사이에는 반드시 1개의 문자가 포함되어야 함!!
//		ch = 'ABC'; // 두 글자 이상 사용 불가 ---> String "ABC"
//		ch = ''; // 반드시 1개의 문자를 포함되어야 함
		ch = ' '; // 공백사용O
		ch = 65; // 10진수 코드값으로 지정도 가능함 (65 = 'A')
		ch = 97;
		System.out.println(ch);
		ch = '\u0041'; // 유니코드 표기법 사용 가능(16진수 0041 = 10진수 65)
		System.out.println(ch);
		
		// 한글 등 다른 나라 문자도 표현 가능
		ch = '가';
		System.out.println(ch);
		ch = '\uAC00';
		System.out.println(ch);
		ch = '\uAC01';
		System.out.println(ch);
		
		/*
		 * 문자열
		 */
	}
}