package pers.fand.practice5;

import java.util.Scanner;

public class Upper {
	public static String ZhuanHuan(String str) {
		String Str1=str;
		String Str2=Str1.toUpperCase();
	   //v  String Str3=Str1.toLowerCase();
		return Str2;
		

	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.print("ÇëÊäÈëÒ»¸ö×Ö·û´®£º ");
		String a=scan.next();
		String str4=ZhuanHuan(a);
		System.out.println(str4);
		scan.close();
	}

}
