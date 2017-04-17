package pers.fand.practice5;

import java.util.Scanner;

public class Lower {
	public static String ZhuanHuan(String str){
		String str1=str;
		String str2=str1.toLowerCase();
		return str2;
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("ÇëÊäÈëÒ»¸ö×Ö·û´®£º ");
		String a=scan.next();
		String str3=ZhuanHuan(a);
		System.out.println(str3);
		scan.close();
	}
}
	


