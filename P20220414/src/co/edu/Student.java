package co.edu;

public class Student {
	// 필드
	String name;
	String studentNo;
	int age;
	double height;
	
	// 생성자 > 인스턴스를 만들어줄때 처리할 기능을 정의
	// 매개값이 없는 생성자가 기본생성자
	public Student() {
		System.out.println("Student() 생성자가 호출되었습니다.");
	}
	// 생성자는 필드의 값을 지정할 때 많이 사용된다.
	public Student(String nm, String sn, int a, double he) {
		name = nm;
		studentNo = sn;
		age = a;
		height = he;
	}
	// 이름, 학번, 나이 채워주는 생성자 만들어 보기
	public Student(String nm1, String sn1) {
		name = nm1;
		studentNo = sn1;
	}
	
	// 우클릭 > 소스 > using fields 클릭
//	public Student(String name, String studentNo, int age, double height) {
//		super();
//		this.name = name;
//		this.studentNo = studentNo;
//		this.age = age;
//		this.height = height;
//	}
	
	// 메소드
	void study() {
		System.out.println(name + "가 공부를 합니다.");
	}
	void eat() {
		System.out.println(name + "가 밥을 먹습니다.");
	}
	void showInfo() {
		System.out.println("이름은 " + name + "이고, 학생번호는 " + 
				studentNo + "이고, 나이는 " + age + "이고 키는 " 
				+ height + "입니다.");
	}

}
