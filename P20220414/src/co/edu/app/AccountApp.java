package co.edu.app;

import java.util.Scanner;

public class AccountApp {

	Account[] accounts = new Account[100]; // 계좌정보를 저장하기 위한 배열
	Scanner scanner = new Scanner(System.in);

	public void execute() {
		while (true) {
			System.out.println("메뉴 : 1.계좌생성 2.계좌목록 3.입금 4.출금 5.종료");
			System.out.println("번호를 입력하세요.");
			int menu = scanner.nextInt();
			scanner.nextLine();

			if (menu == 1) {
				createAccount();
			} else if (menu == 2) {
				accountList();
			} else if (menu == 3) {
				deposit();
			} else if (menu == 4) {
				withdraw();
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("");
			}
		}
	}

	// 계좌생성 시 실행할 메소드
	public void createAccount() {
		System.out.println("======");
		System.out.println("계좌생성");
		System.out.println("======");
		System.out.println("계좌를 생성하실 본인의 이름을 입력하세요.");
		String name = scanner.nextLine();
		System.out.println("생성할 계좌번호를 입력하세요.");
		String number = scanner.nextLine();
		System.out.println("입금할 금액을 입력하세요.");
		int sum = scanner.nextInt();

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = new Account(number, name, sum);
				System.out.println("생성된 계좌번호");
				System.out.println(number + " " + name + " " + sum);
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}

	// 입글처리 시 실핼할 메소드
	public void deposit() {
		System.out.println("======");
		System.out.println("계좌목록");
		System.out.println("======");
		System.out.println("입금할 계좌번호를 입력하세요.");
		String number = scanner.nextLine();
		System.out.println("입금할 금액을 입력하세요.");
		int cash = scanner.nextInt();
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null && accounts[i].numbar.equals(number)) {
				accounts[i].setSum(accounts[i].getSum() + cash) ;
			}
		}
		
	}

	// 출금처리 시 실행할 메소드
	public void withdraw() {
		System.out.println("출금할 계좌번호를 입력하세요.");
		String number = scanner.nextLine();
		System.out.println("출금할 금액을 입력하세요.");
		int money = scanner.nextInt();
		for(int i=0; i<accounts.length; i++) {
			if(accounts[i] != null && accounts[i].numbar.equals(number)) {
				accounts[i].setSum(accounts[i].getSum() - money);
			}
		}

	}

	// 전체목롤 실행 메소드
	public void accountList() {
		System.out.println("======");
		System.out.println("계좌목록");
		System.out.println("======");
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				break;
			}
			System.out.println("계좌번호 : " + accounts[i].getNumbar());
			System.out.println("예금액 : " + accounts[i].getSum()); 
			System.out.println("============");
					
		}
	}
	

}
