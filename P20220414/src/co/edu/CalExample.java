package co.edu;

public class CalExample {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		//1/
		c1.printPI();
		c1.getArea(2.4);
		//2.
		int result = c1.sum(30, 20);
		System.out.println("두수의 합 : " + result);
		double result1 = c1.sum(12.5, 31.1);
		System.out.println("두수의 합 : " + result1);
		//3.
		result1 = c1.getTriangleArea(24.1, 15.5);
		System.out.println(result1);
		
		//4.
		int[] intAry = {10, 20, 30, 40};
		result = c1.sum(intAry);
		System.out.println(result);
		//5.
		result1 = c1.average(10, 20, 30);
		System.out.println(result1);
		//6.
		result1 = c1.average(10, 20, 30, 40, 50, 60, 70, 80);
		System.out.println(result1);
	}

}
