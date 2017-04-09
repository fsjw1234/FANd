package pers.fand.practice4;

public class JieCheng2 {

	public static void main(String args[]) {
		int sum = 1;
		int sumA = 0;
		
		for (int i = 1; i < 5; i++) {
			sum = sum * i;
			sumA = sum + sumA;
		}
		System.out.println(sumA);
	}
}