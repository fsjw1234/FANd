package pers.cheer2017.fand0510;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("ʯͷ�������Ĳ�ȭ��Ϸ");
		while (true) {
			System.out.println("���������������1-3");
			int a = scan.nextInt();
			int b = (int) (Math.random() * 3+1);
			String a1 = "��ĳ�ȭ";
			String b1 = "ϵͳ�ĳ�ȭ";
			switch (a) {
			case 1:
				a1 = "ʯͷ";
				break;
			case 2:
				a1 = "����";
				break;
			case 3:
				a1 = "��";
				break;
			case 0:
				a1 = "ʯͷ";
				System.exit(0);
			}
			
			switch (b) {
			case 1:
				b1 = "ʯͷ";
				break;
			case 2:
				b1 = "����";
				break;
			case 3:
				b1 = "��";
				break;
			}
			
			if (a == b) {
				System.out.println("�������: " + a1 +","+ "ϵͳ������: " + b1);
				System.out.println("ƽ��");
			} else if (a>b) {
				System.out.println("�������: " + a1 +","+ "ϵͳ������: " + b1);
				System.out.println("��Ӯ��");
			} else{
				System.out.println("�������: " + a1 +","+ "ϵͳ������: " + b1);
				System.out.println("������");
			}
			System.out.println("��������밴0");
		}
	}
}
