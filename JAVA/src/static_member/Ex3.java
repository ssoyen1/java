package static_member;

public class Ex3 {

	int b = check("인스턴스 변수 b!"); // 우변값 좌변에 저장됨 . 일반적인 값저장도 되지만 메서드호출도 저장할 수 있음
									// (대응) int - int
									// 		 check - check
									//		 check("인스턴스 변수 b!") - check(String str)
	static int a = check("인스턴스 변수 a!");
	
	
	
	public static int check(String str) {
		System.out.println("check() 호출 "+str);
		return 0; //int check 인트타입 리턴이므로
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("main() 메서드 호출");
		
		Ex3 ex = new Ex3(); // ex3에 관련된 모든걸 불러옴
		System.out.println("Ex3 인스턴스 생성 완료!");
											// check() 호출 인스턴스 변수 b!
											// Ex3 인스턴스 생성 완료!

	}

	static int c = check("인스턴스 변수 c!");
										// 메인메서드 위에있든 밑에있든 순서대로 출력되는게 아니라 
										// static부터 출력됨
	
											//check() 호출 인스턴스 변수 a!
											//check() 호출 인스턴스 변수 c!
											//main() 메서드 호출
											//check() 호출 인스턴스 변수 b!
											//Ex3 인스턴스 생성 완료!

}
