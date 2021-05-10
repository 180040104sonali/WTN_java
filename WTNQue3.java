package Wpn;

public class QueThree {
	public static void main(String args[]) {
		int le = args.length;
		if(le==0) {
			System.out.println("No Values");
		}
		else {
			for(String s : args) {
				System.out.print(s+" ");
			}
		}
	}

}
