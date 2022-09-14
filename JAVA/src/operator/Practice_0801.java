package operator;

public class Practice_0801 {

	public static void main(String[] args) {
		// 출력문에 연산식을 기술하면 연산 결과를 출력
		System.out.println(10+2);
		System.out.println(10-2);
		System.out.println(10*2);
		System.out.println(10/2);
		System.out.println(10%2);
		
		System.out.println("------------------------------");
		
		// int형 변수 a에 10을 저장하고, b에 2를 저장
		int a=10;
		int b=2;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println("------------------------------");
		
		// 연산 결과를 변수에 저장 후 출력
		int c;
		
		// a와 b의 덧셈 결과를 변수 c에 저장 (println 과 printf 사용하기)
		c = a + b;
		System.out.println(a + " + " + b + " = " + c);
		System.out.printf("%d + %d = %d", a,b,c);
		
		c = a - b;
		System.out.println(a + " - " + b + " = " + c);
		System.out.printf("%d - %d = %d", a,b,c);
		
	    c = a * b;
		System.out.println(a + " * " + b + " = " + c);
		System.out.printf("%d * %d = %d", a,b,c);
		
		c = a / b;
		System.out.println(a + " / " + b + " = " + c);
		System.out.printf("%d / %d = %d", a,b,c);
		
		c = a % b;
		System.out.println(a + " % " + b + " = " + c);
		System.out.printf("%d % %d = %d", a,b,c);

		
	 

	}

}
