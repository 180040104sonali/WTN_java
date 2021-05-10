package Wpn;


import java.util.Arrays;
import java.util.Scanner;

public class QueTwentyFour {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m[]=new int[n];
		for(int i=0;i<n;i++)
		{
			m[i]=sc.nextInt();
		}
		Arrays.sort(m);
		System.out.print(m[n-1]+" "+m[n-2]+" "+m[1]+" "+m[0]);
	}
}
