package Wpn;

import java.util.Scanner;

public class Que16 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int k = sc.nextInt();
			for(int i =0;i<k;i++) {
				for(int j =0;j<=i;j++) {
					System.out.print(" * ");
				}
				System.out.println("");
			}
		}
		
	}

}
