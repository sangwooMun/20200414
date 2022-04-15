package co.edu.statics;

public class PerExam {

	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "홍길동");
		p1.name = "김길동";
//		p1.ssn = "123452-3123123";
		
		Person p2 = new Person("12345-12314", "김길동");
		System.out.println(p2.name + p2.ssn);
	}

}
