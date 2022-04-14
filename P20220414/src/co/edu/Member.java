package co.edu;

public class Member {

	// 필드 = 회원아이디, 회원이름, 회원연락처, 회원나이
	private String id;
	private String name;
	private String phone;
	private int age;

	// 생성자
	public Member(String id, String name, String phone, int age) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	// 메소드
	void setid(String id) {
		this.id = id;
	}
	String getid() {
		return id;
	}
	
	void setAge(int age) {
		if (age < 0) {
			age = 10;
		} else {
			this.age = age;
		}
	}
	int getAge(){
		return age = 56;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	void showInfo() {
		System.out.printf("아이디 : %4s \n연락처 : %13s\n 나이 : %2d \n", id, phone, age);
	}

}
