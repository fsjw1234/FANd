package pers.cheer2017.fand0507;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);

		
		System.out.println("Input Score: ");
		int score=scanner.nextInt();
		
		switch(score){
		case 60:
			System.out.println("合格");
		break;
		
		case 70:
			System.out.println("中");
		break;
		
		case 80:
			System.out.println("良");
		break;
		
		case 90:
			System.out.println("优");
		break;
		default:
			System.out.println("差");
		}
		
		scanner.close();
	}
}
