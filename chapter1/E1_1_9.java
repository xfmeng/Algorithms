package chapter1;

import java.util.Scanner;

public class E1_1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E1_1_9 exercise = new E1_1_9();
		Scanner scanner = new Scanner(System.in);
		System.out.println(exercise.transfer(scanner.nextInt()));
	}

	public String transfer(int x) {
		String result = "";
		int i = 1;
		while(x != 0)
		{
			result = x % 2 + result;
			i = i * 10;
			x = x / 2;
		}
		return(result);
	}
}
