package co.edu;

public class Calculator {
	private double pi = 3.14;
	
	// 리턴타입 없는것 // 1.
	void printPI() {
		System.out.println("원주율 : " + pi);
	} 
	void getArea(double radius) {
		double area = pi * radius * radius;
		System.out.println("반지름 " + radius + "의 넓이는 " + area);
	}
	
	// 2.
	// 리턴타입 있는것
	// 메소드의 오버로딩 > 동일한 이름의 메소드를 - 매게변수 갯수나, 타입이 달라야 함
	int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	double sum(double n1, double n2) {
		return n1 + n2;
	}
	//3.
	// 밑변과 높이를 입력 받아 삼각형의 넓이를 계산하는 메소드 만들기.
	// getTriangleArea double 타입
	double getTriangleArea(double num3, double num4) {
		return num3 * num4 / 2.0;
	}
	//4.
	// 매개변수 클래스, 배열,
	int sum(int[] ary) {
		int sum = 0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
	//5.
	// 평균을 계산
	double average(int n1, int n2, int n3){
		return n1 + n2 + n3 /3.0;
	}
	//6.
	// 계산할 갯수가 많을때
	double average(int... args) {
		int sum = 0;
		for(int i=0; i<args.length; i++) {
			sum +=args[i];
		}
		return (double)sum/args.length;
		
	}
}
