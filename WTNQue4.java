package Wpn;

import java.util.Scanner;

public class QueFour {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			char a1 = sc.next().charAt(0);
			char a2 = sc.next().charAt(0);
			System.out.println(a1<a2?a1+" "+a2:a2+" "+a1);
		}

	}

}
