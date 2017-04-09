package pers.fand.practice4;

public class Diamond {
	public static void main(String args[]) {
		for (int i = 1; i < 3; i++) {
			for (int j = 1; j < 4 - i; j++)
				System.out.print(" ");
			for (int k = 1; k < 2 * i; k++)
				System.out.print("*");
			System.out.println();
		}
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < i; j++)
				System.out.print(" ");
			for (int k = 1; k < 8 - 2 * i; k++)
				System.out.print("*");
			System.out.println();
		}
	}
}