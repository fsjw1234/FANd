package pers.fand.practice5;

public class Sbuilder {
	public static void main(String args[]) {
		StringBuilder str = new StringBuilder("hello");
		for (int i = 1; i <= 10; i++) {
			StringBuilder str1 = str.append(i);
			//System.out.println(str1.toString());
			if (i == 10) {
				System.out.println(str1.toString());
			}
		}
	}
}
