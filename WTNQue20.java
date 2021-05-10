package Wpn;

import java.util.Scanner;

public class QueTwenty {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
			s=s+b[i];
		}
		double avg=s/n;
		System.out.print(s+" "+avg);
	}

}
