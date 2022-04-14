package co.edu.test;

public class Calculator {
	private double pi = 3.14;
	
	void printPI() {
		System.out.println("원주율 : " +pi);
	}
	void getArea(double readius) {
		double area = pi * readius * readius;
		System.out.println(readius + "의 넓이는" + area);
	}
	
	int sum(int num1, int num2) {
		return num1 + num2;
	}
	int getArea1(int num3,int num4) {
		return num3 + num4 /2;
	}
	
	
	int sum(int[] ary) {
		int sum = 0;
		for(int i=0; i<ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
	
	double average(int... args) {
		int sum = 0;
		for(int i=0; i<args.length; i++) {
			sum += args[i];
		}
		return (double)sum/args.length;
	}
}
