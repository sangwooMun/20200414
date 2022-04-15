package co.edu.test;

public class BoardList {
	private Board[] boards;

	public void init(int size) {
		boards = new Board[size];
	}

	public int addBoard(Board board) {
		int errorCase = -1;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i] != null && boards[i].getBoardNo() == board.getBoardNo()) {
				errorCase = 1;
				break;
			}
			if(boards[i] == null) {
				boards[i] = board;
				errorCase = 0;
				break;
			}
		}
			return errorCase;
	}

	// 수정
	public boolean modifyBoard(Board board) {
		boolean check = false;
		for (int i = 0; i < boards.length; i++) {
			if (boards[i].getBoardNo() == board.getBoardNo()) {
				boards[i].setContent(board.getContent());
				boards[i].setTitle(board.getTitle());
				check = true;
				break;
			}
		}
		return check;
	}
	// 삭제
	public boolean removeBoard(int bNo) {
		boolean check = false;
		for(int i=0; i<boards.length; i++) {
			if(boards[i].getBoardNo() == bNo) {
				boards[i] = null;
				check = true;
				break;
			}
		}
		return check;
	}
	
	// 한건조회 게시글 번호
	public Board searchBoard(int bNo) {
		for(int i=0; i<boards.length; i++) {
			if(boards[i].getBoardNo() == bNo) {
				int currentCnt = boards[i].getSearchCnt();
				boards[i].setSearchCnt(currentCnt + 1);
				return boards[i];
			}
		}
		return null;
	}
	
	// 목록
	public Board[] boardList() {
		return boards;
	}

	// 작성자조회
	public Board[] searchWrBoard(String Writer) {
		Board[] wr = new Board[5];
		
		for(int i=0; i <boards.length; i++) { // 찾을 대상 배열
			if(boards[i] != null && boards[i].getWriter().equals(Writer)) {
				for(int j=0; j<wr.length; j++) { // 이름 조회해 반환할 배열
					if(wr[j] == null) {
						wr[j] = boards[i];
						break;
					}
				}
//				return boards;
			}
		}
		return wr;
	}

	
}
