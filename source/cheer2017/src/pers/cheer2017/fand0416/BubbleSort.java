package pers.cheer2017.fand0416;

public class BubbleSort {
	public static void main(String[] args) {
		int value[] = new int[] { 8, 39, 17, 78, 82, 52 };
		for (int i = 1; i < value.length; i++) {
			for (int j = 0; j < value.length - i; j++) {
				if (value[j] > value[j + 1]) {
					int temp = value[j];
					value[j] = value[j + 1];
					value[j + 1] = temp;
				}
			}
		}
		// showArray(value);

		// public static void showArray(int[] value) {
		// TODO Auto-generated method stub
		for (int i : value) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}