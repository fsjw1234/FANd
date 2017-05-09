package pers.cheer2017.fand0510;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("石头剪刀布的猜拳游戏");
		while (true) {
			System.out.println("请输入你想的数字1-3");
			int a = scan.nextInt();
			int b = (int) (Math.random() * 3+1);
			String a1 = "你的出拳";
			String b1 = "系统的出拳";
			switch (a) {
			case 1:
				a1 = "石头";
				break;
			case 2:
				a1 = "剪刀";
				break;
			case 3:
				a1 = "布";
				break;
			case 0:
				a1 = "石头";
				System.exit(0);
			}
			
			switch (b) {
			case 1:
				b1 = "石头";
				break;
			case 2:
				b1 = "剪刀";
				break;
			case 3:
				b1 = "布";
				break;
			}
			
			if (a == b) {
				System.out.println("你出的是: " + a1 +","+ "系统出的是: " + b1);
				System.out.println("平局");
			} else if (a>b) {
				System.out.println("你出的是: " + a1 +","+ "系统出的是: " + b1);
				System.out.println("你赢了");
			} else{
				System.out.println("你出的是: " + a1 +","+ "系统出的是: " + b1);
				System.out.println("你输了");
			}
			System.out.println("想结束，请按0");
		}
	}
}
