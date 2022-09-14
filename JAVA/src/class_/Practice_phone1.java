package class_;

public class Practice_phone1 {

	public static void main(String[] args) {
				
			Practice_phone ph = new Practice_phone();
			
			ph.color = "yellow";
			ph.company = "samsung";
			ph.model = "flip";
			ph.price = 120;
			
			System.out.println("색상: "+ ph.color);
			System.out.println("회사: "+ ph.company);
			System.out.println("모델: "+ ph.model);
			System.out.println("가격: "+ ph.price);
			ph.cleanUp();
			
											//			색상: yellow
											//			회사: samsung
											//			모델: flip
											//			가격: 120
											//			메모리 정리


	}

}
