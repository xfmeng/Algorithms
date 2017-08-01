package chapter1;

import java.util.Scanner;

public class E1_1_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E1_1_5 exercise = new E1_1_5();
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		System.out.println(exercise.compare(x) && exercise.compare(y));
	}
	
	public boolean compare(double x)
	{
		return(x >= 0 && x <= 1);
	}

}
