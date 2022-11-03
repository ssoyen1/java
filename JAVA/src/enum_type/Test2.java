package enum_type;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * enum(Week) 과 switch ~ case 문을 활용하여
		 * 평일이면(월~목) 이면 "하.."
		 * 금요일이면 "불금!"
		 * 주말이면 "주말!" 을 출력하는 코드를 작성해보자!
		 * 
		 */
		
		
		Week week = Week.WED;
		switch(week) {
		case MON   : 
		case TUE   : 
		case WED   : 
		case THU   : System.out.println("하..");break;
		case FRI   : System.out.println("불금!");break;
		case SAT   : 
		case SUN   : System.out.println("주말!");break;
		}
	}

}

// enum type 'Week' 정의
// => 각 요일의 앞 세글자를 대문자로 구성


		enum Week {
			MON,TUE,WED,THU,FRI,SAT,SUN
		}
