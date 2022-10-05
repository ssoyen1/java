package polymorphism;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}



		class 병사 {
			public void 장착(무기 무기) {
				무기.장착();
			}
		}
		
		
		class 무기 {
			public void 장착() {
				System.out.println("무기를 장착하다!");
			}
		}
		
		class 칼 extends 무기 {

			@Override
			public void 장착() {
				System.out.println("칼을 장착하다!");
			}
			
		}
		
		
		class 총 extends 무기 {

			@Override
			public void 장착() {
				System.out.println("총을 장착하다!");
			}
			
		}
		
		
		class 활 extends 무기 {

			@Override
			public void 장착() {
				System.out.println("활을 장착하다!");
			}
			
		}