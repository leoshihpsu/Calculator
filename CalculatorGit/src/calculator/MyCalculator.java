package calculator;

public class MyCalculator implements Calculator {

	public int add(int a,int b){
		return a + b;
	}
	public int subtract(int a,int b){
		return a - b;
	}
	public int multiply(int a,int b){
		return a*b;
	}
	public double divide(double a,double b){
		if (b==0){
			throw new IllegalArgumentException("NDP0");
		}
		return a/b;
	}
	
}
