package Wpn;

import java.util.Scanner;

public class QueTwo {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int a = sc.nextInt();
			System.out.print((a&1)==1?"Odd":"Even");;
		}

	}

}
