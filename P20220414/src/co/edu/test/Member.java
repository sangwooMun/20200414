package co.edu.test;

import java.nio.channels.MembershipKey;
import java.util.Scanner;

public class Member {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		MemberEx[] members = new MemberEx[3];

		for (int i = 0; i < members.length; i++) {
			System.out.println("아이디 이름 연락처 나이 입력");
			String id = scanner.next();
			String name = scanner.next();
			String phone = scanner.next();
			int age = Integer.parseInt(scanner.next());
			MemberEx member = new MemberEx(id, name, phone, age);

			members[i] = member;
		}

		while (true) {
			System.out.println("1. 이름조회, 2. 아이디, 연락처 변경, 3. 나이 큰 조회 4. 종료");
			System.out.println("선택");
			int menu = scanner.nextInt();
			scanner.nextLine();

			if (menu == 1) {
				System.out.println("이름입력");
				String name = scanner.next();
				for (int i = 0; i < members.length; i++) {
					if (members[i].getName().equals(name)) {
						System.out.println("이름 : " + members[i].getName());
						System.out.println("아이디 : " + members[i].getId());
						System.out.println("나이 : " + members[i].getAge());
						System.out.println("폰번 : " + members[i].getPhone());
					}
				}
			} else if (menu == 2) {
				System.out.println("아이디 입력");
				String id = scanner.next();
				System.out.println("연락처 입력");
				String phone = scanner.next();

				for (int i = 0; i < members.length; i++) {
					if (members[i].getId().equals(id)) {
						members[i].setPhone(phone);
					}
				}
			} else if (menu == 3) {
				System.out.println("나이조회");
				int age = scanner.nextInt();
				scanner.nextLine();
				for (int i = 0; i < members.length; i++) {
					if (members[i].getAge() > age) {
						members[i].showInof();
					}
				}

			} else if (menu == 4) {
				System.out.println("종료");
				break;

			} else {
				System.out.println("잘못입력");
			}
		}

	}

}
