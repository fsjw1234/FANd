package pers.fand.practice5;

import java.util.Scanner;

public class UpperAndLower1 {
	public static void main(String[] args){
		Scanner str1=new Scanner(System.in);
		System.out.print("输入你的字符串：");
		String str2=str1.next();
		//System.out.println(str2);
		String str3=str2.toUpperCase();
		System.out.println("输入子串的大写为"+str3);
		String str4=str2.toLowerCase();
		System.out.println("输入子串的小写为"+str4);
		str1.close();
	}

}
