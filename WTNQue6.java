package Wpn;

public class QueSix {

	public static void main(String[] args) {
		if(args.length== 2) {
			if(args[0].equals("Male")) {
				int b = Integer.parseInt(args[1]);
				if(b>1 && b<58) {
					System.out.println("8.4%");
				}
				else if(b>59 && b<100) {
					System.out.println("10.5%");
				}
			}
			else if(args[0].equals("Female")) {
				int b = Integer.parseInt(args[1]);
				if(b>1 && b<58) {
					System.out.println("8.2%");
				}
				else if(b>59 && b<100) {
					System.out.println("9.2%");
				}
			}
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
