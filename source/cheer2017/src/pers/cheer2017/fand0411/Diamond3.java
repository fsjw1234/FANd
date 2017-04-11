package pers.cheer2017.fand0411;

public class Diamond3 {
	public static void main(String args[]) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i > 1 & i < 5) {
					if (j > 1 & j < 5) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();// 在i循环结束时换行继续下一个i循环
		}
	}
}
