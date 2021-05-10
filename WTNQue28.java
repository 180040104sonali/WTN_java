package Wpn;

public class QueTwentyEight {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		n[0][0]=Integer.parseInt(args[0]);
		n[0][1]=Integer.parseInt(args[1]);
		n[1][0]=Integer.parseInt(args[2]);
		n[1][1]=Integer.parseInt(args[3]);
		if(args[0]==null || args[1]==null || args[2]==null || args[3]==null)
		{
			System.out.print("Please enter 4 integer numbers");
			return;
		}
		int m[][]=new int[2][2];
		m[0][0]=n[1][1];
		m[0][1]=n[1][0];
		m[1][0]=n[0][1];
		m[1][1]=n[0][0];
		System.out.println(m[0][0]+" "+m[0][1]);
		System.out.println(m[1][0]+" "+m[1][1]);
	}

}
