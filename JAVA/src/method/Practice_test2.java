package method;

public class Practice_test2 {


			public static void main(String[] args) {
				// 3. 파라미터만 있고, 리턴값은 없는 메서드 호출
				//   => 문자열을 1개 전달하면 해당 문자열을 출력하는 print() 메서드
				print("이소연 연습중 잘안되네 아효");
				
				// => 정수 1개를 전달하면 해당 정수에 대해 "홀수", "짝수" 판별하는
				// 	  checkNumber() 메서드 호출
				checkNumber3(1);
				
			
				// 4. 파라미터도 있고, 리턴값도 있는 메서드 호출
				// 	  => 정수 1개를 전달하면 해당 정수에 대해 "홀수", "짝수"를 판별하는
				// 		 판별 결과 문자열을 리턴하는 checkNumber2() 메서드 호출
				String result = checkNumber4(1);

				
				
			} // main() 메서드 끝
		
			
			
			// => 문자열을 1개 전달받아 해당 문자열을 출력하는 print()메서드 정의
			// => 외부로부터 전달받은 문자열을 저장하기 위한 변수를 소괄호()안에 선언
			
			public static void print(String str) {
				System.out.println(str);
			}
			
			public static void checkNumber3(int num3) {
				if(num3%2==1){
				System.out.println(num3+" : 홀수");
				}else {
					System.out.println(num3+" : 짝수");
				}
				
			}
			
			//---------------------------------------------------
			// 4. 파라미터도 있고, 리턴값도 있는 메서드 호출
			// 	  => 정수 1개를 전달하면 해당 정수에 대해 "홀수", "짝수"를 판별하는
			// 		 판별 결과 문자열을 리턴하는 checkNumber2() 메서드 호출
			
			public static String checkNumber4(int num4) {
				String result ="";
				if(num4%2==1) {
					System.out.println(num4+" : 홀수");
				}else {
					System.out.println(num4+" : 짝수");
				}
				return result;
			}

			
			// -------------------------------------------
			// if문과 else if 문 내에서 직접 리턴하지 않고
			// 리턴 데이터를 별도의 변수에 저장만 한 뒤, if 문 종료 후 return 수행
			
//			String result = "";
//			
//			if(num % 2 == 1) { //홀수
//				result = "홀수";
//			}else if(num % 2 == 0) {
//				result = "짝수";
//			}
//			
//			return result;
//			
			
			
		}// Test2 클래스 끝
