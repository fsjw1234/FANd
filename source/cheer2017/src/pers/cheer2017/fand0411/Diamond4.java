package pers.cheer2017.fand0411;

public class Diamond4 {
	public static void main(String args[]) {
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 4 - i || j == i + 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for (int i = 1; i <= 2; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == i+1 || j ==5-i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
