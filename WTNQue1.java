package Wpn;

import java.util.Scanner;
public class QueOne {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			System.out.println(a>0?"Positive":"Negative");
			if(a==0) {
				System.out.println("Zero");
			}
		}

	}

}

