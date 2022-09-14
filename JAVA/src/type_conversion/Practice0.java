package type_conversion;

public class Practice0 {

	public static void main(String[] args) {
//	  자바의 정석 - 기초편 ch2-12.13 printf 이용한 출력
		
//		System.out.printf("%d%n", 15);
//		System.out.printf("%o%n", 15);
//		System.out.printf("%x%n", 15);
//		
//		float f = 123.456789f;
//		System.out.printf("%f%n", f);

//		double f = 123.456789;
//		System.out.printf("%f%n", f); // 
//		System.out.printf("%e%n", f);
//		System.out.printf("%g%n", f);
//		
//		1. printf()의 지시자
		
		System.out.printf("%5d%n", 10);
		System.out.printf("%-5d%n", 10); //-붙이면 왼쪽정렬
		System.out.printf("%05d%n", 10); //0숫자 -자릿수    00010
		
		System.out.printf("[%5d]%n", 10);// [   10]
		System.out.printf("[%5d]%n", 1234567);// [1234567] 5자리 지정해도 7자리기 때문에 모두 출력함
		
		
		double d = 1.23456789;
		System.out.printf("%f%n", d);//1.234568 (반올림해서 7아닌 8)
		System.out.printf("%14.10f%n", d); // 14자리에 소수점10자리 출력
										 //  1.234678900
		System.out.printf("%14.6f%n", d);  // 1.234568
									
		System.out.printf("[%s]%n", "bono");
		System.out.printf("[%5s]%n", "bono");
		System.out.printf("[%-5s]%n", "bono");
		System.out.printf("[%.3s]%n", "bono"); // 3자리만 잘라서 출력
		
	}

}
