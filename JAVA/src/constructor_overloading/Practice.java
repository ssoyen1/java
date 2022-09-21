package constructor_overloading;

public class Practice {

	public static void main(String[] args) {
		
		Phone p = new Phone();
		p.showPhoneInfo();
		
		System.out.println("-----------------------");
								//		폰기종 : 아이폰
								//		사이즈 : 10
								//		가격 : 200
		
		
		Phone p2 = new Phone("삼성갤럭시");
		p2.showPhoneInfo();
		
		System.out.println("-----------------------");
								//		폰기종 : 삼성갤럭시
								//		사이즈 : 10
								//		가격 : 200
		
		Phone p3 = new Phone(150);
		p3.showPhoneInfo();
		
		System.out.println("-----------------------");
								//		폰기종 : 아이폰
								//		사이즈 : 10
								//		가격 : 150
		
		Phone p4 = new Phone("엘지", 20);
		p4.showPhoneInfo();
		
		System.out.println("-----------------------");
		
		
		Phone p5 = new Phone("블랙베리", 20, 100);
		p5.showPhoneInfo();
		
		System.out.println("-----------------------");
		
	}

}

class Phone {
	String name;
	int size;
	int price;
	
	public Phone() {
		name = "아이폰";
		size = 10;
		price = 200;
	}
	
	public Phone(String name) {
		this.name = name;
		size = 10;
		price = 200;
	}

	public Phone(int price) {
		
		name = "아이폰";
		this.price = price;
		size = 10;
	}

	public Phone(String name, int size) {
		this.name = name;
		this.size = size;
		price = 200;
	}

	public Phone(String name, int size, int price) {
		this.name = name;
		this.size = size;
		this.price = price;
	}
	
	public void showPhoneInfo() {
		System.out.println("폰기종 : "+name);
		System.out.println("사이즈 : "+size);
		System.out.println("가격 : "+price);
	}
	
	
	
}
