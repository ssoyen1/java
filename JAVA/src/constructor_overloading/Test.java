package constructor_overloading;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDate d1 = new MyDate(9,19);
		System.out.println(d1.year+"/"+d1.month+"/"+d1.day);

		
		MyDate d2 = new MyDate(19);
		System.out.println(d2.year+"/"+d2.month+"/"+d2.day);
		
		MyDate d3 = new MyDate(1999,1,1);
				System.out.println(d3.year+"/"+d3.month+"/"+d3.day);
	}

}

/*
 * 날짜를 관리하는 MyDate 클래스 정의
 * - 멤버변수 : 연도(year, 정수), 월(month, 정수), 일(day, 정수)
 * - 생성자 
 *   1) 기본 생성자 : 1999년 1월 1일로 초기화
 *   2) 파라미터 생성자
 *   	2-1. 연도(year)를 전달받아 초기화하고, 9월 19일로 초기화
 *   	2-2. 연도(year), 월(month)을 전달받아 초기화하고, 19일로 초기화
 *   	2-3. 연도(year), 월(month), 일(day)을 전달받아 초기화
 *   
 *   생성자 자동 단축기 : Alt + Shift + S -> O
 */
 
		class MyDate {
			int year;
			int month;
			int day;
			
			public void MyDate(int newYear, int newMonth, int newDay) {
				System.out.println("MyData() 생성자 호출됨!");
				this.year = 1999;
				this.month = 1;
				this.day = 1;
			}

		
	
		//2-1. 연도(year)를 전달받아 초기화하고, 9월 19일로 초기화
		public MyDate(int newYear) {
			year = newYear;
			month = 1;
			day = 1;
		}
		//2-2. 연도(year), 월(month)을 전달받아 초기화하고, 19일로 초기화
		public MyDate(int newYear, int newMonth) {
			year = newYear;
			month = newMonth;
			day = 1;
		}
		
		//2-3. 연도(year), 월(month), 일(day)을 전달받아 초기화
		public MyDate(int newYear, int newMonth, int newDay) {
			year = newYear;
			month = newMonth;
			day = newDay;
		}

}
		
		
		