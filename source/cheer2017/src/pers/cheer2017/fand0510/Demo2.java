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
		System.out.println("��������������������� ");
		name = scan.next();
		System.out.println("��ѡ�������ĳ������ͣ�1������2�����");
		int a = scan.nextInt();
		switch (a) {
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("���");
			break;
		}
	}
}