package interface_;

public class Ex5 {

	public static void main(String[] args) {
		// 4. 모듈간 독립적 프로그래밍으로 인한 개발 기간 단축
		DesignerClient desinger = new DesignerClient();
		desinger.login();
		
		System.out.println("-------------------");
		
		DeveloperClient developer = new DeveloperClient();
		developer.login();

	}

}

// 개발자와 디자이너 사이의 규칙을 인터페이스로 정의
interface LoginProcess {
	// 공통 기능으로 login() 메서드를 정의하여 파라미터와 리턴타입 지정
	public abstract String login(String id, String pass);
}

// 디자이너의 경우
// => 로그인 처리 과정은 중요하지 않고 전달 데이터와 리턴 데이터만 중요함
// => LoginProcess 인터페이스를 구현하는 클래스를 정의하여
//    login() 메서드 구현
class Designer implements LoginProcess {

	@Override
	public String login(String id, String pass) {
		// 메서드에 전달되는 데이터가 정확한지만 확인하고
		// 리턴값이 외부로 잘 전달되는지만 확인하면 된다!
		System.out.println("디자이너가 전달받은 아이디 : " + id);
		System.out.println("디자이너가 전달받은 패스워드 : " + pass);
		return "성공";
	}
}

class DesignerClient { // 디자이너
	Designer designer = new Designer();
	
	public void login() {
		String id = "admin";
		String pass = "1234";
		// login() 메서드를 호출하여 파라미터로 아이디, 패스워드를 전달하고
		// 로그인 결과로 리턴되는 값을 출력하여 확인 작업 수행
		String result = designer.login(id, pass);
		System.out.println("로그인 결과 : " + result);
		
		if(result.equals("성공")) {
			// 로그인 성공 페이지로 이동 처리 작업 수행
		} else {
			// 로그인 실패 페이지로 이동 처리 작업 수행
		}
		
	}
}

// 개발자의 경우
// => 전달받은 값은 중요하지 않고 전달받은 값을 사용하여 로그인 처리 작업 수행
//    로그인 처리 후 리턴되는 값이 정상적으로 전달되는지만 확인
// => LoginProcess 인터페이스를 구현하는 Develper 클래스 정의

class Developer implements LoginProcess {
	
	// 추상 메서드 구현 필수!
	@Override
	public String login(String id, String pass) {
		// 디자이너로부터 전달받은 아이디와 패스워를 사용하여
		// 로그인 작업을 처리한 후 "성공" 또는 "실패" 문자열 리턴
		System.out.println("개발자가 전달받은 아이디 : " + id);
		System.out.println("개발자가 전달받은 패스워드 : " + pass);
		
		System.out.println("아이디와 패스워드로 로그인 작업 처리 완료!");
		return "성공";
	}
}

class DeveloperClient {
	Developer developer = new Developer();
	
	public void login() {
		// 디자이너가 전달하게 될 아이디와 패스워드를 임의로 설정하여 전달하고
		// 개발자 코드를 통해 로그인 작업을 수행한 후
		// 리턴되어지는 값이 정상적인지만 확인하면 된다
		String result = developer.login("admin", "1234");
		System.out.println("로그인 결과 : " + result);
	}
}














