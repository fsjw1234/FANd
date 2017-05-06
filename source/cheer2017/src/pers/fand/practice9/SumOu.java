package pers.fand.practice9;

public class SumOu {

	public static int getOu(int num1, int num2) {
		int s = (int) (num1 + (Math.random() * (num2 - num1)));
		if (s % 2 == 0) {
			return s;
		} else
			return s + 1;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			System.out.print(getOu(2, 32) + ",");
		}
	}
}
