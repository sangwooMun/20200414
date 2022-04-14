package co.edu;

public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.name = "문상우";
		s1.height = 173;
		
		System.out.println("이름 : " + s1.name);
		System.out.println("키 : " + s1.height);
		
		TestList t1 = new TestList("문상우","010-111-111",26);
		System.out.println();
		t1.TInfo();
		
	}

}
