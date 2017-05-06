package pers.cheer2017.fand0430;

public class Array {

	public static void main(String[] args) {
		int[] arr = { 32, 54, 31, 131 };
		int max = getMax(arr);
		System.out.println("max=" + max);
	}
	public static int getMax(int[] arr) {
		int maxIndex = 0;
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > arr[maxIndex]) {
				maxIndex = x;
			}
		}
		return arr[maxIndex];
	}
}
