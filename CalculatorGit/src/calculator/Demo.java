package calculator;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		MyCalculator my = new MyCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj pierwsz� liczb�:");
		int a = sc.nextInt();
		System.out.println("Podaj dzia�anie:");
		char d = sc.next().charAt(0);
		System.out.println("Podaj drug� liczb�:");
		int b = sc.nextInt();
		sc.close();
		
		switch(d){
			case '+': System.out.println(a + " + " + b +  " = " + my.add(a, b) ); break;
			case '-': System.out.println(a + " - " + b +  " = " + my.subtract(a, b) ); break;
			case '*': System.out.println(a + " * " + b +  " = " + my.multiply(a, b) ); break;
			case '/': System.out.println(a + " / " + b +  " = " + my.divide(a, b) ); break;
			default: System.out.println("Nieprawid�owy symbol"); 
		}
	}

}
