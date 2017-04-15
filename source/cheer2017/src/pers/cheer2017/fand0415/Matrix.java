package pers.cheer2017.fand0415;

public class Matrix {
	public static void main(String[] args) {
		int array[][] = new int[3][4];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
