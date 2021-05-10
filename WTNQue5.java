package Wpn;

import java.util.Scanner;

public class QueFive {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			char c = sc.next().charAt(0);
			int b = Integer.valueOf(c);
			if(b>=97 && b<=122 || b>=65 && b<=90) {
				System.out.println("Aplhabet");
			}
			else if(b>=48 && b<=57) {
				System.out.println("Digital");
			}
			else {
				System.out.println("Special Character");
			}
		}
		
	}

}
