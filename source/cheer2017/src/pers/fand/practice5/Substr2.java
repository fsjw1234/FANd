package pers.fand.practice5;

import java.util.Scanner;

public class Substr2 {
	
	public static String  JieQu(String zifuchuan){
		String a=zifuchuan;
		String b=a.substring(0,3);
		return b;
		
	}
	
	
	public static void main(String args[]){
		Scanner str1=new Scanner(System.in);
		System.out.print("输入第一个字符串： ");
		String str3=str1.next();
		String str5=JieQu(str3);
		//String Str5=str3.substring(0, 3);
		System.out.println(str5);
		
		Scanner str2=new Scanner(System.in);
		System.out.print("输入第二个字符串： ");
		String str4=str2.next();
		String str6=JieQu(str4);
		//String Str6=str4.substring(0, 3);
		System.out.println(str6);
		
		if(str5.equals(str6)){
			System.out.println("两个子串相同");
		}else{
			System.out.println("两个子串不同");
		}
		str1.close();
		str2.close();
	}

}
