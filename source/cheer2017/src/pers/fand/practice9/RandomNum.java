package pers.fand.practice9;

public class RandomNum {
	public static void getNum(int num1, int num2) {
		int sum = 0;
		for (int i = 1; i <= 6; i++) {
			int s = (int) (num1) + (int) (Math.random() * (num2 - num1));
			if (s % 2 == 0) {
				System.out.println(s);
			} else {
				System.out.println(s=(s + 1));
			}
			sum=sum+s;
		}
		 System.out.println(sum);
	}

	public static void main(String[] args) {
		getNum(2, 32);
	}

}
