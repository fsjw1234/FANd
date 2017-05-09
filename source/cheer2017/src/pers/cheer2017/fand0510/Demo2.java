package pers.cheer2017.fand0510;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Pet p = new Pet();
		p.lingyang();
	}

}

class Pet {
	private String name;
	private String pinzhong;

	public void lingyang() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入领养宠物的姓名： ");
		name = scan.next();
		System.out.println("请选择领养的宠物类型：1，狗。2，企鹅");
		int a = scan.nextInt();
		switch (a) {
		case 1:
			System.out.println("狗");
			break;
		case 2:
			System.out.println("企鹅");
			break;
		}
	}
}