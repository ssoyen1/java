package object;

public class Ex2 {

   public static void main(String[] args) {
      /*
       * toString() 메서드 (public String toString() {})
       * - 어떤 객체의 정보를 문자열로 변환하여 리턴
       * - 기본적으로 Object 클래스의 toString() 메서드는
       * 객체의 정보 (= 주소값)을 문자열로 리턴하도록 정의되어 있음
       * - 일반적으로 객체의 정보는 객체 내의 멤버변수에 저장된 데이터(속성값)를
       * 의미하므로 Object 클래스의 toString() 메서드를 오버라이딩하여
       * 객체가 가진 멤버변수 값을 문자열로 결합하여 리턴하도록 해야함
       * - 출력문 내에서는 toString() 메서드 생략 가능(참조변수명만 사용 가능)
       * - 자바에서 제공하는 대부분의 클래스(API)들은 toString() 메서드가
       * 오버라이딩 되어 있으므로 객체에 저장된 값을 문자열로 리턴받기 가능
       * ex) String 클래스, ArrayList 클래스 등
       * - equals() 메서드와 마찬가지로 단추키를 통한 자동 생성 가능
       * = Alt + Shift + S => S
       */
      
      String str = new String("자바"); // String 타입도 객체이다!
      System.out.println(str); // toString() 메서드 생략되어 있음!(문자열 출력)
      System.out.println(str.toString()); // 위의 결과와 동일 (문자열 출력)
      
      Person2 p = new Person2("홍길동", 20, "031010-1234567");
      System.out.println("사람 p 의 정보 : " + p.toString()); //object.Person2@1d251891
      System.out.println("사람 p 의 정보 : " + p);
      // => println() 메서드 내에 p 객체 정보 출력 시 toString() 생략 가능
      
      String personInfo = p.toString(); //Type mismatch: cannot convert from Person2 to String
      
      // Object클래스의 toString()메서드는 "클래스명@주소값"형태의 문자열 리턴
      // => 주소값은 16진수로 변환되어 문자열로 결합됨
      System.out.println("Person2 p의 클래스명 : " + p.getClass().getName()); //Person2 p의 클래스명 : object.Person2
      System.out.println("Person2 p의 주소값 : " + p.hashCode()); //Person2 p의 주소값 : 488970385

      System.out.println("---------------------------------------------");
      
      Person3 p2 = new Person3("홍길동", 20, "031010-1234567");
      System.out.println("p2 객체의 정보 : " + p2.toString()); //p2 객체의 정보 : Person3 [name=홍길동, age=20, jumin=031010-1234567]
      System.out.println("p2 객체의 정보 : " + p2); // 위와 동일
      
   }

}

		class Person2 {
		   String name;
		   int age;
		   String jumin;
		   
		   public Person2(String name, int age, String jumin) {
		      super();
		      this.name = name;
		      this.age = age;
		      this.jumin = jumin;
		   }
		
		}
		
		
		
		
		class Person3 {
			   String name;
			   int age;
			   String jumin;
			   
			   public Person3(String name, int age, String jumin) {
			      super();
			      this.name = name;
			      this.age = age;
			      this.jumin = jumin;
			   }


//			@Override
//			public String toString() {
//				// 현재 인스턴스가 가진 멤버들을 모두 문자열로 결합하여 리턴
//				// => 결합하는 형태(출력 모양)는 개발자가 알아서 결정
//				return super.toString();
//			}
//			
			   
			   // toString() 메서드 자동 생성(오버라이딩 단축키) : Alt + shift + s -> s
			   @Override
			   public String toString() {
				   return "Person3 [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
			   }
			   
			   
			   
			   
			}