package co.edu;
// 객체 > 도면 > 텔레비전(삼성, 엘지)
// Object > Class > Instance
// 추상화(텔레비전의 모든 속성 > 필요한 부분
// 라이브러리용 class - 다른 class에서 이용
public class Television {
	// 속성 - 필드로 정의
	String company;
	String model;
	int price;
	String color;
	
	// 기능 - 메소드로 정의(반환유형, 메소드명, 매개변수) void turnOn () > 반 메 매
	void turnOn(){
		System.out.println("텔레비전을 켜다.");
	}
	
	void trunOff(){
		System.out.println("텔레비전을 끄다.");
	}
	
	void changeChannel(int chanel){
		System.out.println(chanel + "번 채널로 변경합니다.");
	}

}
