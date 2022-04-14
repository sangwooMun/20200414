package co.edu.test;

public class MemberEx {
	//필드
	private String id;
	private String name;
	private String phone;
	private int age;
	
	
	//생성자
	public MemberEx(String id, String name, String phone, int age) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.age = age;
	}
	
	//메소드
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(age < 10) {
			age = 10;
		}else {
			this.age = age;			
		}
	}
	
	void showInof() {
		System.out.printf("아이디 : %4s \n연락처 : %13s\n 나이 : %2d \n", id, phone, age);;
	}
	
}
