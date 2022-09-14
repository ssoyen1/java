package operator;

public class Practice2_0801 {

	public static void main(String[] args) {
		// b1 과 b2 의 연산 결과를 byte 타입 변수 b3에 저장할 때 문제 발생!
		int b1 = 10;
		int b2 = 20;
		int b3;
			
		// 연산 결과에 형변환 연산자를 적용하여 byte 타입으로 변환해야한다!
//		b3 = b1 + b2;  // (x)
		b3 = (byte)(b1+b2); // (o)
		
		
		// short s = b1 + b2; // (x)
		short s = (short)(b1+b2); //(o)
		
		// char 타입 변수 ch2에 ch 값에 2를 더한 결과를 저장
//		char ch = ch + 2; // (x)
		char ch = 'A';
		char ch2 = (char)(ch+2); //(o)
		
		int i = 100;
		long l = 200;
		
		// int형 변수 i2 에 i + l 결과값을 저장
	
//		int i2 = i + l; //(x)
		int i2 = (int)(i+l); //(o) long이 더 크므로 int로 변환시켜줌
		System.out.println(i2);
		
		
		float f = 3.14f;
		// => float f = (float)3.14 
		
		System.out.println("----------------------");		
		System.out.println(3 / 2); // 1
		System.out.println((double)(3/2)); // (x) 1.0
		System.out.println((double)3/2); // 1.5
		System.out.println(3/2.0); // 1.5

	}

}
