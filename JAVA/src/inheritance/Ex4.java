package inheritance;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 상속에서의 생성자
		 * 
		 * - 생성자 : 클래스명과 이름이 같고 리턴타입이 없는 메서드의 일종
		 * - 생성자는 상속되지않음 
		 * 	 => 상속받을 경우 자신의 클래스 이름과 생성자 이름이 다르기 때문에
		 * 		생성자 정의 규칙을 위반하게 됨
		 * - 상속 관계에서 인스턴스를 생성할 때 
		 * 	 서브클래스의 인스턴스가 생성되기 전 슈퍼클래스의 인스턴스를 먼저 생성한 후 
		 * 	 서브클래스의 인스턴스를 생성함.
		 *   => 서브클래스의 생성자가 호출되면 가장 먼저 슈퍼클래스의 생성자를 호출하여 
		 *      슈퍼클래스의 인스턴스를 생성하고,
		 *      그 후에 서브클래스의 인스턴스가 생성되어 생성자 코드가 실행됨.
		 */
			
		
			Manager4 m = new Manager4();
			
			/*
			 * Manager4 인스턴스를 생성하는 과정
			 * => 서브클래스의 인스턴스를 생성하는 과정에서
			 * 	  서브클래스 생성자에서 인스턴스 생성 전 슈퍼클래스의 생성자 호출
			 * 	  즉, 슈퍼클래스의 인스턴스가 먼저 생성된 후 서브클래스의 인스턴스가 생성된다.
			 * 
			 *  1) new Manager4() 코드에 의해 Manager4() 생성자로 이동
			 *  2) Manager4() 생성자에서 슈퍼클래스 Employee의 생성자 Employee() 호출
			 *     => super();
			 *  3) Employee4() 생성자에서 슈퍼클래스 Object의 생성자 Object() 호출
			 *     => super();
			 *  4) Object 인스턴스가 생성되고, Object() 생성자 내의 코드가 실행됨
			 *  5) Employee4 인스턴스가 생성되고, Employee4() 생성자 내의 코드 실행됨
			 *  6) Manager4 인스턴스가 생성되고, Manager4() 생성자 내의 코드 샐행됨
			 */
			
	}

}



			class Employee4 {
				String name;
				int salary;
				
				
				// 기본생성자(Alt+Shift+S->O / 체크아무것도안함)
				public Employee4() {
					super(); // Object 클래스를 의미함( : Object 기본생성자로 인스턴스를 생성하라.)
					System.out.println("Employee4() 생성자 호출됨");
					
				}
				// 만약, 파라미터 생성자를 정의했을 때 기본 생성자가 자동으로 생성되지 않으므로
				// 서브클래스의 생성자에서 기본적으로 호출되는 슈퍼클래스의 기본생성자가 존재하지 않는다.
				// 서브클래스의 생성자에서 컴파일에러가 발생할 수 있다!
				// => 슈퍼클래스의 파라미터 생성자를 정의할 때 기본 생성자가 정의 필요!
				
				// 이름, 연봉을 전달받아 초기화하는 파라미터 생성자 정의(Alt+Shift+S->O / 체크 두개 다 함)
				public Employee4(String name, int salary) {
					super();
					this.name = name;
					this.salary = salary;
				}
				
			}
			
			
			
			
			// Emplyee4 클래스를 상속받는 서브클래스 Manager4 정의
			class Manager4 extends Employee4 {
				String depart;

				
				// 기본생성자
				public Manager4() {
					super(); // = Employee() {} 기본 생성자를 호출하는 것
//					super(name,salary); //: 파라미터생성자로 호출하고싶다.
					// 서브클래스의 생성자를 호출하게 되면 
					// 내부적으로 가장 먼저 슈퍼클래스의 기본생성자를 자동으로 호출하게 됨
					// => 슈퍼클래스 생성자의 작업이 종료된 후 서브클래스의 생성자의 작업을 수행
					System.out.println("Manager4()생성자 호출됨!");
				}
				
				
				
				public Manager4(String name, int salary, String depart) {
//					super(); //=  = Employee() {} 기본 생성자를 호출
					super(name, salary); // 매개변수 인자값을 주지않을때에는 기본생성자를 반드시 만들어줘야함? 
					this.name = name;
					this.salary = salary;
					this.depart = depart;
				}
				
			}
			
			
			
			