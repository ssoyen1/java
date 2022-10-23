package wrapper_class;

public class Ex {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스
		 *  - 기본 데이터타입을 객체 형태로 관리해주는 클래스의 모음
		 *    => java.lang 패키지에 위치
		 *  - 기본 데이터타입과 1:1로 대응하는 8개의 클래스를 제공
		 *    (Byte, Short, Integer, Long, Float, Double, Boolean, Character )
		 *    Integer랑 Characrer가 다른점.
		 *  
		 */	
		
		System.out.println("byte 타입 메모리 크기(bit) : " + Byte.SIZE); //byte 타입 메모리 크기(bit) : 8
		System.out.println("byte 타입 메모리 크기(byte) : " + Byte.BYTES); //byte 타입 메모리 크기(byte) : 1
		System.out.println("byte 타입 최소값 : " + Byte.MIN_VALUE); //byte 타입 최소값 : -128
		System.out.println("byte 타입 최소값 : " + Byte.MAX_VALUE); //byte 타입 최소값 : 127

		
		System.out.println();
		
		
		System.out.println("short 타입 메모리 크기(bit) : " + Short.SIZE); 
		System.out.println("short 타입 메모리 크기(byte) : " + Short.BYTES); //short 타입 메모리 크기(byte) : 2
		System.out.println("short 타입 최소값 : " + Short.MIN_VALUE); //short 타입 최소값 : -32768
		System.out.println("short 타입 최소값 : " + Short.MAX_VALUE); //byte 타입 최소값 : 127
		
		
		System.out.println();
		
		
		System.out.println("char 타입 메모리 크기(bit) : " + Character.SIZE); 
		System.out.println("char 타입 메모리 크기(byte) : " + Character.BYTES); //short 타입 메모리 크기(byte) : 2
		System.out.println("char 타입 최소값 : " + (int)Character.MIN_VALUE); //short 타입 최소값 : -32768
		System.out.println("char 타입 최소값 : " + (int)Character.MAX_VALUE); //byte 타입 최소값 : 127
		
		
		System.out.println();		
		
		
		System.out.println("int 타입 메모리 크기(bit) : " + Integer.SIZE); //int 타입 메모리 크기(bit) : 32
		System.out.println("int 타입 메모리 크기(byte) : " + Integer.BYTES); //int 타입 메모리 크기(byte) : 4
		System.out.println("int 타입 최소값 : " + Integer.MIN_VALUE); //int 타입 최소값 : -2147483648
		System.out.println("int 타입 최소값 : " + Integer.MAX_VALUE); //int 타입 최소값 : 2147483647
		
		
		System.out.println();
		
		
		System.out.println("long 타입 메모리 크기(bit) : " + Long.SIZE); //long 타입 메모리 크기(bit) : 64
		System.out.println("long 타입 메모리 크기(byte) : " + Long.BYTES); //long 타입 메모리 크기(byte) : 8
		System.out.println("long 타입 최소값 : " + Long.MIN_VALUE); //long 타입 최소값 : -9223372036854775808
		System.out.println("long 타입 최소값 : " + Long.MAX_VALUE); //long 타입 최소값 : 9223372036854775807
		
		
		System.out.println();
		
		
		System.out.println("double 타입 메모리 크기(bit) : " + Double.SIZE); //long 타입 메모리 크기(bit) : 64
		System.out.println("double 타입 메모리 크기(byte) : " + Double.BYTES); //long 타입 메모리 크기(byte) : 8
		System.out.println("double 타입 최소값 : " + Double.MIN_VALUE); //long 타입 최소값 : -9223372036854775808
		System.out.println("double 타입 최소값 : " + Double.MAX_VALUE); //long 타입 최소값 : 9223372036854775807
		
		
		System.out.println();
		
		
		

		
	}

}
