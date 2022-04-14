package co.edu;

import java.util.Scanner;

public class MemberEx {

	public static void main(String[] args) {

//		Member m1 = new Member("user1","사용자1","010-1234-4321",26);
////		m1.age = 25;
////		m1.setAge(30);
//		m1.setid("user001");
//		m1.setName("상용장1");
//		System.out.println(m1.getAge());
//		System.out.println(m1.getid());
//		System.out.println(m1.getName());
//		System.out.println(m1.getPhone());
//		m1.showInfo();

		Scanner scanner = new Scanner(System.in);

		Member[] members = new Member[3];
		// 사용자가 값을 입력하는 기능
		for (int i = 0; i < members.length; i++) {
			System.out.println("아아디 이름 연락처 나이 입력.");
			String id = scanner.next();
			String name = scanner.next();
			String phone = scanner.next();
			int age = Integer.parseInt(scanner.next());
			Member newMember = new Member(id, name, phone, age);

			members[i] = newMember;
		}
		// 1. 조회(이름), 2. 변경(아이디, 연락처), 3. 조회(나이 큰 회원) 4. 종료
		while (true) {
			System.out.println("1. 조회(이름), 2. 변경(아이디, 연락처), 3. 조회(나이 큰 회원) 4. 종료");
			System.out.println("선택하세요.");
			int menu = scanner.nextInt();
			scanner.nextLine();

			if (menu == 1) {
				System.out.println("이름 입력");
				String name = scanner.next();
				for(Member member : members) {
					if(member.getName().equals(name)) {
						 System.out.println("이름 : " + member.getName());
						 System.out.println("아이디 : " + member.getid());
						 System.out.println("나이 : " + member.getAge());
						 System.out.println("폰번호 : " + member.getPhone());
					}
				}
				
			} else if (menu == 2) {
				System.out.println("아이디 입력");
				String id = scanner.next();
				System.out.println("연락처 입력");
				String phone = scanner.next();
				
				for(Member member : members) {
					if(member.getid().equals(id)) {
						member.setPhone(phone);
						
					}
				}

			} else if (menu == 3) {
				System.out.println("조회");
				int age = scanner.nextInt();
				scanner.nextLine();
				for(Member member : members) {
					if(member.getAge() > age) {
						member.showInfo();
					}
				}
				

			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				for (Member member : members) {
					member.showInfo();
				}
			}
		}
		System.out.println("end of porg");
	}

}
