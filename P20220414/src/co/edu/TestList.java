package co.edu;

public class TestList {
	
	String name;
	String phone;
	int Age;
	
	public TestList(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		Age = age;
		
		
		
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
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	
	void TInfo() {
		System.out.println("테스트 중입니다");
	}

}
