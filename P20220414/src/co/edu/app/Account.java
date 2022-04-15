package co.edu.app;

public class Account {
	// 필드 : 계좌번호, 예금주, 잔액
	String numbar;
	String name;
	int sum;
		
	// 생성자 :
	public Account(String numbar, String name, int sum) {
		super();
		this.numbar = numbar;
		this.name = name;
		this.sum = sum;
	}

	public String getNumbar() {
		return numbar;
	}

	public void setNumbar(String numbar) {
		this.numbar = numbar;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
	// Getter, Setter

	
	

}
