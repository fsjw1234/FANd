package pers.cheer2017.fand0415;

import java.util.Scanner;

public class ScanNumber {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("请输入一个数值");
		
		String str1 = scan.next();
		System.out.println(str1);
		scan.close();	
	}
}
