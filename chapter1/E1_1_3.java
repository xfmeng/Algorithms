package chapter1;

import java.util.Scanner;

public class E1_1_3 {
	
	public boolean equals(int a, int b, int c)
	{
		return(a == b && b == c && a == c);
	}
	
	public static void main(String[] args) {
		E1_1_3 exercise = new E1_1_3();
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if(exercise.equals(a, b, c))
		{
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
	}
}
