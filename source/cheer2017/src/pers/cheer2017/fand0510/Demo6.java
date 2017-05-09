package pers.cheer2017.fand0510;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(true){
			System.out.println("请拨打一个号码： ");
		int a=scan.nextInt();
		switch(a){
		case 1:
			System.out.println("拨打爸爸的号码");
			break;
	    case 2:
		    System.out.println("拨打妈妈的号码");
		break;
	    case 3:
		    System.out.println("拨打爷爷的号码");
		break;
	    case 4:
		    System.out.println("拨打奶奶的号码");
		break;
		default:
		System.out.println("谁的号码都没拨打");
		System.exit(0);
	    }
		}
	}
}

