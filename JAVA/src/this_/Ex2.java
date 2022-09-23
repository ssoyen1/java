package this_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 생성자 this() 
		 * 
		 * (생성자 :  - 클래스로부터 객체를 생성할 때 수행되어 객체의 초기화를 담당하는 것
		 * 			- 객체가 생성될 때 초기화 목적으로 실행되는 메소드
		 *			- 객체가 생성되는 순간에 자동 호출 						  )
		 * 
		 * - 자신의 생성자 내에서 자신의 또 다른 생성자를 호출
		 * - 레퍼런스 this 사용과 동일하게 자신의 인스턴스에 접근하여 
		 * 	 다른 오버로딩 생성자를 호출하는 용도로 사용
		 * - 생성자 오버로딩 시 인스턴스 변수에 대한 초기화 코드가 중복되는데
		 * 	 초기화 코드 중복을 제거하는 용도로 사용
		 * 	 => 여러 생성자에서 각각 인스턴스 변수를 중복으로 초기화하지 않고
		 * 	 	하나의 생성자에서만 초기화 코드를 작성한 뒤 
		 * 		나머지 생성자에서는 해당 초기화 코드를 갖는 생성자를 호출하여 
		 * 		초기화 할 값만 전달 후 대신 인스턴스 변수를 초기화한다.
		 * 	 => 메서드 오버로딩 시 코드의 중복을 제거하기 위해서
		 * 		하나의 메서드에서만 작업을 수행하고 나머지 메서드는
		 * 		해당 메서드를 호출하여 데이터를 전달하는 것과 동일함
		 * 		(단, 메서드는 메서드이름()으로 호출, 생성자는 this()로 호출하는 차이)
		 * 
		 * 
		 * < 생성자 this() 호츨 기본 문법 >
		 * 생성자 내의 '첫 번째 라인'에서
		 * this([데이터...]);
		 */
		
		
		
		// MyDate() 생성자 호출 => 1900년 1월 1일로 초기화
		MyDate d1 = new MyDate();
		System.out.println(d1.year+"/"+d1.month+"/"+d1.day); //1900/1/1
		System.out.println("---------------------------------");
		
		// MyDate(int) 생성자 호출 => 2022년 1월1일로 초기화
		MyDate d2 = new MyDate(2022);
		System.out.println(d2.year+"/"+d2.month+"/"+d2.day); //2022/1/1
		System.out.println("---------------------------------");
		
		// MyDate(int,int) 생성자 호출 => 2022년 9월1일로 초기화
		MyDate d3 = new MyDate(2022,9); 
		System.out.println(d3.year+"/"+d3.month+"/"+d3.day); //2022/9/1
		System.out.println("---------------------------------");
		
		// MyDate(int,int,int) 생성자 호출 => 2022년 9월1일로 초기화
		MyDate d4 = new MyDate(2022,9,21); 
		System.out.println(d4.year+"/"+d4.month+"/"+d4.day); //2022/9/21
		System.out.println("---------------------------------");
		
	}

}

			class MyDate {
				int year;
				int month;
				int day;
				
				// 기본생성자
				// Alt + Shift + S -> O
				public MyDate() {
					// 연도 : 1900, 월 : 1, 일 : 1로 초기화
					
					// 자신의 생성자 내에서 다른 오버로딩 된 생성자를 호출하는 방법 (밑에 3줄을 한줄로 줄임)
					this(1900, 1, 1); // this를 만나면 뒤에것을 매개변수로 생각해서 맞는 생성자를 찾아감
									  // 다른 실행코드보다 무조건 먼저 실행되어야함!
					System.out.println("MyDate() 생성자 호출됨");
									  // => public MyDate(int year, int month, int day
															//MyDate(int,int,int) 생성자 호출됨
															//MyDate() 생성자 호출됨
															//1900/1/1
					
//					year = 1900; // 위처럼 한줄로 표현할 수 있음
//					month = 1;
//					day = 1;
								 //=> 인스턴스 변수 초기화 코드가 다른 생성자와 중복됨
								 //   중복 제거를 위해 3개의 값을 전달받는 파라미터 생성자를 호출하여
								 //   초기화에 사용될 데이터를 전달, 초기화를 대신 수행
								 //   => 코드 중복 제거 가능
					
					
//					this(1900, 1, 1); // 컴파일 에러 발생. 무조건 먼저 실행되어야함.
									  // =>Constructor call must be the first statement in a constructor
									  // =>생성자 내의 다른 실행코드보다 아래쪽에 생성자 this()가 올 수 없다
				}
				
				// 연도(year)만 전달받고, 나머지는 1월 1일로 초기화하는 생성자
				public MyDate(int year) {
					// MyDate(int, int, int) 생성자를 호출하여
					// 전달받은 연도(year)와 1월1일의 값을 전달하여 대신 초기화
					this(year, 1, 1);
					System.out.println("MyDate(int) 생성자 호출됨");
//					this.year = year;
//					month = 1;
//					day = 1;
				}
															//MyDate(int,int,int) 생성자 호출됨
															//MyDate(int) 생성자 호출됨
															//2022/1/1
															
				// 연도(year), 월(month)을 전달받고 나머지는 1일로 초기화하는 생성자
				public MyDate(int year, int month) {
					// MyDate(int, int, int) 생성자를 호출하여
					// 전달받은 연도(year), 월(month)와 1일의 값을 전달하여 대신 초기화
					this(year,month,1);
					System.out.println("MyDate(int,int) 생성자 호출됨");
//					this.year = year;
//					this.month = month;
//					day = 1;
				}

				
				// 연도(year), 월(month), 일(day)를 전달받고 초기화하는 생성자
				public MyDate(int year, int month, int day) {
					// 주의! 모든파라미터값을 받는 오버로딩된 생성자는 this 써줘야함!!!!!
					System.out.println("MyDate(int,int,int) 생성자 호출됨");
					this.year = year;
					this.month = month;
					this.day = day;
				}
				
				
				
			}
