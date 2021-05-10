package Wpn;

import java.util.Scanner;

public class Que14 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			boolean flag = false;
			for (int k = 2; k <= a / 2; ++k) {
				if (a % k == 0) {
					flag = true;
					break;
				}
			}

			if (!flag)
				System.out.println(a + " is a prime number.");
			else
				System.out.println(a + " is not a prime number.");
		}
	}
}
