package abstract_;

public class Test2 {

	public static void main(String[] args) {
			
//			Vehicle v = new Vehicle(); // 인스턴스 생성 불가 ! 
		
			// 추상클래스 Vehicle 타입을 참조변수로 활용
			Vehicle v = new ElectricCar();
			v.addFuel();
			v.reportPosition();
			
			v = new DieselCar();
			v.addFuel();
			v.reportPosition();
			
			

	}

}


/*
 * Vehicle 클래스 정의
 * - 멤버변수 : curX, curY 현재 좌표를 저장하는 변수
 * - 메서드 : reportPosition(리턴타입X, 매개변수X)
 * 			 => "현재 위치 : curX, curY"
 * 			addFuel( 리턴타입 X, 매개변수X)
 * 			=> 차량마다 연료 공급 방법이 달라지므로 오버라이딩을 해야하며
 * 			   오버라이딩 강제성을 부여함
 */

// Vehicle 클래스를 상속받는 ElectricCar, DiselCar 클래스 정의
// => ElectricCar 의 addFuel() : "전기차 충전소에서 배터리 충전!"
// => DieselCar의 addFuel() :  "주유소에서 디젤 연료 공급!"



 			abstract class Vehicle {
 				int curX;
 				int curY;
 				
 				public abstract void reportPosition(); {
 					System.out.println("현재 위치 : "+curX+", "+ curY);
 				}
 				
 				public abstract void addFuel(); {
 					System.out.println("현재 위치 : "+curX+", "+ curY);
 				}
 				
 			}
 			
 			
 			class ElectricCar extends Vehicle {


				@Override
				public void addFuel() {
					System.out.println("전기차 충전소에서 배터리 충전!");
				}

				@Override
				public void reportPosition() {
					
				}
 			}
 			
 			
 			
 			class DieselCar extends Vehicle {
 				
				@Override
				public void addFuel() {
					System.out.println("주유소에서 디젤 연료 공급!");
				}

				@Override
				public void reportPosition() {
				}
 				
 			}
 			
 			
 			
 			
 			
 			
 			
 			
 			