package co.edu.test;

public class CalExample {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		
		c1.printPI();
		c1.getArea(2.5);
		
		int result = c1.sum(10, 20);
		System.out.println(result);
		
		int[] intAry = {10, 20, 30, 40, 50};
		result = c1.sum(intAry);
		System.out.println(result);
		
		double result1 = c1.average(10, 2, 3, 4,5,6 , 6, 7, 7);
		System.out.println(result1);
		
		
		
	}

}
