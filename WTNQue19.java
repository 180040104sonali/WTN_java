package Wpn;

public class Que19 {

	public static void main(String[] args) {
		int m = 0;
		for (int j = 1; m < 5; j++) {
			if (j % 2 == 0 && j % 3 == 0 && j % 5 == 0) {
				System.out.println(j + " ");
				m++;
			}
		}
	}

}
