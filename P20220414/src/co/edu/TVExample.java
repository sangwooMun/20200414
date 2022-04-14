package co.edu;

public class TVExample {
	public static void main(String[] args) {
		// 실행할 목적으로 만든 class
		// class 구성 멤버 - 필드, 생성자, 메소드
		// 필드 - 객체 데이터 저장
		// 객체 - 객체 생성시 초기화 역할
		// 메소드 - 기능 구현
		
//		Television tv = new Television();
//		tv.company = "삼성전자";
//		tv.color = "검은색";
//		tv.price = 300000;
//		tv.model = "30inch";
//		tv.turnOn();
//		tv.changeChannel(10);
//		tv.trunOff();
//		
//		Television tv1 = new Television();
//		tv1.company = "LG전자";
//		tv1.color = "흰색";
//		tv1.price = 250000;
//		tv1.model = "28inch";
//		tv1.turnOn();
//		tv1.changeChannel(11);
//		tv1.trunOff();
//		System.out.println(tv);
//		// co.edu.Television@34ce8af7 > 34ce8af7 = 인스턴스 주소값
//		System.out.println(tv1);
//		System.out.println(tv == tv1);
		
		Student s1 = new Student();
		s1.name = "문상우";
		s1.studentNo = "22-1234567";
		s1.age = 26;
		s1.height = 173.4;
		
		Student s2 = new Student();
		s2.name = "박상우";
		s2.studentNo = "22-7654321";
		s2.age = 23;
		s2.height = 172.4;
		
		Student s3 = new Student("김상우", "22-893467", 27, 175.1);
		
		Student s4 = new Student("신상우", "22-949848");
		s4.age = 21;
		s4.height = 169.1;
		
		s1.study();
		s2.study();
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		s4.showInfo();
		
		
	}

}
