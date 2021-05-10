package Wpn;

import java.util.Scanner;

public class QueTwentyOne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int b[]=new int[m];
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		int min=b[0],max=b[1];
		for(int j=0;j<m;j++)
		{
			if(b[j]>max)
			{
				max=b[j];
			}
			if(b[j]<min)
			{
				min=b[j];
			}
		}
		System.out.print(max+" "+min);
	}
}
