package chapter1;

import java.util.Scanner;
import java.util.logging.Level;

public class E1_5_2 {
	static int count;
	private int[] id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		E1_5_2 exercise = new E1_5_2();
		exercise.initial(10);//初始化id数组
		while(scanner.hasNextLine())//有下一行输入
		{
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			count = exercise.union(a, b);
			for(int i = 0; i < 10; i++)
			{
				System.out.print(exercise.id[i]);
				if(i != 9) System.out.print(" ");
			}
			System.out.println();
			System.out.println(count);

		}
	}
	
	public void initial(int N)
	{
		id = new int[N];
		for(int i = 0; i < N; i++)
		{
			id[i] = i;
		}
	}
	public int findRoot(int x)
	{
		count++;
		while(x != id[x])
		{
			x = id[x];
			count++;
		}
		return x;
	}
	public int union(int p, int q)
	{
		count = 0;
		int pRoot = findRoot(p);
		int qRoot = findRoot(q);
		if(pRoot == qRoot) return count;
		else {
			id[pRoot] = qRoot;
			count++;
		}
		return count;
	}

}
