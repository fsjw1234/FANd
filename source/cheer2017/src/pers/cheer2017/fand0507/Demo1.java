package pers.cheer2017.fand0507;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);

		
		System.out.println("Input Score: ");
		int score=scanner.nextInt();
		
		switch(score){
		case 60:
			System.out.println("�ϸ�");
		break;
		
		case 70:
			System.out.println("��");
		break;
		
		case 80:
			System.out.println("��");
		break;
		
		case 90:
			System.out.println("��");
		break;
		default:
			System.out.println("��");
		}
		
		scanner.close();
	}
}
