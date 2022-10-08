package interface_;

public class Test2 {

	public static void main(String[] args) {
		
		BumbleBee bb = new BumbleBee();
		
		
		bb.fight();
		
		
		if(bb.MODE_NORMAL == Transformable.MODE_NORMAL) { 
			System.out.println("기본 모드(로봇)로 변신");
		}else if(bb.MODE_CAR == Transformable.MODE_CAR) {
			System.out.println("자동차로 변신");
		} else if(bb.MODE_AIRPLANE == Transformable.MODE_AIRPLANE) {
			System.out.println("비행기로 변신");
		}
		
		
		bb.speak();

	}

}

/*
 * 전투기능을 갖는 Fightable 인터페이스
 * => fight() 메서드
 * 
 * 변신 기능을 갖는 Transformable 인터페이스
 * => transform() 메서드 (리턴값 없음, 파라미터 있는 (int mode))
 * => 상수 값(MODE_CAR = 1, MODE_AIRPLANE = 2, MODE_NORMAL = 3)
 * 
 * Robot 인터페이스 정의
 * => Fightable 인터페이스, Transformagle 인터페이스 상속
 * => 말하기 기능(speak())
 */


/*
 * Robot 인터페이스를 구현하는 BumbleBee 클래스 정의
 * => fight() 메서드 호출 시 "로켓 발사!" 출력
 * => transform() 메서드 호출 시 mode 값에 따라 다른 형태로 변신
 * 	  MODE_NORMAL일 경우 "기본 모드(로봇)로 변신" 출력
 * 	  MODE_CAR일 경우 "자동차로 변신"출력
 * 	  MODE_AIRPLANE일 경우 "비행기로 변신" 출력
 * => speak() 메서드 호출 시 "라디오로 말하기!" 출력
 */

		interface Fightable {
			
			public void fight();
			
		}
		
		
		interface Transformable {
			public static final int MODE_CAR = 1;
			int MODE_AIRPLANE = 2;
			int MODE_NORMAL = 3;
			
		}
		
		
		interface Robot extends Fightable,Transformable{
			public void speak();
		}
		
		
		
		class BumbleBee implements Robot {

			@Override
			public void fight() {
				System.out.println("로켓 발사!");
			}
			

			@Override
			public void speak() {
				System.out.println("라디오로 말하기!");
			}
			
		}
		
		