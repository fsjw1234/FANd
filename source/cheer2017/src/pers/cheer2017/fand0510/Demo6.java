package pers.cheer2017.fand0510;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.println("�벦��һ�����룺 ");
		int a=scan.nextInt();
		switch(a){
		case 1:
			System.out.println("����ְֵĺ���");
			break;
	    case 2:
		    System.out.println("��������ĺ���");
		break;
	    case 3:
		    System.out.println("����үү�ĺ���");
		break;
	    case 4:
		    System.out.println("�������̵ĺ���");
		break;
		default:
		System.out.println("˭�ĺ��붼û����");
		System.exit(0);
	    }
		}
	}
}

