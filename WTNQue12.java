package Wpn;

import java.util.Scanner;

public class QueTwelve {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int m = sc.nextInt();
			int t= 0;
			for(int i=2;i<=Math.sqrt(m);i++) {
				if(m%i==0) {
					t++;
				}
			}
			System.out.println(t<2?"Prime":"Not Prime");
		}
	}
}
