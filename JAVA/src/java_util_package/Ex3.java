package java_util_package;

import java.util.Calendar;
import java.util.Date;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 *  Calender 클래스
		 *  
		 *  - 주로 날짜 및 시각을 조작하는 용도의 클래스(표현도 가능)
		 *  - 추상클래스이므로 인스턴스 생성없이 제공되는 인스턴스를 static 메서드인 getInstance() 메서드로 리턴받아 사용
		 *  - get() 메서드로 날짜 및 시각 정보를 조회하고,
		 *    set() 메서드로 날짜 및 시각 정보를 설정(조작)함
		 *    => 파라미터로 날짜 및 시각 모두 설정을 위한 상수 사용
		 * 
		 * 
		 */

//		 Calendar cal = new Calendar(); // 오류 ! 추상클래스이므로 인스턴스 생성 불가
		 Calendar cal = Calendar.getInstance(); // 현재 시스템 날짜 및 시각 정보 리턴
		 
		 // toString() 메서드가 오버라이딩 되어 있으나 식별이 어려움
		 System.out.println(cal); //java.util.GregorianCalendar[time=1666575270162,areFieldsSet=true,areAllFieldsSet=true,lenient=~~~~~~~~~~~~~~~~~~~~~
		 
		 // Calendar 인스턴스의 get() 메서드를 사용하여 정보 조회
		 // => 파라미터로 Calender.XXX 상수를 통해 가져올 정보의 종류 지정
		 int year = cal.get(Calendar.YEAR);
		 int month = cal.get(Calendar.MONTH) + 1; // 0~11까지 사용하므로 +1 필요
		 int day = cal.get(Calendar.DAY_OF_MONTH);
		 System.out.println(year+"년"+month+"월"+day+"일"); //2022년10월17일
		 
		 
		 
		 int hour = cal.get(Calendar.HOUR_OF_DAY); // 24시간제(HOUR : 12시간제)
		 int min = cal.get(Calendar.MINUTE);
		 int sec = cal.get(Calendar.SECOND);
		 
		 System.out.println(hour + ":" + min + ":" + sec); // 10:46:23
		 
		 System.out.println("===========================================");
		 
		 // Calender <-> Date로 상호 변환
		 // 1. Calender -> Date 로 변환 시
		 //	   Calender 객체의 getTime() 메서드를 호출하여 Date 타입 리턴
		 Date date = cal.getTime();
		 System.out.println(date);
		 
		 // 2. Date -> Calendar로 변환 시
		 //    Calender 객체가 존재하는 상태에서 setTime() 메서드 호출하여
		 //    Date 타입 객체를 파라미터로 전달
		 Calendar cal2 = Calendar.getInstance();
		 cal2.setTime(date);
		 
		 
		 System.out.println("============================================");
		 
		 // set() 메서드를 사용하여 날짜 및 시각 정보 전달
		 cal2.set(1994, 9, 17); // 연, 월, 일 직접 전달
		 // => 월은 0~11 값을 사용하므로 설정할 때에는 -1 필요!
		 System.out.println(cal2.getTime()); //Mon Oct 17 11:24:13 KST 1994
		 
		 
		 // 각 항목을 별도로 변경할 때는 set(int field. int value) 메서드 사용
		 // => field 항목은 get() 메서드와 마찬가지로 Calendar.XXX 상수 사용
		 cal2.set(Calendar.YEAR, 2010); // 2010년으로 설정
		 cal2.set(Calendar.MONTH, 5-1); // 5월로 설정(-1 필요) 
		 
		 Date date2 = cal2.getTime();
		 System.out.println(date2); //Mon May 17 11:23:51 KST 2010
		 
		
	}

}
