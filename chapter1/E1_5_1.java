package chapter1;

import java.util.Scanner;

public class E1_5_1 {

	private int[] id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		E1_5_1 exercise = new E1_5_1();
		exercise.initial(10);//初始化id数组
		while(scanner.hasNextLine())//有下一行输入
		{
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int count = exercise.union(a, b);
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
	public int union(int p, int q)
	{
		int pId = id[p];
		int qId = id[q];
		int count = 2;
		if(pId == qId) return count;
		else {
			count = count + 10;
			for(int i = 0; i < id.length; i++)
			{
				if(id[i] == pId)
				{
					id[i] = qId;
					count++;
				}
			}
		}
		return count;
	}

}
