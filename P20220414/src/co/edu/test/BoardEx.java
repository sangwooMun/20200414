package co.edu.test;

import java.util.Scanner;

public class BoardEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		BoardList boardList = new BoardList();
		boardList.init(5);

		while (true) {
			System.out.println("1.추가, 2.수정, 3.목록, 4.삭제, 5.한건조회, 6.이름조회, 9.종료");
			System.out.println("선택");
			int menu = scanner.nextInt();
			scanner.nextLine();

			if (menu == 1) {
				System.out.println("글번호 입력");
				int bNo = scanner.nextInt();
				scanner.nextLine();
				System.out.println("제목입력");
				String bTitle = scanner.nextLine();
				System.out.println("내용입력");
				String bContent = scanner.nextLine();
				System.out.println("작성자입력");
				String bWriter = scanner.nextLine();
				Board newBod = new Board(bNo, bTitle, bContent, bWriter);
				int chk = boardList.addBoard(newBod);
				if (chk == 0) {
					System.out.println("정상입력");
				} else if (chk == -1) {
					System.out.println("저장공간 없음");
				} else if (chk == 1) {
					System.out.println("이미 있는 번호");
				}

			} else if (menu == 2) {
				System.out.println("수정할 번호입력");
				int bNo = scanner.nextInt();
				scanner.nextLine();
				System.out.println("변경할 제목");
				String title = scanner.nextLine();
				System.out.println("변경할 내용");
				String content = scanner.nextLine();

				Board cBoard = new Board(bNo, title, content, null);

				if (boardList.modifyBoard(cBoard)) {
					System.out.println("정상수정");
				} else {
					System.out.println("수정못함");
				}

			} else if (menu == 3) {
				Board[] boards = boardList.boardList();
				System.out.println("게시글번호   제목        내용          사용자   조회수");
				System.out.println("###################################################");
				for (Board board : boards) {
					if (board != null) {
						board.getInfo();
					}
				}

			} else if (menu == 4) {
				System.out.println("삭제할 글번호");
				int bNo = Integer.parseInt(scanner.nextLine());

				if (boardList.removeBoard(bNo)) {
					System.out.println("삭제완료");
				} else {
					System.out.println("삭제실패");
				}
			} else if (menu == 5) {
				System.out.println("조회할 글번호");
				int bNo = Integer.parseInt(scanner.nextLine());

				Board getBoard = boardList.searchBoard(bNo);
				if (getBoard == null) {
					System.out.println("조회결과가 없음");
				} else {
					getBoard.getDetailInfo();
				}
			} else if (menu == 6) {
				Board[] boards = boardList.boardList();
				System.out.println("작성자조회");
				String bWriter = scanner.nextLine();
				for (Board board : boards) {

					if (board != null) {
						board.getInfo();
					}
				}
				

			} else if (menu == 9) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("잘못입력");
			}
		}

	}

}
